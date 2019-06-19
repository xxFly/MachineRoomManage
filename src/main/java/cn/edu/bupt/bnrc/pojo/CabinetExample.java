package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CabinetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CabinetExample() {
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

        public Criteria andCabIdIsNull() {
            addCriterion("cab_id is null");
            return (Criteria) this;
        }

        public Criteria andCabIdIsNotNull() {
            addCriterion("cab_id is not null");
            return (Criteria) this;
        }

        public Criteria andCabIdEqualTo(Integer value) {
            addCriterion("cab_id =", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdNotEqualTo(Integer value) {
            addCriterion("cab_id <>", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdGreaterThan(Integer value) {
            addCriterion("cab_id >", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cab_id >=", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdLessThan(Integer value) {
            addCriterion("cab_id <", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdLessThanOrEqualTo(Integer value) {
            addCriterion("cab_id <=", value, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdIn(List<Integer> values) {
            addCriterion("cab_id in", values, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdNotIn(List<Integer> values) {
            addCriterion("cab_id not in", values, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdBetween(Integer value1, Integer value2) {
            addCriterion("cab_id between", value1, value2, "cabId");
            return (Criteria) this;
        }

        public Criteria andCabIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cab_id not between", value1, value2, "cabId");
            return (Criteria) this;
        }

        public Criteria andMrIdIsNull() {
            addCriterion("mr_id is null");
            return (Criteria) this;
        }

        public Criteria andMrIdIsNotNull() {
            addCriterion("mr_id is not null");
            return (Criteria) this;
        }

        public Criteria andMrIdEqualTo(Integer value) {
            addCriterion("mr_id =", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdNotEqualTo(Integer value) {
            addCriterion("mr_id <>", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdGreaterThan(Integer value) {
            addCriterion("mr_id >", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mr_id >=", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdLessThan(Integer value) {
            addCriterion("mr_id <", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdLessThanOrEqualTo(Integer value) {
            addCriterion("mr_id <=", value, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdIn(List<Integer> values) {
            addCriterion("mr_id in", values, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdNotIn(List<Integer> values) {
            addCriterion("mr_id not in", values, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdBetween(Integer value1, Integer value2) {
            addCriterion("mr_id between", value1, value2, "mrId");
            return (Criteria) this;
        }

        public Criteria andMrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mr_id not between", value1, value2, "mrId");
            return (Criteria) this;
        }

        public Criteria andCabNameIsNull() {
            addCriterion("cab_name is null");
            return (Criteria) this;
        }

        public Criteria andCabNameIsNotNull() {
            addCriterion("cab_name is not null");
            return (Criteria) this;
        }

        public Criteria andCabNameEqualTo(String value) {
            addCriterion("cab_name =", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameNotEqualTo(String value) {
            addCriterion("cab_name <>", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameGreaterThan(String value) {
            addCriterion("cab_name >", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameGreaterThanOrEqualTo(String value) {
            addCriterion("cab_name >=", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameLessThan(String value) {
            addCriterion("cab_name <", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameLessThanOrEqualTo(String value) {
            addCriterion("cab_name <=", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameLike(String value) {
            addCriterion("cab_name like", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameNotLike(String value) {
            addCriterion("cab_name not like", value, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameIn(List<String> values) {
            addCriterion("cab_name in", values, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameNotIn(List<String> values) {
            addCriterion("cab_name not in", values, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameBetween(String value1, String value2) {
            addCriterion("cab_name between", value1, value2, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabNameNotBetween(String value1, String value2) {
            addCriterion("cab_name not between", value1, value2, "cabName");
            return (Criteria) this;
        }

        public Criteria andCabLengthIsNull() {
            addCriterion("cab_length is null");
            return (Criteria) this;
        }

        public Criteria andCabLengthIsNotNull() {
            addCriterion("cab_length is not null");
            return (Criteria) this;
        }

        public Criteria andCabLengthEqualTo(String value) {
            addCriterion("cab_length =", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthNotEqualTo(String value) {
            addCriterion("cab_length <>", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthGreaterThan(String value) {
            addCriterion("cab_length >", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthGreaterThanOrEqualTo(String value) {
            addCriterion("cab_length >=", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthLessThan(String value) {
            addCriterion("cab_length <", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthLessThanOrEqualTo(String value) {
            addCriterion("cab_length <=", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthLike(String value) {
            addCriterion("cab_length like", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthNotLike(String value) {
            addCriterion("cab_length not like", value, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthIn(List<String> values) {
            addCriterion("cab_length in", values, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthNotIn(List<String> values) {
            addCriterion("cab_length not in", values, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthBetween(String value1, String value2) {
            addCriterion("cab_length between", value1, value2, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabLengthNotBetween(String value1, String value2) {
            addCriterion("cab_length not between", value1, value2, "cabLength");
            return (Criteria) this;
        }

        public Criteria andCabWidthIsNull() {
            addCriterion("cab_width is null");
            return (Criteria) this;
        }

        public Criteria andCabWidthIsNotNull() {
            addCriterion("cab_width is not null");
            return (Criteria) this;
        }

        public Criteria andCabWidthEqualTo(String value) {
            addCriterion("cab_width =", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthNotEqualTo(String value) {
            addCriterion("cab_width <>", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthGreaterThan(String value) {
            addCriterion("cab_width >", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthGreaterThanOrEqualTo(String value) {
            addCriterion("cab_width >=", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthLessThan(String value) {
            addCriterion("cab_width <", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthLessThanOrEqualTo(String value) {
            addCriterion("cab_width <=", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthLike(String value) {
            addCriterion("cab_width like", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthNotLike(String value) {
            addCriterion("cab_width not like", value, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthIn(List<String> values) {
            addCriterion("cab_width in", values, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthNotIn(List<String> values) {
            addCriterion("cab_width not in", values, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthBetween(String value1, String value2) {
            addCriterion("cab_width between", value1, value2, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabWidthNotBetween(String value1, String value2) {
            addCriterion("cab_width not between", value1, value2, "cabWidth");
            return (Criteria) this;
        }

        public Criteria andCabHeightIsNull() {
            addCriterion("cab_height is null");
            return (Criteria) this;
        }

        public Criteria andCabHeightIsNotNull() {
            addCriterion("cab_height is not null");
            return (Criteria) this;
        }

        public Criteria andCabHeightEqualTo(String value) {
            addCriterion("cab_height =", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightNotEqualTo(String value) {
            addCriterion("cab_height <>", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightGreaterThan(String value) {
            addCriterion("cab_height >", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightGreaterThanOrEqualTo(String value) {
            addCriterion("cab_height >=", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightLessThan(String value) {
            addCriterion("cab_height <", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightLessThanOrEqualTo(String value) {
            addCriterion("cab_height <=", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightLike(String value) {
            addCriterion("cab_height like", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightNotLike(String value) {
            addCriterion("cab_height not like", value, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightIn(List<String> values) {
            addCriterion("cab_height in", values, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightNotIn(List<String> values) {
            addCriterion("cab_height not in", values, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightBetween(String value1, String value2) {
            addCriterion("cab_height between", value1, value2, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabHeightNotBetween(String value1, String value2) {
            addCriterion("cab_height not between", value1, value2, "cabHeight");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumIsNull() {
            addCriterion("cab_unit_num is null");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumIsNotNull() {
            addCriterion("cab_unit_num is not null");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumEqualTo(String value) {
            addCriterion("cab_unit_num =", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumNotEqualTo(String value) {
            addCriterion("cab_unit_num <>", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumGreaterThan(String value) {
            addCriterion("cab_unit_num >", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumGreaterThanOrEqualTo(String value) {
            addCriterion("cab_unit_num >=", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumLessThan(String value) {
            addCriterion("cab_unit_num <", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumLessThanOrEqualTo(String value) {
            addCriterion("cab_unit_num <=", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumLike(String value) {
            addCriterion("cab_unit_num like", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumNotLike(String value) {
            addCriterion("cab_unit_num not like", value, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumIn(List<String> values) {
            addCriterion("cab_unit_num in", values, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumNotIn(List<String> values) {
            addCriterion("cab_unit_num not in", values, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumBetween(String value1, String value2) {
            addCriterion("cab_unit_num between", value1, value2, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabUnitNumNotBetween(String value1, String value2) {
            addCriterion("cab_unit_num not between", value1, value2, "cabUnitNum");
            return (Criteria) this;
        }

        public Criteria andCabLocationIsNull() {
            addCriterion("cab_location is null");
            return (Criteria) this;
        }

        public Criteria andCabLocationIsNotNull() {
            addCriterion("cab_location is not null");
            return (Criteria) this;
        }

        public Criteria andCabLocationEqualTo(String value) {
            addCriterion("cab_location =", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationNotEqualTo(String value) {
            addCriterion("cab_location <>", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationGreaterThan(String value) {
            addCriterion("cab_location >", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationGreaterThanOrEqualTo(String value) {
            addCriterion("cab_location >=", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationLessThan(String value) {
            addCriterion("cab_location <", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationLessThanOrEqualTo(String value) {
            addCriterion("cab_location <=", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationLike(String value) {
            addCriterion("cab_location like", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationNotLike(String value) {
            addCriterion("cab_location not like", value, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationIn(List<String> values) {
            addCriterion("cab_location in", values, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationNotIn(List<String> values) {
            addCriterion("cab_location not in", values, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationBetween(String value1, String value2) {
            addCriterion("cab_location between", value1, value2, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabLocationNotBetween(String value1, String value2) {
            addCriterion("cab_location not between", value1, value2, "cabLocation");
            return (Criteria) this;
        }

        public Criteria andCabRemarkIsNull() {
            addCriterion("cab_remark is null");
            return (Criteria) this;
        }

        public Criteria andCabRemarkIsNotNull() {
            addCriterion("cab_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCabRemarkEqualTo(String value) {
            addCriterion("cab_remark =", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkNotEqualTo(String value) {
            addCriterion("cab_remark <>", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkGreaterThan(String value) {
            addCriterion("cab_remark >", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cab_remark >=", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkLessThan(String value) {
            addCriterion("cab_remark <", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkLessThanOrEqualTo(String value) {
            addCriterion("cab_remark <=", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkLike(String value) {
            addCriterion("cab_remark like", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkNotLike(String value) {
            addCriterion("cab_remark not like", value, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkIn(List<String> values) {
            addCriterion("cab_remark in", values, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkNotIn(List<String> values) {
            addCriterion("cab_remark not in", values, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkBetween(String value1, String value2) {
            addCriterion("cab_remark between", value1, value2, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabRemarkNotBetween(String value1, String value2) {
            addCriterion("cab_remark not between", value1, value2, "cabRemark");
            return (Criteria) this;
        }

        public Criteria andCabExtraIsNull() {
            addCriterion("cab_extra is null");
            return (Criteria) this;
        }

        public Criteria andCabExtraIsNotNull() {
            addCriterion("cab_extra is not null");
            return (Criteria) this;
        }

        public Criteria andCabExtraEqualTo(String value) {
            addCriterion("cab_extra =", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraNotEqualTo(String value) {
            addCriterion("cab_extra <>", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraGreaterThan(String value) {
            addCriterion("cab_extra >", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraGreaterThanOrEqualTo(String value) {
            addCriterion("cab_extra >=", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraLessThan(String value) {
            addCriterion("cab_extra <", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraLessThanOrEqualTo(String value) {
            addCriterion("cab_extra <=", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraLike(String value) {
            addCriterion("cab_extra like", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraNotLike(String value) {
            addCriterion("cab_extra not like", value, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraIn(List<String> values) {
            addCriterion("cab_extra in", values, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraNotIn(List<String> values) {
            addCriterion("cab_extra not in", values, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraBetween(String value1, String value2) {
            addCriterion("cab_extra between", value1, value2, "cabExtra");
            return (Criteria) this;
        }

        public Criteria andCabExtraNotBetween(String value1, String value2) {
            addCriterion("cab_extra not between", value1, value2, "cabExtra");
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