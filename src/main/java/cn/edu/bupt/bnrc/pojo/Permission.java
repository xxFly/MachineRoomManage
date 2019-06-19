package cn.edu.bupt.bnrc.pojo;

public class Permission {
    private Integer perId;

    private String perUrl;

    private String perRemark;

    private String perExtra;

    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerUrl() {
        return perUrl;
    }

    public void setPerUrl(String perUrl) {
        this.perUrl = perUrl == null ? null : perUrl.trim();
    }

    public String getPerRemark() {
        return perRemark;
    }

    public void setPerRemark(String perRemark) {
        this.perRemark = perRemark == null ? null : perRemark.trim();
    }

    public String getPerExtra() {
        return perExtra;
    }

    public void setPerExtra(String perExtra) {
        this.perExtra = perExtra == null ? null : perExtra.trim();
    }
}