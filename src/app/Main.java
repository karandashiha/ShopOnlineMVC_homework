package app;

import app.controller.OrderController;

public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        controller.handleData();
    }
}
