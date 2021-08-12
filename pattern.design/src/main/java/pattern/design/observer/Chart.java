package pattern.design.observer;

public class Chart implements Observer{

	@Override
	public void update() {
		System.out.println("Chart updated");
	}

	@Override
	public void update(int value) {
		System.out.println("Updated value is:"+ value);		
	}

}
