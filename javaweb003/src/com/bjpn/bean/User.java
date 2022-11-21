package com.bjpn.bean;

import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private String userSex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userSex, user.userSex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSex);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public User(int userId, String userName, String userSex) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
    }
    public User(){}
}
