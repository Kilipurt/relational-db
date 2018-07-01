package lesson6.homework.products;

public class Product {
    private long productId;
    private String productName;
    private Supplier supplier;
    private Category category;
    private int quantityPerUnit;
    private double unitPrice;
    private int unitInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    private int discontinued;

    public Product(long productId, String productName, Supplier supplier, Category category, int quantityPerUnit, double unitPrice, int unitInStock, int unitsOnOrder, int reorderLevel, int discontinued) {
        this.productId = productId;
        this.productName = productName;
        this.supplier = supplier;
        this.category = category;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
    }
}
