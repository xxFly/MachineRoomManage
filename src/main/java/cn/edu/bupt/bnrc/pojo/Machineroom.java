package cn.edu.bupt.bnrc.pojo;

public class Machineroom {
    private String mrId;

    private String userId;

    private String mrName;

    private String mrLength;

    private String mrWidth;

    private String mrHeight;

    private String mrPicture;

    private String mrModel;

    private String mrLocation;

    private String mrRemark;

    public Machineroom(String mrId, String userId, String mrName, String mrLength, String mrWidth, String mrHeight, String mrPicture, String mrModel, String mrLocation, String mrRemark) {
        this.mrId = mrId;
        this.userId = userId;
        this.mrName = mrName;
        this.mrLength = mrLength;
        this.mrWidth = mrWidth;
        this.mrHeight = mrHeight;
        this.mrPicture = mrPicture;
        this.mrModel = mrModel;
        this.mrLocation = mrLocation;
        this.mrRemark = mrRemark;
    }

    @Override
    public String toString() {
        return "Machineroom{" +
                "mrId='" + mrId + '\'' +
                ", userId='" + userId + '\'' +
                ", mrName='" + mrName + '\'' +
                ", mrLength='" + mrLength + '\'' +
                ", mrWidth='" + mrWidth + '\'' +
                ", mrHeight='" + mrHeight + '\'' +
                ", mrPicture='" + mrPicture + '\'' +
                ", mrModel='" + mrModel + '\'' +
                ", mrLocation='" + mrLocation + '\'' +
                ", mrRemark='" + mrRemark + '\'' +
                '}';
    }

    public String getMrId() {
        return mrId;
    }

    public void setMrId(String mrId) {
        this.mrId = mrId == null ? null : mrId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getMrName() {
        return mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName == null ? null : mrName.trim();
    }

    public String getMrLength() {
        return mrLength;
    }

    public void setMrLength(String mrLength) {
        this.mrLength = mrLength == null ? null : mrLength.trim();
    }

    public String getMrWidth() {
        return mrWidth;
    }

    public void setMrWidth(String mrWidth) {
        this.mrWidth = mrWidth == null ? null : mrWidth.trim();
    }

    public String getMrHeight() {
        return mrHeight;
    }

    public void setMrHeight(String mrHeight) {
        this.mrHeight = mrHeight == null ? null : mrHeight.trim();
    }

    public String getMrPicture() {
        return mrPicture;
    }

    public void setMrPicture(String mrPicture) {
        this.mrPicture = mrPicture == null ? null : mrPicture.trim();
    }

    public String getMrModel() {
        return mrModel;
    }

    public void setMrModel(String mrModel) {
        this.mrModel = mrModel == null ? null : mrModel.trim();
    }

    public String getMrLocation() {
        return mrLocation;
    }

    public void setMrLocation(String mrLocation) {
        this.mrLocation = mrLocation == null ? null : mrLocation.trim();
    }

    public String getMrRemark() {
        return mrRemark;
    }

    public void setMrRemark(String mrRemark) {
        this.mrRemark = mrRemark == null ? null : mrRemark.trim();
    }
}