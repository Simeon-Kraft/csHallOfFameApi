package co.grandcircus.csHallOfFameapi.model;

import java.util.List;

public class TinyInventorResponse {
	
	private List<TinyInventor> tiny;
	
	public TinyInventorResponse() {}

	public List<TinyInventor> getTinyList() {
		return tiny;
	}

	public void setTiny(List<TinyInventor> tiny) {
		this.tiny = tiny;
	}

	@Override
	public String toString() {
		return "TinyInventorResponse [tiny=" + tiny + "]";
	}
	
}
