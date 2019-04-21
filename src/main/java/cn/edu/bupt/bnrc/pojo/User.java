package cn.edu.bupt.bnrc.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userPhone;

    private String userHeadimage;

    private String userSignature;

    private String userAuthority;

    private String userLastlogin;

    private String userRemark;

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