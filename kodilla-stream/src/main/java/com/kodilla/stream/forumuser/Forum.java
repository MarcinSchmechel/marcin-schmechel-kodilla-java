package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1,"Jan", 'M', LocalDate.of(1999,10,10),15));
        theForumUserList.add(new ForumUser(2,"Artur", 'M', LocalDate.of(2005,10,10),2));
        theForumUserList.add(new ForumUser(3,"Beata", 'F', LocalDate.of(1990,10,10),4));
        theForumUserList.add(new ForumUser(4,"Robert", 'M', LocalDate.of(1980,10,10),5));
        theForumUserList.add(new ForumUser(5,"Wojtek", 'M', LocalDate.of(1995,10,10),10));
        theForumUserList.add(new ForumUser(6,"Mateusz", 'M', LocalDate.of(2010,10,10),10));
        theForumUserList.add(new ForumUser(7,"Tadeusz", 'M', LocalDate.of(2010,10,10),10));
        theForumUserList.add(new ForumUser(8,"Anna", 'F', LocalDate.of(1990,10,10),10));
        theForumUserList.add(new ForumUser(9,"Maria", 'F', LocalDate.of(1990,10,10),10));
        theForumUserList.add(new ForumUser(10,"Tomasz", 'M', LocalDate.of(1990,10,10),0));
        theForumUserList.add(new ForumUser(11,"Jonasz", 'M', LocalDate.of(1990,10,10),0));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
