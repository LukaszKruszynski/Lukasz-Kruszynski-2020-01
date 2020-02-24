package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListOfForumUsers = new ArrayList<>();

    public Forum(){
        theListOfForumUsers.add(new ForumUser(1,"Pijok75",'m', LocalDate.of(1975,10,12), 12));
        theListOfForumUsers.add(new ForumUser(2,"Grażynkaaa",'f',LocalDate.of(1982,03,03),0));
        theListOfForumUsers.add(new ForumUser(3,"Napalony Johny",'m',LocalDate.of(1998,01,28),1));
        theListOfForumUsers.add(new ForumUser(4,"Karabinowy Michał", 'm', LocalDate.of(2002,12,28),0));
        theListOfForumUsers.add(new ForumUser(5,"Forum Passion", 'm',LocalDate.of(1996,9,30),73));
        theListOfForumUsers.add(new ForumUser(6,"Sandały Mojżesza",'m',LocalDate.of(2003,04,01),3));
        theListOfForumUsers.add(new ForumUser(7,"Ta jedyna",'f',LocalDate.of(1993,06,30),43));
        theListOfForumUsers.add(new ForumUser(8,"Kukux Klan",'m',LocalDate.of(1999,11,05),5));
        theListOfForumUsers.add(new ForumUser(9,"Maniu",'m',LocalDate.of(1991,10,05),0));

    }

    public List<ForumUser> getTheListOfForumUsers() {
        return new ArrayList<>(theListOfForumUsers);
    }
}
