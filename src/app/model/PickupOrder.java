package app.model;

import app.until.Constants;
import app.until.Rounder;

public class PickupOrder implements Order {
    public double deliveryRate = Constants.DELIVERY_RATE;

    public String[] getResult(int quota, double price) {
        return new String[]{Rounder.roundValue(getOrderCost(quota, price)),
                Rounder.roundValue(getDeliveryCost(quota, price))};
    }

    @Override
    public double getOrderCost(int quota, double price) {
        return (quota * price) * (1 + deliveryRate / 100);
    }

    private double getDeliveryCost(int quota, double price) {
        return quota * price * deliveryRate / 100;
    }
}
