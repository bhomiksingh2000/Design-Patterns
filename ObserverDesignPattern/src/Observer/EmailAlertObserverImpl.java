package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    // contructor injection :
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {

        sendEmail(emailId, " Iphone is back in stock");

    }

    private void sendEmail(String emailId, String msg) {

        System.out.println("Email Sent for this email id" + emailId + msg);
    }
}
