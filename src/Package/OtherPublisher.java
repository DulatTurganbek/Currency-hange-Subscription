package Package;

public class OtherPublisher implements Subscriber {

    @Override
    public void update(Publisher publisher) {
        System.out.println("OtherPublisher.update");
        if (publisher instanceof NationalBank) {
            NationalBank nb = ((NationalBank) publisher);
            System.out.println("isAvailable = " + nb.getAvailable());
            System.out.println("new Price = " + nb.getPrice());
        }
    }
}

