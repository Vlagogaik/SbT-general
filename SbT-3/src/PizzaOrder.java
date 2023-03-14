enum Size {
    SMALL, MEDIUM, BIG
}

class PizzaOrder {
    private String name;
    private Size size;
    private boolean sauce;
    private String deliveryAddress;
    private boolean orderAccepted;

    public PizzaOrder(String name, Size size, boolean sauce, String deliveryAddress) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.deliveryAddress = deliveryAddress;
        this.orderAccepted = false;
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Заказ уже принят.");
        } else {
            orderAccepted = true;
            System.out.println("Заказ принят. " + size + " пицца \"" + name + "\" " +
                    (sauce ? "с соусом " : "без соуса ") + "на адрес " + deliveryAddress + ".");
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Заказ отменен.");
            orderAccepted = false;
        } else {
            System.out.println("Заказ не был принят.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return size + " пицца \"" + name + "\" " + (sauce ? "с соусом " : "без соуса ") +
                "на адрес " + deliveryAddress + (orderAccepted ? " (заказ принят)" : "");
    }
}