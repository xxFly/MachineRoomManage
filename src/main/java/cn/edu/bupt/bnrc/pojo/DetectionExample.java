package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class DetectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetectionExample() {
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

        public Criteria andDetectIdIsNull() {
            addCriterion("detect_id is null");
            return (Criteria) this;
        }

        public Criteria andDetectIdIsNotNull() {
            addCriterion("detect_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetectIdEqualTo(Integer value) {
            addCriterion("detect_id =", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdNotEqualTo(Integer value) {
            addCriterion("detect_id <>", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdGreaterThan(Integer value) {
            addCriterion("detect_id >", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detect_id >=", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdLessThan(Integer value) {
            addCriterion("detect_id <", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdLessThanOrEqualTo(Integer value) {
            addCriterion("detect_id <=", value, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdIn(List<Integer> values) {
            addCriterion("detect_id in", values, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdNotIn(List<Integer> values) {
            addCriterion("detect_id not in", values, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdBetween(Integer value1, Integer value2) {
            addCriterion("detect_id between", value1, value2, "detectId");
            return (Criteria) this;
        }

        public Criteria andDetectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detect_id not between", value1, value2, "detectId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDetectBrandIsNull() {
            addCriterion("detect_brand is null");
            return (Criteria) this;
        }

        public Criteria andDetectBrandIsNotNull() {
            addCriterion("detect_brand is not null");
            return (Criteria) this;
        }

        public Criteria andDetectBrandEqualTo(String value) {
            addCriterion("detect_brand =", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandNotEqualTo(String value) {
            addCriterion("detect_brand <>", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandGreaterThan(String value) {
            addCriterion("detect_brand >", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandGreaterThanOrEqualTo(String value) {
            addCriterion("detect_brand >=", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandLessThan(String value) {
            addCriterion("detect_brand <", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandLessThanOrEqualTo(String value) {
            addCriterion("detect_brand <=", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandLike(String value) {
            addCriterion("detect_brand like", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandNotLike(String value) {
            addCriterion("detect_brand not like", value, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandIn(List<String> values) {
            addCriterion("detect_brand in", values, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandNotIn(List<String> values) {
            addCriterion("detect_brand not in", values, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandBetween(String value1, String value2) {
            addCriterion("detect_brand between", value1, value2, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectBrandNotBetween(String value1, String value2) {
            addCriterion("detect_brand not between", value1, value2, "detectBrand");
            return (Criteria) this;
        }

        public Criteria andDetectVersionIsNull() {
            addCriterion("detect_version is null");
            return (Criteria) this;
        }

        public Criteria andDetectVersionIsNotNull() {
            addCriterion("detect_version is not null");
            return (Criteria) this;
        }

        public Criteria andDetectVersionEqualTo(String value) {
            addCriterion("detect_version =", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionNotEqualTo(String value) {
            addCriterion("detect_version <>", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionGreaterThan(String value) {
            addCriterion("detect_version >", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionGreaterThanOrEqualTo(String value) {
            addCriterion("detect_version >=", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionLessThan(String value) {
            addCriterion("detect_version <", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionLessThanOrEqualTo(String value) {
            addCriterion("detect_version <=", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionLike(String value) {
            addCriterion("detect_version like", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionNotLike(String value) {
            addCriterion("detect_version not like", value, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionIn(List<String> values) {
            addCriterion("detect_version in", values, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionNotIn(List<String> values) {
            addCriterion("detect_version not in", values, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionBetween(String value1, String value2) {
            addCriterion("detect_version between", value1, value2, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectVersionNotBetween(String value1, String value2) {
            addCriterion("detect_version not between", value1, value2, "detectVersion");
            return (Criteria) this;
        }

        public Criteria andDetectLocationIsNull() {
            addCriterion("detect_location is null");
            return (Criteria) this;
        }

        public Criteria andDetectLocationIsNotNull() {
            addCriterion("detect_location is not null");
            return (Criteria) this;
        }

        public Criteria andDetectLocationEqualTo(String value) {
            addCriterion("detect_location =", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationNotEqualTo(String value) {
            addCriterion("detect_location <>", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationGreaterThan(String value) {
            addCriterion("detect_location >", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationGreaterThanOrEqualTo(String value) {
            addCriterion("detect_location >=", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationLessThan(String value) {
            addCriterion("detect_location <", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationLessThanOrEqualTo(String value) {
            addCriterion("detect_location <=", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationLike(String value) {
            addCriterion("detect_location like", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationNotLike(String value) {
            addCriterion("detect_location not like", value, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationIn(List<String> values) {
            addCriterion("detect_location in", values, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationNotIn(List<String> values) {
            addCriterion("detect_location not in", values, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationBetween(String value1, String value2) {
            addCriterion("detect_location between", value1, value2, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectLocationNotBetween(String value1, String value2) {
            addCriterion("detect_location not between", value1, value2, "detectLocation");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIsNull() {
            addCriterion("detect_time is null");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIsNotNull() {
            addCriterion("detect_time is not null");
            return (Criteria) this;
        }

        public Criteria andDetectTimeEqualTo(String value) {
            addCriterion("detect_time =", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotEqualTo(String value) {
            addCriterion("detect_time <>", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeGreaterThan(String value) {
            addCriterion("detect_time >", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeGreaterThanOrEqualTo(String value) {
            addCriterion("detect_time >=", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeLessThan(String value) {
            addCriterion("detect_time <", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeLessThanOrEqualTo(String value) {
            addCriterion("detect_time <=", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeLike(String value) {
            addCriterion("detect_time like", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotLike(String value) {
            addCriterion("detect_time not like", value, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeIn(List<String> values) {
            addCriterion("detect_time in", values, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotIn(List<String> values) {
            addCriterion("detect_time not in", values, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeBetween(String value1, String value2) {
            addCriterion("detect_time between", value1, value2, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectTimeNotBetween(String value1, String value2) {
            addCriterion("detect_time not between", value1, value2, "detectTime");
            return (Criteria) this;
        }

        public Criteria andDetectExtraIsNull() {
            addCriterion("detect_extra is null");
            return (Criteria) this;
        }

        public Criteria andDetectExtraIsNotNull() {
            addCriterion("detect_extra is not null");
            return (Criteria) this;
        }

        public Criteria andDetectExtraEqualTo(String value) {
            addCriterion("detect_extra =", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraNotEqualTo(String value) {
            addCriterion("detect_extra <>", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraGreaterThan(String value) {
            addCriterion("detect_extra >", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraGreaterThanOrEqualTo(String value) {
            addCriterion("detect_extra >=", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraLessThan(String value) {
            addCriterion("detect_extra <", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraLessThanOrEqualTo(String value) {
            addCriterion("detect_extra <=", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraLike(String value) {
            addCriterion("detect_extra like", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraNotLike(String value) {
            addCriterion("detect_extra not like", value, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraIn(List<String> values) {
            addCriterion("detect_extra in", values, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraNotIn(List<String> values) {
            addCriterion("detect_extra not in", values, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraBetween(String value1, String value2) {
            addCriterion("detect_extra between", value1, value2, "detectExtra");
            return (Criteria) this;
        }

        public Criteria andDetectExtraNotBetween(String value1, String value2) {
            addCriterion("detect_extra not between", value1, value2, "detectExtra");
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