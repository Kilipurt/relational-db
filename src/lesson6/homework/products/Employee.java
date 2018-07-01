package lesson6.homework.products;

import java.util.Date;

public class Employee {
    private long employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String ciry;
    private String region;
    private String postalCode;
    private String country;
    private long homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;

    public Employee(long employeeId, String lastName, String firstName, String title, String titleOfCourtesy, Date birthDate, Date hireDate, String address, String ciry, String region, String postalCode, String country, long homePhone, String extension, String photo, String notes, String reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.ciry = ciry;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}
