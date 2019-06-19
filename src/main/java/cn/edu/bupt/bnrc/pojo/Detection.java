package cn.edu.bupt.bnrc.pojo;

public class Detection {
    private Integer detectId;

    private Integer userId;

    private String detectBrand;

    private String detectVersion;

    private String detectLocation;

    private String detectTime;

    private String detectExtra;

    public Detection(Integer detectId, Integer userId, String detectBrand, String detectVersion, String detectLocation, String detectTime, String detectExtra) {
        this.detectId = detectId;
        this.userId = userId;
        this.detectBrand = detectBrand;
        this.detectVersion = detectVersion;
        this.detectLocation = detectLocation;
        this.detectTime = detectTime;
        this.detectExtra = detectExtra;
    }

    public Integer getDetectId() {
        return detectId;
    }

    public void setDetectId(Integer detectId) {
        this.detectId = detectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDetectBrand() {
        return detectBrand;
    }

    public void setDetectBrand(String detectBrand) {
        this.detectBrand = detectBrand == null ? null : detectBrand.trim();
    }

    public String getDetectVersion() {
        return detectVersion;
    }

    public void setDetectVersion(String detectVersion) {
        this.detectVersion = detectVersion == null ? null : detectVersion.trim();
    }

    public String getDetectLocation() {
        return detectLocation;
    }

    public void setDetectLocation(String detectLocation) {
        this.detectLocation = detectLocation == null ? null : detectLocation.trim();
    }

    public String getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(String detectTime) {
        this.detectTime = detectTime == null ? null : detectTime.trim();
    }

    public String getDetectExtra() {
        return detectExtra;
    }

    public void setDetectExtra(String detectExtra) {
        this.detectExtra = detectExtra == null ? null : detectExtra.trim();
    }
}