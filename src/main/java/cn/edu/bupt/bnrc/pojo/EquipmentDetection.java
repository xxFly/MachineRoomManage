package cn.edu.bupt.bnrc.pojo;

public class EquipmentDetection {
    private String equipTime;

    private String userId;

    private String equipBrand;

    private String equipVersion;

    private String equipLocation;

    public EquipmentDetection(String equipTime, String userId, String equipBrand, String equipVersion, String equipLocation) {
        this.equipTime = equipTime;
        this.userId = userId;
        this.equipBrand = equipBrand;
        this.equipVersion = equipVersion;
        this.equipLocation = equipLocation;
    }

    @Override
    public String toString() {
        return "EquipmentDetection{" +
                "equipTime='" + equipTime + '\'' +
                ", userId='" + userId + '\'' +
                ", equipBrand='" + equipBrand + '\'' +
                ", equipVersion='" + equipVersion + '\'' +
                ", equipLocation='" + equipLocation + '\'' +
                '}';
    }

    public String getEquipTime() {
        return equipTime;
    }

    public void setEquipTime(String equipTime) {
        this.equipTime = equipTime == null ? null : equipTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
}