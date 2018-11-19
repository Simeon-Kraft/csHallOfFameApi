package co.grandcircus.csHallOfFameapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.csHallOfFameapi.model.Inventor;
import co.grandcircus.csHallOfFameapi.model.TinyInventor;

@Controller
public class HoFController {

	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping("/tiny")
	public ModelAndView tinyList() {
		List<TinyInventor> list = apiService.getTinyList();
		
		return new ModelAndView("tiny", "list", list);
	}
	
	@RequestMapping("/complete")
	public ModelAndView completeList() {
		
		List<Inventor> list = apiService.getCompleteList();
		
		return new ModelAndView("complete", "list", list);
	}
}
