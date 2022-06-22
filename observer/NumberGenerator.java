import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList<Observer> observers = new ArrayList<>(); // store the observers

	// add observer to ArrayList
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// delete observer from ArrayList
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	// notify to observers
	public void notifyObservers() {
		Iterator it = observers.iterator();
		while(it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}

	public abstract int getNumber(); // get number
	public abstract void execute();  // create number
}
