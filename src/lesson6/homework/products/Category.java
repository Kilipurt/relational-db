package lesson6.homework.products;

public class Category {
    private long categoryId;
    private String categoryName;
    private String description;
    private String picture;

    public Category(long categoryId, String categoryName, String description, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }
}
