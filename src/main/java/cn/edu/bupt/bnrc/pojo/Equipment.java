package cn.edu.bupt.bnrc.pojo;

public class Equipment extends EquipmentKey {
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