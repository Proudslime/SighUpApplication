package com.example.sighupapplication.SIGH;

public class UserSigh {

    private static final int LOGIN_SUCCESSFUL = 1;
    private static final int LOGIN_FAILED = 0;

    private String userName;
    private String userPass;

    public UserSigh(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
