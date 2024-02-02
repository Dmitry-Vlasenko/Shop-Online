package app.model.impl;

import app.entity.Purchase;
import app.model.AppModel;

public class AppDeliveryModel implements AppModel {
    @Override
    public double calcPayment(Purchase purchase) {
        double cost = purchase.getQuota() * purchase.getPrice();
        System.out.println(cost);
        return cost + (cost * 5/100);
    }
}
