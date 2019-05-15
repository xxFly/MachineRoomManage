package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPerIdIsNull() {
            addCriterion("per_id is null");
            return (Criteria) this;
        }

        public Criteria andPerIdIsNotNull() {
            addCriterion("per_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerIdEqualTo(String value) {
            addCriterion("per_id =", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotEqualTo(String value) {
            addCriterion("per_id <>", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThan(String value) {
            addCriterion("per_id >", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdGreaterThanOrEqualTo(String value) {
            addCriterion("per_id >=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThan(String value) {
            addCriterion("per_id <", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLessThanOrEqualTo(String value) {
            addCriterion("per_id <=", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdLike(String value) {
            addCriterion("per_id like", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotLike(String value) {
            addCriterion("per_id not like", value, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdIn(List<String> values) {
            addCriterion("per_id in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotIn(List<String> values) {
            addCriterion("per_id not in", values, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdBetween(String value1, String value2) {
            addCriterion("per_id between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andPerIdNotBetween(String value1, String value2) {
            addCriterion("per_id not between", value1, value2, "perId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNull() {
            addCriterion("per_url is null");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNotNull() {
            addCriterion("per_url is not null");
            return (Criteria) this;
        }

        public Criteria andPerUrlEqualTo(String value) {
            addCriterion("per_url =", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotEqualTo(String value) {
            addCriterion("per_url <>", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThan(String value) {
            addCriterion("per_url >", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("per_url >=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThan(String value) {
            addCriterion("per_url <", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThanOrEqualTo(String value) {
            addCriterion("per_url <=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLike(String value) {
            addCriterion("per_url like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotLike(String value) {
            addCriterion("per_url not like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlIn(List<String> values) {
            addCriterion("per_url in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotIn(List<String> values) {
            addCriterion("per_url not in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlBetween(String value1, String value2) {
            addCriterion("per_url between", value1, value2, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotBetween(String value1, String value2) {
            addCriterion("per_url not between", value1, value2, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerRemarkIsNull() {
            addCriterion("per_remark is null");
            return (Criteria) this;
        }

        public Criteria andPerRemarkIsNotNull() {
            addCriterion("per_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPerRemarkEqualTo(String value) {
            addCriterion("per_remark =", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkNotEqualTo(String value) {
            addCriterion("per_remark <>", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkGreaterThan(String value) {
            addCriterion("per_remark >", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("per_remark >=", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkLessThan(String value) {
            addCriterion("per_remark <", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkLessThanOrEqualTo(String value) {
            addCriterion("per_remark <=", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkLike(String value) {
            addCriterion("per_remark like", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkNotLike(String value) {
            addCriterion("per_remark not like", value, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkIn(List<String> values) {
            addCriterion("per_remark in", values, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkNotIn(List<String> values) {
            addCriterion("per_remark not in", values, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkBetween(String value1, String value2) {
            addCriterion("per_remark between", value1, value2, "perRemark");
            return (Criteria) this;
        }

        public Criteria andPerRemarkNotBetween(String value1, String value2) {
            addCriterion("per_remark not between", value1, value2, "perRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}