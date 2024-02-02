package app.entity;

public class Delivery {

    private final boolean DeliveryPost;
    private final String Address;

    public Delivery(Boolean DeliveryPost, String Address) {
        this.DeliveryPost = DeliveryPost;
        this.Address = Address;
    }

    public boolean getDeliveryPost() {
        return DeliveryPost;
    }

    public String getAddress() {
        return Address;
    }
}
