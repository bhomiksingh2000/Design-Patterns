package Observable;
import java.util.*;

import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {
    public ArrayList<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            stockCount = newStockAdded;
            notifySubscribers();
        }
        stockCount += newStockAdded;


    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
