package Package;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new NationalBank();
        Subscriber subscriber = new SecondtierBanks();
        Subscriber subscriber1 = new LoggerOfCurrencyChanges();
        Subscriber subscriber2 = new ExchangeOffice();
        Subscriber subscriber3 = new OtherPublisher();

        publisher.addSubscriber(subscriber);
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        ((NationalBank) publisher).setAvailable(true);

        publisher.addSubscriber(new OtherPublisher());

        ((NationalBank) publisher).setPrice(423.0);


         publisher.removeSubscriber(subscriber);


    }
}
