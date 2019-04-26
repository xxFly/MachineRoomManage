package cn.edu.bupt.bnrc.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userPhone;

    private String userHeadimage;

    private String userSignature;

    private String userAuthority;

    private String userLastlogin;

    private String userRemark;

    public User() {
    }

    public User(String userId, String userName, String userPassword, String userEmail, String userPhone, String userHeadimage, String userSignature, String userAuthority, String userLastlogin, String userRemark) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userHeadimage = userHeadimage;
        this.userSignature = userSignature;
        this.userAuthority = userAuthority;
        this.userLastlogin = userLastlogin;
        this.userRemark = userRemark;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userHeadimage='" + userHeadimage + '\'' +
                ", userSignature='" + userSignature + '\'' +
                ", userAuthority='" + userAuthority + '\'' +
                ", userLastlogin='" + userLastlogin + '\'' +
                ", userRemark='" + userRemark + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserHeadimage() {
        return userHeadimage;
    }

    public void setUserHeadimage(String userHeadimage) {
        this.userHeadimage = userHeadimage == null ? null : userHeadimage.trim();
    }

    public String getUserSignature() {
        return userSignature;
    }

    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature == null ? null : userSignature.trim();
    }

    public String getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(String userAuthority) {
        this.userAuthority = userAuthority == null ? null : userAuthority.trim();
    }

    public String getUserLastlogin() {
        return userLastlogin;
    }

    public void setUserLastlogin(String userLastlogin) {
        this.userLastlogin = userLastlogin == null ? null : userLastlogin.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }
}