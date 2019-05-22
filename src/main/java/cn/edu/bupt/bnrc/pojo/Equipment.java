package cn.edu.bupt.bnrc.pojo;

public class Equipment {
    private String equipId;

    private String equipCabId;

    private String mrId;

    private String equipName;

    private String equipLength;

    private String equipWidth;

    private String equipHeight;

    private String equipBrand;

    private String equipVersion;

    private String equipLocation;

    private String equipPicture;

    private String equipType;

    private String equipRemark;

    public Equipment(String equipId, String equipCabId, String mrId, String equipName, String equipLength, String equipWidth, String equipHeight, String equipBrand, String equipVersion, String equipLocation, String equipPicture, String equipType, String equipRemark) {
        this.equipId = equipId;
        this.equipCabId = equipCabId;
        this.mrId = mrId;
        this.equipName = equipName;
        this.equipLength = equipLength;
        this.equipWidth = equipWidth;
        this.equipHeight = equipHeight;
        this.equipBrand = equipBrand;
        this.equipVersion = equipVersion;
        this.equipLocation = equipLocation;
        this.equipPicture = equipPicture;
        this.equipType = equipType;
        this.equipRemark = equipRemark;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipId='" + equipId + '\'' +
                ", equipCabId='" + equipCabId + '\'' +
                ", mrId='" + mrId + '\'' +
                ", equipName='" + equipName + '\'' +
                ", equipLength='" + equipLength + '\'' +
                ", equipWidth='" + equipWidth + '\'' +
                ", equipHeight='" + equipHeight + '\'' +
                ", equipBrand='" + equipBrand + '\'' +
                ", equipVersion='" + equipVersion + '\'' +
                ", equipLocation='" + equipLocation + '\'' +
                ", equipPicture='" + equipPicture + '\'' +
                ", equipType='" + equipType + '\'' +
                ", equipRemark='" + equipRemark + '\'' +
                '}';
    }

    public String getEquipId() {
        return equipId;
    }

    public void setEquipId(String equipId) {
        this.equipId = equipId == null ? null : equipId.trim();
    }

    public String getEquipCabId() {
        return equipCabId;
    }

    public void setEquipCabId(String equipCabId) {
        this.equipCabId = equipCabId == null ? null : equipCabId.trim();
    }

    public String getMrId() {
        return mrId;
    }

    public void setMrId(String mrId) {
        this.mrId = mrId == null ? null : mrId.trim();
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName == null ? null : equipName.trim();
    }

    public String getEquipLength() {
        return equipLength;
    }

    public void setEquipLength(String equipLength) {
        this.equipLength = equipLength == null ? null : equipLength.trim();
    }

    public String getEquipWidth() {
        return equipWidth;
    }

    public void setEquipWidth(String equipWidth) {
        this.equipWidth = equipWidth == null ? null : equipWidth.trim();
    }

    public String getEquipHeight() {
        return equipHeight;
    }

    public void setEquipHeight(String equipHeight) {
        this.equipHeight = equipHeight == null ? null : equipHeight.trim();
    }

    public String getEquipBrand() {
        return equipBrand;
    }

    public void setEquipBrand(String equipBrand) {
        this.equipBrand = equipBrand == null ? null : equipBrand.trim();
    }

    public String getEquipVersion() {
        return equipVersion;
    }

    public void setEquipVersion(String equipVersion) {
        this.equipVersion = equipVersion == null ? null : equipVersion.trim();
    }

    public String getEquipLocation() {
        return equipLocation;
    }

    public void setEquipLocation(String equipLocation) {
        this.equipLocation = equipLocation == null ? null : equipLocation.trim();
    }

    public String getEquipPicture() {
        return equipPicture;
    }

    public void setEquipPicture(String equipPicture) {
        this.equipPicture = equipPicture == null ? null : equipPicture.trim();
    }

    public String getEquipType() {
        return equipType;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType == null ? null : equipType.trim();
    }

    public String getEquipRemark() {
        return equipRemark;
    }

    public void setEquipRemark(String equipRemark) {
        this.equipRemark = equipRemark == null ? null : equipRemark.trim();
    }
}