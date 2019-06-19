package cn.edu.bupt.bnrc.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userPhone;

    private String userHeadimage;

    private String userSignature;

    private Integer userRole;

    private String userLastlogin;

    private String userRemark;

    private String userExtra;

    public User(Integer userId, String userName, String userPassword, String userEmail, String userPhone, String userHeadimage, String userSignature, Integer userRole, String userLastlogin, String userRemark, String userExtra) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userHeadimage = userHeadimage;
        this.userSignature = userSignature;
        this.userRole = userRole;
        this.userLastlogin = userLastlogin;
        this.userRemark = userRemark;
        this.userExtra = userExtra;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
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

    public String getUserExtra() {
        return userExtra;
    }

    public void setUserExtra(String userExtra) {
        this.userExtra = userExtra == null ? null : userExtra.trim();
    }
}