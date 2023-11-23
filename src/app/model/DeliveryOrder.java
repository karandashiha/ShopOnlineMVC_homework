package app.model;

import app.until.Rounder;

public class DeliveryOrder implements Order {
    public String[] getResult(int quota, double price) {
        return new String[]{
                Rounder.roundValue(getOrderCost(quota, price))};
    }

    public double getOrderCost(int quota, double price) {
        return quota * price;
    }

}
