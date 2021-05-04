package Package;

import java.util.List;

public interface Publisher {

    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers();
}
