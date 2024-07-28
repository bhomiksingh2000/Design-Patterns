import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("bhomik8888@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("manisha98y87@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl(99998777, iphoneStockObservable);


        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(100);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);



    }
}

/*
While removing the StockObservable instance from the constructors won't break the basic functionality
of the Observer pattern, it does reduce the flexibility and scalability of your design.
If your observers only need to receive simple notifications without interacting with the observable,
this change might be acceptable. However, for more complex scenarios where observers might need to query
the observable's state or perform more advanced actions, keeping the reference to StockObservable in the
constructor is beneficial.

 */