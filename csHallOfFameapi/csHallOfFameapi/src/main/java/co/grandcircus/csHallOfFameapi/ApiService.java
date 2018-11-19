package co.grandcircus.csHallOfFameapi;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.csHallOfFameapi.model.Inventor;
import co.grandcircus.csHallOfFameapi.model.InventorResponse;
import co.grandcircus.csHallOfFameapi.model.TinyInventor;
import co.grandcircus.csHallOfFameapi.model.TinyInventorResponse;

@Component
public class ApiService {
	
	private RestTemplate restTemplateWithUserAgent;
	
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<TinyInventor> getTinyList(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		TinyInventorResponse response = restTemplateWithUserAgent.getForObject(url, TinyInventorResponse.class);
		
		return response.getTinyList();
		
	}
	
	public List<Inventor> getCompleteList(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";	
		
		InventorResponse response = restTemplateWithUserAgent.getForObject(url, InventorResponse.class);
		
		return response.getComplete();
	}
}
