package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableInterface;

public class MessageNotifyObserver implements ObserverInterface {
    String PhoneNumber;
    ObservableInterface observable;
    public MessageNotifyObserver(String PhoneNumber, ObservableInterface observable) {
        this.PhoneNumber = PhoneNumber;
        this.observable = observable;
    }

    public void update() {
        System.out.println("notified to " + PhoneNumber + " regarding " + observable.getMsg());
    }
}
