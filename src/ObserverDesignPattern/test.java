package ObserverDesignPattern;

import ObserverDesignPattern.Observable.ObservableConcrete;
import ObserverDesignPattern.Observable.ObservableInterface;
import ObserverDesignPattern.Observer.EmailNotifyObserver;
import ObserverDesignPattern.Observer.MessageNotifyObserver;
import ObserverDesignPattern.Observer.ObserverInterface;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ObservableConcrete iphoneObservable = new ObservableConcrete();
        ObserverInterface obj1 = new EmailNotifyObserver("sandeep@gmail.com",iphoneObservable);
        ObserverInterface obj2 = new EmailNotifyObserver("manipal@gmail.com",iphoneObservable);
        ObserverInterface obj3 = new EmailNotifyObserver("talenthunt@gmail.com",iphoneObservable);
        ObserverInterface obj4 = new MessageNotifyObserver("99897617656",iphoneObservable);
        List<ObserverInterface> totalSubs = List.of(new ObserverInterface[]{obj1, obj2, obj3, obj4});
        iphoneObservable.setObservers(totalSubs);
        iphoneObservable.setMsg("IPHONE arrived");
        iphoneObservable.setStock(5);
        System.out.println("\n\n");
        ObservableConcrete megaLaunch = new ObservableConcrete();
        ObserverInterface obj6 = new EmailNotifyObserver("mega@gmail.com",megaLaunch);
        ObserverInterface obj7 = new EmailNotifyObserver("mini@gmail.com",megaLaunch);
        ObserverInterface obj8 = new EmailNotifyObserver("altra@gmail.com",megaLaunch);
        ObserverInterface obj9 = new MessageNotifyObserver("8985543798",megaLaunch);
        List<ObserverInterface> allSubs = List.of(new ObserverInterface[]{obj6, obj7, obj8, obj9});
        megaLaunch.setObservers(allSubs);
        megaLaunch.setMsg("Mega Launch dates arrived");
        megaLaunch.setStock(5);
    }
}
