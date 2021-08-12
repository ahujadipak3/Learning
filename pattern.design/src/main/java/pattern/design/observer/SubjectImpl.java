package pattern.design.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	List<Observer> observers = new ArrayList<>();
	private int value;
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer on) {
		this.observers.remove(on);
		
	}

	@Override
	public void notifyObservers() {
		// when value is being updated from publisher, it's called push model
		// when value is being fetched at subscriber end by composition, it's called pull model. 
		for(Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
	
	public static void main(String[] args) {
		
		
		SubjectImpl subject = new SubjectImpl();
		
		subject.attach(new Chart());
		subject.attach(new SpreadSheet());
		subject.setValue(10);
	}

}
