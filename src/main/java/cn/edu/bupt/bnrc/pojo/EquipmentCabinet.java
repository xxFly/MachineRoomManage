package cn.edu.bupt.bnrc.pojo;

public class EquipmentCabinet extends EquipmentCabinetKey {
    private String equipCabName;

    private String equipCabLength;

    private String equipCabWidth;

    private String equipCabHeight;

    private String equipCabUnitNum;

    private String equipCabLocation;

    private String equipCabRemark;

    public String getEquipCabName() {
        return equipCabName;
    }

    public void setEquipCabName(String equipCabName) {
        this.equipCabName = equipCabName == null ? null : equipCabName.trim();
    }

    public String getEquipCabLength() {
        return equipCabLength;
    }

    public void setEquipCabLength(String equipCabLength) {
        this.equipCabLength = equipCabLength == null ? null : equipCabLength.trim();
    }

    public String getEquipCabWidth() {
        return equipCabWidth;
    }

    public void setEquipCabWidth(String equipCabWidth) {
        this.equipCabWidth = equipCabWidth == null ? null : equipCabWidth.trim();
    }

    public String getEquipCabHeight() {
        return equipCabHeight;
    }

    public void setEquipCabHeight(String equipCabHeight) {
        this.equipCabHeight = equipCabHeight == null ? null : equipCabHeight.trim();
    }

    public String getEquipCabUnitNum() {
        return equipCabUnitNum;
    }

    public void setEquipCabUnitNum(String equipCabUnitNum) {
        this.equipCabUnitNum = equipCabUnitNum == null ? null : equipCabUnitNum.trim();
    }

    public String getEquipCabLocation() {
        return equipCabLocation;
    }

    public void setEquipCabLocation(String equipCabLocation) {
        this.equipCabLocation = equipCabLocation == null ? null : equipCabLocation.trim();
    }

    public String getEquipCabRemark() {
        return equipCabRemark;
    }

    public void setEquipCabRemark(String equipCabRemark) {
        this.equipCabRemark = equipCabRemark == null ? null : equipCabRemark.trim();
    }
}