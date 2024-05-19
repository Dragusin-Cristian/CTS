package Decorator.SubscriptionExample;

public class HDStreamingDecorator extends SubscriptionDecorator{
    public HDStreamingDecorator(ISubscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", HD Streaming";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
