CREATE TABLE FORUM_POLLS_OPTIONS_VOTES(
    ID NUMBER,
    CONSTRAINT FORUM_POLLS_OPTIONS_VOTES_PK PRIMARY KEY(ID),
    ID_POLL_OPTION NUMBER,
    CONSTRAINT POLL_OPTION_FK FOREIGN KEY(ID_POLL_OPTION) REFERENCES FORUM_POLLS_OPTIONS(ID),
    ID_USER NUMBER,
    CONSTRAINT USER_CONST_FK FOREIGN KEY(ID_USER) REFERENCES USERS(ID),
    VOTE_DATE TIMESTAMP,
    IP NVARCHAR2(20)
);