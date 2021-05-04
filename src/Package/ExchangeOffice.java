package Package;

public class ExchangeOffice implements Subscriber {
    @Override
    public void update(Publisher publisher) {
        System.out.println("other publisher.update");
        if (publisher instanceof NationalBank) {
            NationalBank nb = ((NationalBank) publisher);
            System.out.println("isAvailable = " + nb.getAvailable());
            System.out.println("new Price = " + nb.getPrice());
        }

    }
}
