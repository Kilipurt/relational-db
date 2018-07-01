package lesson6.homework.products;

public class Supplier {
    private long supplierId;
    private String companyName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private long phone;
    private String fax;
    private String homePage;

    public Supplier(long supplierId, String companyName, String contactTitle, String address, String city, String region, String postalCode, String country, long phone, String fax, String homePage) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.homePage = homePage;
    }
}
