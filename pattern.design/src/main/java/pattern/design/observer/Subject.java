package pattern.design.observer;

public interface Subject {

	public void attach(Observer observer);
	public void removeObserver(Observer on);
	
	public void notifyObservers();
	
}
