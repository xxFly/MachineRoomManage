package cn.edu.bupt.bnrc.pojo;

public class Cabinet {
    private Integer cabId;

    private Integer mrId;

    private String cabName;

    private String cabLength;

    private String cabWidth;

    private String cabHeight;

    private String cabUnitNum;

    private String cabLocation;

    private String cabRemark;

    private String cabExtra;

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public Integer getMrId() {
        return mrId;
    }

    public void setMrId(Integer mrId) {
        this.mrId = mrId;
    }

    public String getCabName() {
        return cabName;
    }

    public void setCabName(String cabName) {
        this.cabName = cabName == null ? null : cabName.trim();
    }

    public String getCabLength() {
        return cabLength;
    }

    public void setCabLength(String cabLength) {
        this.cabLength = cabLength == null ? null : cabLength.trim();
    }

    public String getCabWidth() {
        return cabWidth;
    }

    public void setCabWidth(String cabWidth) {
        this.cabWidth = cabWidth == null ? null : cabWidth.trim();
    }

    public String getCabHeight() {
        return cabHeight;
    }

    public void setCabHeight(String cabHeight) {
        this.cabHeight = cabHeight == null ? null : cabHeight.trim();
    }

    public String getCabUnitNum() {
        return cabUnitNum;
    }

    public void setCabUnitNum(String cabUnitNum) {
        this.cabUnitNum = cabUnitNum == null ? null : cabUnitNum.trim();
    }

    public String getCabLocation() {
        return cabLocation;
    }

    public void setCabLocation(String cabLocation) {
        this.cabLocation = cabLocation == null ? null : cabLocation.trim();
    }

    public String getCabRemark() {
        return cabRemark;
    }

    public void setCabRemark(String cabRemark) {
        this.cabRemark = cabRemark == null ? null : cabRemark.trim();
    }

    public String getCabExtra() {
        return cabExtra;
    }

    public void setCabExtra(String cabExtra) {
        this.cabExtra = cabExtra == null ? null : cabExtra.trim();
    }
}