package cn.edu.bupt.bnrc.pojo;

public class Permission {
    private String perId;

    private String roleId;

    private String perUrl;

    private String perRemark;

    public String getPerId() {
        return perId;
    }

    public void setPerId(String perId) {
        this.perId = perId == null ? null : perId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
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
}