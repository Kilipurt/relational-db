package lesson6.homework.products;

public class OrderDetails {
    private Order order;
    private Product product;
    private double unitPrice;
    private int quantity;
    private double discount;

    public OrderDetails(Order order, Product product, double unitPrice, int quantity, double discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
