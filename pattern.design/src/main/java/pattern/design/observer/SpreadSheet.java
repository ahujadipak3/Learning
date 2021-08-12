package pattern.design.observer;

public class SpreadSheet implements Observer{

	@Override
	public void update() {
		System.out.println("Spreadsheet updated");
	}

	@Override
	public void update(int value) {
		System.out.println("Updated value is:"+ value);
	}

}
