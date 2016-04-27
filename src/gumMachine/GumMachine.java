package gumMachine;
public class GumMachine {
	int gumballs;
	
	public int getGumballs() {
		return gumballs;
	}

	public void setGumballs(int gumballs) {
		this.gumballs = gumballs;
	}

	public void turnWheel(){
		this.setGumballs(this.getGumballs()-1);
	}
	
	
}
