package co.grandcircus.csHallOfFameapi.model;

import java.util.List;

public class InventorResponse {
	
	private List<Inventor> complete;
	
	public InventorResponse() {}

	public List<Inventor> getComplete() {
		return complete;
	}

	public void setComplete(List<Inventor> complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "InventorResponse [complete=" + complete + "]";
	}
	
}
