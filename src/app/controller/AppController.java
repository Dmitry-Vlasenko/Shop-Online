package app.controller;

import app.entity.Buyer;
import app.entity.Delivery;
import app.entity.Purchase;
import app.utils.Convert;
import app.view.AppView;

public class AppController {

    private final static String CURRENCY = "USD";
    private final AppView view = new AppView();

    public void getPayment() {
        String[] data = view.getData();
        Buyer buyer = getBuyer(data);
        Purchase purchase = getPurchase(data);
        Delivery delivery = getDelivery(data);
        System.out.println(delivery.getDeliveryPost());
    }

    private Buyer getBuyer(String[] data) {
        return new Buyer(data[0], data[1]);
    }

    private Purchase getPurchase(String[] data) {
        return new Purchase(Integer.parseInt(data[2]),
                Double.parseDouble(data[3]));
    }

    private Delivery getDelivery(String[] data) {
        return new Delivery(Convert.booleanValue(data[4]), data[5]);
    }
}
