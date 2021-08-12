package interviews;

public enum State {
	GUJARAT("Gujarat"), MAHARASTRHA("MH");
	
	State(String stateName) {
		this.state = stateName;
	}
	private String state;
	
	public String getValue() {
		return this.state;
	}
	
	}
