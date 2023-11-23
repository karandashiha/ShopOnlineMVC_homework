package app.controller;

import app.entity.Customer;
import app.entity.Product;
import app.model.DeliveryOrder;
import app.model.PickupOrder;
import app.until.Constants;
import app.view.OrderView;

public class OrderController {
    public void handleData() {
        OrderView view = new OrderView();
        String[] data = view.getData();
        Customer customer = getCustomer(data);
        Product product = getProduct(data);
        String[] result;
        if (product.getDelivery().equals("Y")) {
            DeliveryOrder model = new DeliveryOrder();
            result = model.getResult(product.getQuota(), product.getPrice());
            view.getOutput(customer.toString() + product + "Total coats: " + Constants.CURRENCY + " " + result[0] + "\n"
                    + "Delivery coast: " + Constants.CURRENCY + " " + result[1] + "\n");
        } else if (product.getDelivery().equals("N")) {
            PickupOrder model = new PickupOrder();
            result = model.getResult(product.getQuota(), product.getPrice());
            view.getOutput(customer.toString() + product +
                    "Total cost: " + Constants.CURRENCY + " " + result[0] + "\n");
        } else {
            view.getOutput("Something is wrong");
        }
    }

    private Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1], data[2]);
    }

    private Product getProduct(String[] data) {
        return new Product(data[3], Integer.parseInt(data[4]), Double.parseDouble(data[5]), data[6]);
    }

}
