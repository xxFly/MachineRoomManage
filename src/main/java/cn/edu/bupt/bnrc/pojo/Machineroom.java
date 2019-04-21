package cn.edu.bupt.bnrc.pojo;

public class Machineroom extends MachineroomKey {
    private String mrName;

    private String mrLength;

    private String mrWidth;

    private String mrHeight;

    private String mrPicture;

    private String mrModel;

    private String mrLocation;

    private String mrRemark;

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