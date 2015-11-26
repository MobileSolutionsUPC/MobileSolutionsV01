package com.mobilesolutions.model;

/**
 * Created by jhonathan on 26/11/15.
 */
public class Usuario {
    int intUserId;
    String strUserName;
    String strPassword;
    String strPhone;
    String strEmail;
    String strFullName;

    public int getIntUserId() {
        return intUserId;
    }
    public String getStrUserName() {
        return strUserName;
    }
    public String getStrPassword() {
        return strPassword;
    }
    public String getStrPhone() {
        return strPhone;
    }
    public String getStrEmail() {
        return strEmail;
    }
    public String getStrFullName() {
        return strFullName;
    }

    public void setIntUserId(int intUserId) {
        this.intUserId = intUserId;
    }
    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }
    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }
    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }
    public void setStrFullName(String strFullName) {
        this.strFullName = strFullName;
    }
}
