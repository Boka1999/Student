package servis;

import model.User;

public class UserService {
    public User create (String name, String surName, int year, String mail, double height, boolean isMarried ) {
        User user = new User();
        user.setName(name);
        user.setSurName(surName);
        user.setYear(year);
        user.setHeight(height);
        user.setMail(mail);
        user.setMarried(isMarried);
        return user;
    }

    }

