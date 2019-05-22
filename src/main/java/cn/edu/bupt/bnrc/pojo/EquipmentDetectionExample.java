package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentDetectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentDetectionExample() {
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

        public Criteria andEquipTimeIsNull() {
            addCriterion("equip_time is null");
            return (Criteria) this;
        }

        public Criteria andEquipTimeIsNotNull() {
            addCriterion("equip_time is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTimeEqualTo(String value) {
            addCriterion("equip_time =", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeNotEqualTo(String value) {
            addCriterion("equip_time <>", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeGreaterThan(String value) {
            addCriterion("equip_time >", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeGreaterThanOrEqualTo(String value) {
            addCriterion("equip_time >=", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeLessThan(String value) {
            addCriterion("equip_time <", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeLessThanOrEqualTo(String value) {
            addCriterion("equip_time <=", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeLike(String value) {
            addCriterion("equip_time like", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeNotLike(String value) {
            addCriterion("equip_time not like", value, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeIn(List<String> values) {
            addCriterion("equip_time in", values, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeNotIn(List<String> values) {
            addCriterion("equip_time not in", values, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeBetween(String value1, String value2) {
            addCriterion("equip_time between", value1, value2, "equipTime");
            return (Criteria) this;
        }

        public Criteria andEquipTimeNotBetween(String value1, String value2) {
            addCriterion("equip_time not between", value1, value2, "equipTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIsNull() {
            addCriterion("equip_brand is null");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIsNotNull() {
            addCriterion("equip_brand is not null");
            return (Criteria) this;
        }

        public Criteria andEquipBrandEqualTo(String value) {
            addCriterion("equip_brand =", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotEqualTo(String value) {
            addCriterion("equip_brand <>", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandGreaterThan(String value) {
            addCriterion("equip_brand >", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandGreaterThanOrEqualTo(String value) {
            addCriterion("equip_brand >=", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLessThan(String value) {
            addCriterion("equip_brand <", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLessThanOrEqualTo(String value) {
            addCriterion("equip_brand <=", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandLike(String value) {
            addCriterion("equip_brand like", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotLike(String value) {
            addCriterion("equip_brand not like", value, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandIn(List<String> values) {
            addCriterion("equip_brand in", values, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotIn(List<String> values) {
            addCriterion("equip_brand not in", values, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandBetween(String value1, String value2) {
            addCriterion("equip_brand between", value1, value2, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipBrandNotBetween(String value1, String value2) {
            addCriterion("equip_brand not between", value1, value2, "equipBrand");
            return (Criteria) this;
        }

        public Criteria andEquipVersionIsNull() {
            addCriterion("equip_version is null");
            return (Criteria) this;
        }

        public Criteria andEquipVersionIsNotNull() {
            addCriterion("equip_version is not null");
            return (Criteria) this;
        }

        public Criteria andEquipVersionEqualTo(String value) {
            addCriterion("equip_version =", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionNotEqualTo(String value) {
            addCriterion("equip_version <>", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionGreaterThan(String value) {
            addCriterion("equip_version >", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionGreaterThanOrEqualTo(String value) {
            addCriterion("equip_version >=", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionLessThan(String value) {
            addCriterion("equip_version <", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionLessThanOrEqualTo(String value) {
            addCriterion("equip_version <=", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionLike(String value) {
            addCriterion("equip_version like", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionNotLike(String value) {
            addCriterion("equip_version not like", value, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionIn(List<String> values) {
            addCriterion("equip_version in", values, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionNotIn(List<String> values) {
            addCriterion("equip_version not in", values, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionBetween(String value1, String value2) {
            addCriterion("equip_version between", value1, value2, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipVersionNotBetween(String value1, String value2) {
            addCriterion("equip_version not between", value1, value2, "equipVersion");
            return (Criteria) this;
        }

        public Criteria andEquipLocationIsNull() {
            addCriterion("equip_location is null");
            return (Criteria) this;
        }

        public Criteria andEquipLocationIsNotNull() {
            addCriterion("equip_location is not null");
            return (Criteria) this;
        }

        public Criteria andEquipLocationEqualTo(String value) {
            addCriterion("equip_location =", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationNotEqualTo(String value) {
            addCriterion("equip_location <>", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationGreaterThan(String value) {
            addCriterion("equip_location >", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationGreaterThanOrEqualTo(String value) {
            addCriterion("equip_location >=", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationLessThan(String value) {
            addCriterion("equip_location <", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationLessThanOrEqualTo(String value) {
            addCriterion("equip_location <=", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationLike(String value) {
            addCriterion("equip_location like", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationNotLike(String value) {
            addCriterion("equip_location not like", value, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationIn(List<String> values) {
            addCriterion("equip_location in", values, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationNotIn(List<String> values) {
            addCriterion("equip_location not in", values, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationBetween(String value1, String value2) {
            addCriterion("equip_location between", value1, value2, "equipLocation");
            return (Criteria) this;
        }

        public Criteria andEquipLocationNotBetween(String value1, String value2) {
            addCriterion("equip_location not between", value1, value2, "equipLocation");
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