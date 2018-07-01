package lesson6.homework.forum;

import java.util.Date;

public class ForumPollsOptionsVote {
    private long id;
    private ForumPollsOption pollsOption;
    private User user;
    private Date date;
    private String ip;

    public ForumPollsOptionsVote(long id, ForumPollsOption pollsOption, User user, Date date, String ip) {
        this.id = id;
        this.pollsOption = pollsOption;
        this.user = user;
        this.date = date;
        this.ip = ip;
    }
}
