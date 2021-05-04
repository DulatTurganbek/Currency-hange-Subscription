package Package;

import java.util.ArrayList;
import java.util.List;

public class NationalBank implements Publisher {
    private List<Subscriber> subscribers;
    private Boolean isAvailable;
    private Double price;


    @Override
    public void addSubscriber(Subscriber s) {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        subscribers.add(s);

    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);

    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
        notifySubscribers();
    }

    public void setPrice(Double price) {
        this.price = price;
        notifySubscribers();
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public Double getPrice() {
        return price;
    }
}
