package Package;

public class LoggerOfCurrencyChanges implements Subscriber{

    @Override
    public void update(Publisher publisher) {
        System.out.println("Logger of currency changes.update");
        if (publisher instanceof NationalBank) {
            NationalBank nb = ((NationalBank) publisher);
            System.out.println("isAvailable = " + nb.getAvailable());
            System.out.println("new currency = " + (nb.getPrice()+20) + "tg");
        }

    }
}
