package lesson6.homework.products;

import java.util.Date;

public class Order {
    private long orderId;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String shipVia;
    private String freight;
    private String shipName;
    private String shipAddfess;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    public Order(long orderId, Customer customer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate, String shipVia, String freight, String shipName, String shipAddfess, String shipCity, String shipRegion, String shipPostalCode, String shipCountry) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddfess = shipAddfess;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }
}
