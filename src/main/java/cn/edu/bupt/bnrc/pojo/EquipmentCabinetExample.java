package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentCabinetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentCabinetExample() {
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

        public Criteria andEquipCabIdIsNull() {
            addCriterion("equip_cab_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdIsNotNull() {
            addCriterion("equip_cab_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdEqualTo(Integer value) {
            addCriterion("equip_cab_id =", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdNotEqualTo(Integer value) {
            addCriterion("equip_cab_id <>", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdGreaterThan(Integer value) {
            addCriterion("equip_cab_id >", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_cab_id >=", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdLessThan(Integer value) {
            addCriterion("equip_cab_id <", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdLessThanOrEqualTo(Integer value) {
            addCriterion("equip_cab_id <=", value, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdIn(List<Integer> values) {
            addCriterion("equip_cab_id in", values, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdNotIn(List<Integer> values) {
            addCriterion("equip_cab_id not in", values, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdBetween(Integer value1, Integer value2) {
            addCriterion("equip_cab_id between", value1, value2, "equipCabId");
            return (Criteria) this;
        }

        public Criteria andEquipCabIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_cab_id not between", value1, value2, "equipCabId");
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

        public Criteria andEquipCabNameIsNull() {
            addCriterion("equip_cab_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameIsNotNull() {
            addCriterion("equip_cab_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameEqualTo(String value) {
            addCriterion("equip_cab_name =", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameNotEqualTo(String value) {
            addCriterion("equip_cab_name <>", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameGreaterThan(String value) {
            addCriterion("equip_cab_name >", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_name >=", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameLessThan(String value) {
            addCriterion("equip_cab_name <", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_name <=", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameLike(String value) {
            addCriterion("equip_cab_name like", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameNotLike(String value) {
            addCriterion("equip_cab_name not like", value, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameIn(List<String> values) {
            addCriterion("equip_cab_name in", values, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameNotIn(List<String> values) {
            addCriterion("equip_cab_name not in", values, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameBetween(String value1, String value2) {
            addCriterion("equip_cab_name between", value1, value2, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabNameNotBetween(String value1, String value2) {
            addCriterion("equip_cab_name not between", value1, value2, "equipCabName");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthIsNull() {
            addCriterion("equip_cab_length is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthIsNotNull() {
            addCriterion("equip_cab_length is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthEqualTo(String value) {
            addCriterion("equip_cab_length =", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthNotEqualTo(String value) {
            addCriterion("equip_cab_length <>", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthGreaterThan(String value) {
            addCriterion("equip_cab_length >", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_length >=", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthLessThan(String value) {
            addCriterion("equip_cab_length <", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_length <=", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthLike(String value) {
            addCriterion("equip_cab_length like", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthNotLike(String value) {
            addCriterion("equip_cab_length not like", value, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthIn(List<String> values) {
            addCriterion("equip_cab_length in", values, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthNotIn(List<String> values) {
            addCriterion("equip_cab_length not in", values, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthBetween(String value1, String value2) {
            addCriterion("equip_cab_length between", value1, value2, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabLengthNotBetween(String value1, String value2) {
            addCriterion("equip_cab_length not between", value1, value2, "equipCabLength");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthIsNull() {
            addCriterion("equip_cab_width is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthIsNotNull() {
            addCriterion("equip_cab_width is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthEqualTo(String value) {
            addCriterion("equip_cab_width =", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthNotEqualTo(String value) {
            addCriterion("equip_cab_width <>", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthGreaterThan(String value) {
            addCriterion("equip_cab_width >", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_width >=", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthLessThan(String value) {
            addCriterion("equip_cab_width <", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_width <=", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthLike(String value) {
            addCriterion("equip_cab_width like", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthNotLike(String value) {
            addCriterion("equip_cab_width not like", value, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthIn(List<String> values) {
            addCriterion("equip_cab_width in", values, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthNotIn(List<String> values) {
            addCriterion("equip_cab_width not in", values, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthBetween(String value1, String value2) {
            addCriterion("equip_cab_width between", value1, value2, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabWidthNotBetween(String value1, String value2) {
            addCriterion("equip_cab_width not between", value1, value2, "equipCabWidth");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightIsNull() {
            addCriterion("equip_cab_height is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightIsNotNull() {
            addCriterion("equip_cab_height is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightEqualTo(String value) {
            addCriterion("equip_cab_height =", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightNotEqualTo(String value) {
            addCriterion("equip_cab_height <>", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightGreaterThan(String value) {
            addCriterion("equip_cab_height >", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_height >=", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightLessThan(String value) {
            addCriterion("equip_cab_height <", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_height <=", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightLike(String value) {
            addCriterion("equip_cab_height like", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightNotLike(String value) {
            addCriterion("equip_cab_height not like", value, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightIn(List<String> values) {
            addCriterion("equip_cab_height in", values, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightNotIn(List<String> values) {
            addCriterion("equip_cab_height not in", values, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightBetween(String value1, String value2) {
            addCriterion("equip_cab_height between", value1, value2, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabHeightNotBetween(String value1, String value2) {
            addCriterion("equip_cab_height not between", value1, value2, "equipCabHeight");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumIsNull() {
            addCriterion("equip_cab_unit_num is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumIsNotNull() {
            addCriterion("equip_cab_unit_num is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumEqualTo(String value) {
            addCriterion("equip_cab_unit_num =", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumNotEqualTo(String value) {
            addCriterion("equip_cab_unit_num <>", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumGreaterThan(String value) {
            addCriterion("equip_cab_unit_num >", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_unit_num >=", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumLessThan(String value) {
            addCriterion("equip_cab_unit_num <", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_unit_num <=", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumLike(String value) {
            addCriterion("equip_cab_unit_num like", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumNotLike(String value) {
            addCriterion("equip_cab_unit_num not like", value, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumIn(List<String> values) {
            addCriterion("equip_cab_unit_num in", values, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumNotIn(List<String> values) {
            addCriterion("equip_cab_unit_num not in", values, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumBetween(String value1, String value2) {
            addCriterion("equip_cab_unit_num between", value1, value2, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabUnitNumNotBetween(String value1, String value2) {
            addCriterion("equip_cab_unit_num not between", value1, value2, "equipCabUnitNum");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationIsNull() {
            addCriterion("equip_cab_location is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationIsNotNull() {
            addCriterion("equip_cab_location is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationEqualTo(String value) {
            addCriterion("equip_cab_location =", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationNotEqualTo(String value) {
            addCriterion("equip_cab_location <>", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationGreaterThan(String value) {
            addCriterion("equip_cab_location >", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_location >=", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationLessThan(String value) {
            addCriterion("equip_cab_location <", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_location <=", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationLike(String value) {
            addCriterion("equip_cab_location like", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationNotLike(String value) {
            addCriterion("equip_cab_location not like", value, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationIn(List<String> values) {
            addCriterion("equip_cab_location in", values, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationNotIn(List<String> values) {
            addCriterion("equip_cab_location not in", values, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationBetween(String value1, String value2) {
            addCriterion("equip_cab_location between", value1, value2, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabLocationNotBetween(String value1, String value2) {
            addCriterion("equip_cab_location not between", value1, value2, "equipCabLocation");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkIsNull() {
            addCriterion("equip_cab_remark is null");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkIsNotNull() {
            addCriterion("equip_cab_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkEqualTo(String value) {
            addCriterion("equip_cab_remark =", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkNotEqualTo(String value) {
            addCriterion("equip_cab_remark <>", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkGreaterThan(String value) {
            addCriterion("equip_cab_remark >", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("equip_cab_remark >=", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkLessThan(String value) {
            addCriterion("equip_cab_remark <", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkLessThanOrEqualTo(String value) {
            addCriterion("equip_cab_remark <=", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkLike(String value) {
            addCriterion("equip_cab_remark like", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkNotLike(String value) {
            addCriterion("equip_cab_remark not like", value, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkIn(List<String> values) {
            addCriterion("equip_cab_remark in", values, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkNotIn(List<String> values) {
            addCriterion("equip_cab_remark not in", values, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkBetween(String value1, String value2) {
            addCriterion("equip_cab_remark between", value1, value2, "equipCabRemark");
            return (Criteria) this;
        }

        public Criteria andEquipCabRemarkNotBetween(String value1, String value2) {
            addCriterion("equip_cab_remark not between", value1, value2, "equipCabRemark");
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