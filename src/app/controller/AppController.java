package app.controller;

import app.entity.Buyer;
import app.entity.Delivery;
import app.entity.Purchase;
import app.model.impl.AppBaseModel;
import app.model.impl.AppDeliveryModel;
import app.utils.Convert;
import app.utils.Rounder;
import app.view.AppView;

public class AppController {

    private final static String CURRENCY = "USD";
    private final AppView view = new AppView();

    public void getPayment() {
        String[] data = view.getData();
        String output;
        Buyer buyer = getBuyer(data);
        Purchase purchase = getPurchase(data);
        Delivery delivery = getDelivery(data);
        if (delivery.getDeliveryPost()) {
            AppDeliveryModel model = new AppDeliveryModel();
            String payment = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getPhone() +
                    "\nPayment is " + CURRENCY + " " + payment + "\nDelivery address: " + delivery.getAddress();
            view.getOutput(output);
        } else {
            AppBaseModel model = new AppBaseModel();
            String payment = Rounder.roundValue(model.calcPayment(purchase));
            output = "\nBuyer: " + buyer.getName() + ", " + buyer.getPhone() +
                    "\nPayment is " + CURRENCY + " " + payment;
            view.getOutput(output);
        }
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
