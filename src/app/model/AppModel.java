package app.model;

import app.entity.Delivery;
import app.entity.Purchase;

public interface AppModel {

    double calcPayment(Purchase purchase);
}
