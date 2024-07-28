package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    int mobileNo;
    StockObservable observable;

    // constructor injection :
    public MobileAlertObserverImpl(int mobileNo, StockObservable observable){
        this.mobileNo = mobileNo;
        this.observable = observable;
    }



    @Override
    public void update() {

        sendEmail(mobileNo, " Iphone is back in stock");

    }

    private void sendEmail(int mobileNo, String msg) {

        System.out.println("Message Sent for this mobile no" + mobileNo + msg);
    }
}
