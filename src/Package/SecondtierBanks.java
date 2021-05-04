package Package;

public class SecondtierBanks implements Subscriber {

    @Override
    public void update(Publisher publisher) {
        System.out.println("Second-tier Banks.update");
        if (publisher instanceof NationalBank) {
            NationalBank nb = ((NationalBank) publisher);
            System.out.println("isAvailable = " + nb.getAvailable());
            System.out.println("new Price = " + nb.getPrice());
        }

    }
}
