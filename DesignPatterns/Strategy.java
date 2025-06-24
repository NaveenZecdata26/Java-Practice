package DesignPatterns;

interface StrategyInterfae {
    void doPayment(int amount);
}

class UpiPayment implements StrategyInterfae {

    @Override
    public void doPayment(int amount) {

        System.out.println("paid amount is '" + amount + "' using api");
    }
}

class CashPayment implements StrategyInterfae {
    @Override
    public void doPayment(int amount) {

        System.out.println("paid amount is '" + amount + "' using cash");
    }
}

class CardPayment implements StrategyInterfae {
    @Override
    public void doPayment(int amount) {

        System.out.println("paid amount is '" + amount + "' using card");
    }
}

class RidePayment {
    private StrategyInterfae strategyInterfae;

    void setPaymentStrategy(StrategyInterfae strategyInterfae) {
        this.strategyInterfae = strategyInterfae;
    }

    void pay(int amount)
    {
        strategyInterfae.doPayment(amount);
    }

}

public class Strategy {
    public static void main(String[] args) {
        RidePayment ridePayment = new RidePayment();
        ridePayment.setPaymentStrategy(new CardPayment());
        ridePayment.pay(25000);
        ridePayment.setPaymentStrategy(new CashPayment());
        ridePayment.pay(35000);
        ridePayment.setPaymentStrategy(new UpiPayment());
        ridePayment.pay(45000);
    }
}
