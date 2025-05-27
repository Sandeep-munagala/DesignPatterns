package ObserverDesignPattern.Observer;


import ObserverDesignPattern.Observable.ObservableInterface;

public class EmailNotifyObserver implements ObserverInterface {
    public String EmailId;
    ObservableInterface observable;
    public EmailNotifyObserver(String emailId, ObservableInterface observable) {
        this.EmailId = emailId;
        this.observable = observable;
    }

    public void update(){
        System.out.println("Notify Email Id:"+ EmailId + " regarding " + observable.getMsg());
    }
}
