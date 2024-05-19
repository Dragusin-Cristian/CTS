package Decorator.SubscriptionExample;

public class BasicSubscription implements ISubscription{

    @Override
    public String getDescription() {
        return "Basic subscription";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
