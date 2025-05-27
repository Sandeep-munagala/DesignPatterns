package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.ObserverInterface;

import java.util.List;

public class ObservableConcrete implements ObservableInterface {
    public int stock;
    public List<ObserverInterface> observers;
    public String msg;

    //setters
    public void setObservers(List<ObserverInterface> observers) {
        this.observers = observers;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public void add(ObserverInterface obj) {
        observers.add(obj);
    }
    public void remove(ObserverInterface obj) {
        for(ObserverInterface o:observers){
            if(o.equals(obj)){
                observers.remove(obj);
            }
        }
    }
    public void notifyObservers() {
        for(ObserverInterface o:observers){
            o.update();
        }
    }
    public void setStock(int newStock){
        if(stock == 0){
            notifyObservers();
        }
        stock += newStock;
    }
}
