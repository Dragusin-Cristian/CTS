package Decorator.SubscriptionExample;

public class SubscriptionDecorator implements ISubscription{
    protected ISubscription subscription;

    public SubscriptionDecorator(ISubscription subscription){
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return this.subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return this.subscription.getPrice();
    }
}
