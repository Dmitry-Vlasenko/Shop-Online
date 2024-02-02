package app.model.impl;

import app.entity.Delivery;
import app.entity.Purchase;
import app.model.AppModel;

public class AppBaseModel implements AppModel {

    public double calcPayment(Purchase purchase) {
        return purchase.getQuota() * purchase.getPrice();
    }
}
