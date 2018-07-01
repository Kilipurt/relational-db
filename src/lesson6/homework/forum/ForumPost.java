package lesson6.homework.forum;

import java.util.Date;

public class ForumPost {
    private long id;
    private ForumSubcategory subcategory;
    private User user;
    private ForumPost parentPost;
    private String title;
    private String content;
    private boolean isPoll;
    private Date date;
    private String ip;

    public ForumPost(long id, ForumSubcategory subcategory, User user, ForumPost parentPost, String title, String content, boolean isPoll, Date date, String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }
}
