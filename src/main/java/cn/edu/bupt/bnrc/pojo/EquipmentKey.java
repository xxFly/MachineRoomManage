package cn.edu.bupt.bnrc.pojo;

public class EquipmentKey {
    private String equipId;

    private String equipCabId;

    private String mrId;

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
}