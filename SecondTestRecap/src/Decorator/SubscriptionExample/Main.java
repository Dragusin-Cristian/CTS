package Decorator.SubscriptionExample;

public class Main {
    public static void main(String[] args) {
        ISubscription subscription = new BasicSubscription();

        subscription = new OfflineViewingDecorator(subscription);

        subscription = new HDStreamingDecorator(subscription);

        System.out.println(subscription.getDescription());
        System.out.println(subscription.getPrice());
    }
}
