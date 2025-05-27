package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.ObserverInterface;

public interface ObservableInterface {
    public void add(ObserverInterface obj);
    public void remove(ObserverInterface obj);
    public void notifyObservers();
    public String getMsg();
}
