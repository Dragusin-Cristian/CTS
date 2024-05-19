package Decorator.SubscriptionExample;

public class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(ISubscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", offline viewing";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }
}
