package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class MachineroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineroomExample() {
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

        public Criteria andMrNameIsNull() {
            addCriterion("mr_name is null");
            return (Criteria) this;
        }

        public Criteria andMrNameIsNotNull() {
            addCriterion("mr_name is not null");
            return (Criteria) this;
        }

        public Criteria andMrNameEqualTo(String value) {
            addCriterion("mr_name =", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameNotEqualTo(String value) {
            addCriterion("mr_name <>", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameGreaterThan(String value) {
            addCriterion("mr_name >", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameGreaterThanOrEqualTo(String value) {
            addCriterion("mr_name >=", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameLessThan(String value) {
            addCriterion("mr_name <", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameLessThanOrEqualTo(String value) {
            addCriterion("mr_name <=", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameLike(String value) {
            addCriterion("mr_name like", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameNotLike(String value) {
            addCriterion("mr_name not like", value, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameIn(List<String> values) {
            addCriterion("mr_name in", values, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameNotIn(List<String> values) {
            addCriterion("mr_name not in", values, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameBetween(String value1, String value2) {
            addCriterion("mr_name between", value1, value2, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrNameNotBetween(String value1, String value2) {
            addCriterion("mr_name not between", value1, value2, "mrName");
            return (Criteria) this;
        }

        public Criteria andMrLengthIsNull() {
            addCriterion("mr_length is null");
            return (Criteria) this;
        }

        public Criteria andMrLengthIsNotNull() {
            addCriterion("mr_length is not null");
            return (Criteria) this;
        }

        public Criteria andMrLengthEqualTo(String value) {
            addCriterion("mr_length =", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthNotEqualTo(String value) {
            addCriterion("mr_length <>", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthGreaterThan(String value) {
            addCriterion("mr_length >", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthGreaterThanOrEqualTo(String value) {
            addCriterion("mr_length >=", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthLessThan(String value) {
            addCriterion("mr_length <", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthLessThanOrEqualTo(String value) {
            addCriterion("mr_length <=", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthLike(String value) {
            addCriterion("mr_length like", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthNotLike(String value) {
            addCriterion("mr_length not like", value, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthIn(List<String> values) {
            addCriterion("mr_length in", values, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthNotIn(List<String> values) {
            addCriterion("mr_length not in", values, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthBetween(String value1, String value2) {
            addCriterion("mr_length between", value1, value2, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrLengthNotBetween(String value1, String value2) {
            addCriterion("mr_length not between", value1, value2, "mrLength");
            return (Criteria) this;
        }

        public Criteria andMrWidthIsNull() {
            addCriterion("mr_width is null");
            return (Criteria) this;
        }

        public Criteria andMrWidthIsNotNull() {
            addCriterion("mr_width is not null");
            return (Criteria) this;
        }

        public Criteria andMrWidthEqualTo(String value) {
            addCriterion("mr_width =", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthNotEqualTo(String value) {
            addCriterion("mr_width <>", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthGreaterThan(String value) {
            addCriterion("mr_width >", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthGreaterThanOrEqualTo(String value) {
            addCriterion("mr_width >=", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthLessThan(String value) {
            addCriterion("mr_width <", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthLessThanOrEqualTo(String value) {
            addCriterion("mr_width <=", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthLike(String value) {
            addCriterion("mr_width like", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthNotLike(String value) {
            addCriterion("mr_width not like", value, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthIn(List<String> values) {
            addCriterion("mr_width in", values, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthNotIn(List<String> values) {
            addCriterion("mr_width not in", values, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthBetween(String value1, String value2) {
            addCriterion("mr_width between", value1, value2, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrWidthNotBetween(String value1, String value2) {
            addCriterion("mr_width not between", value1, value2, "mrWidth");
            return (Criteria) this;
        }

        public Criteria andMrHeightIsNull() {
            addCriterion("mr_height is null");
            return (Criteria) this;
        }

        public Criteria andMrHeightIsNotNull() {
            addCriterion("mr_height is not null");
            return (Criteria) this;
        }

        public Criteria andMrHeightEqualTo(String value) {
            addCriterion("mr_height =", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightNotEqualTo(String value) {
            addCriterion("mr_height <>", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightGreaterThan(String value) {
            addCriterion("mr_height >", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightGreaterThanOrEqualTo(String value) {
            addCriterion("mr_height >=", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightLessThan(String value) {
            addCriterion("mr_height <", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightLessThanOrEqualTo(String value) {
            addCriterion("mr_height <=", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightLike(String value) {
            addCriterion("mr_height like", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightNotLike(String value) {
            addCriterion("mr_height not like", value, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightIn(List<String> values) {
            addCriterion("mr_height in", values, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightNotIn(List<String> values) {
            addCriterion("mr_height not in", values, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightBetween(String value1, String value2) {
            addCriterion("mr_height between", value1, value2, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrHeightNotBetween(String value1, String value2) {
            addCriterion("mr_height not between", value1, value2, "mrHeight");
            return (Criteria) this;
        }

        public Criteria andMrPictureIsNull() {
            addCriterion("mr_picture is null");
            return (Criteria) this;
        }

        public Criteria andMrPictureIsNotNull() {
            addCriterion("mr_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMrPictureEqualTo(String value) {
            addCriterion("mr_picture =", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureNotEqualTo(String value) {
            addCriterion("mr_picture <>", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureGreaterThan(String value) {
            addCriterion("mr_picture >", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureGreaterThanOrEqualTo(String value) {
            addCriterion("mr_picture >=", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureLessThan(String value) {
            addCriterion("mr_picture <", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureLessThanOrEqualTo(String value) {
            addCriterion("mr_picture <=", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureLike(String value) {
            addCriterion("mr_picture like", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureNotLike(String value) {
            addCriterion("mr_picture not like", value, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureIn(List<String> values) {
            addCriterion("mr_picture in", values, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureNotIn(List<String> values) {
            addCriterion("mr_picture not in", values, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureBetween(String value1, String value2) {
            addCriterion("mr_picture between", value1, value2, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrPictureNotBetween(String value1, String value2) {
            addCriterion("mr_picture not between", value1, value2, "mrPicture");
            return (Criteria) this;
        }

        public Criteria andMrModelIsNull() {
            addCriterion("mr_model is null");
            return (Criteria) this;
        }

        public Criteria andMrModelIsNotNull() {
            addCriterion("mr_model is not null");
            return (Criteria) this;
        }

        public Criteria andMrModelEqualTo(String value) {
            addCriterion("mr_model =", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelNotEqualTo(String value) {
            addCriterion("mr_model <>", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelGreaterThan(String value) {
            addCriterion("mr_model >", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelGreaterThanOrEqualTo(String value) {
            addCriterion("mr_model >=", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelLessThan(String value) {
            addCriterion("mr_model <", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelLessThanOrEqualTo(String value) {
            addCriterion("mr_model <=", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelLike(String value) {
            addCriterion("mr_model like", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelNotLike(String value) {
            addCriterion("mr_model not like", value, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelIn(List<String> values) {
            addCriterion("mr_model in", values, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelNotIn(List<String> values) {
            addCriterion("mr_model not in", values, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelBetween(String value1, String value2) {
            addCriterion("mr_model between", value1, value2, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrModelNotBetween(String value1, String value2) {
            addCriterion("mr_model not between", value1, value2, "mrModel");
            return (Criteria) this;
        }

        public Criteria andMrLocationIsNull() {
            addCriterion("mr_location is null");
            return (Criteria) this;
        }

        public Criteria andMrLocationIsNotNull() {
            addCriterion("mr_location is not null");
            return (Criteria) this;
        }

        public Criteria andMrLocationEqualTo(String value) {
            addCriterion("mr_location =", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationNotEqualTo(String value) {
            addCriterion("mr_location <>", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationGreaterThan(String value) {
            addCriterion("mr_location >", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationGreaterThanOrEqualTo(String value) {
            addCriterion("mr_location >=", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationLessThan(String value) {
            addCriterion("mr_location <", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationLessThanOrEqualTo(String value) {
            addCriterion("mr_location <=", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationLike(String value) {
            addCriterion("mr_location like", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationNotLike(String value) {
            addCriterion("mr_location not like", value, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationIn(List<String> values) {
            addCriterion("mr_location in", values, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationNotIn(List<String> values) {
            addCriterion("mr_location not in", values, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationBetween(String value1, String value2) {
            addCriterion("mr_location between", value1, value2, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrLocationNotBetween(String value1, String value2) {
            addCriterion("mr_location not between", value1, value2, "mrLocation");
            return (Criteria) this;
        }

        public Criteria andMrRemarkIsNull() {
            addCriterion("mr_remark is null");
            return (Criteria) this;
        }

        public Criteria andMrRemarkIsNotNull() {
            addCriterion("mr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMrRemarkEqualTo(String value) {
            addCriterion("mr_remark =", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkNotEqualTo(String value) {
            addCriterion("mr_remark <>", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkGreaterThan(String value) {
            addCriterion("mr_remark >", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mr_remark >=", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkLessThan(String value) {
            addCriterion("mr_remark <", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkLessThanOrEqualTo(String value) {
            addCriterion("mr_remark <=", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkLike(String value) {
            addCriterion("mr_remark like", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkNotLike(String value) {
            addCriterion("mr_remark not like", value, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkIn(List<String> values) {
            addCriterion("mr_remark in", values, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkNotIn(List<String> values) {
            addCriterion("mr_remark not in", values, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkBetween(String value1, String value2) {
            addCriterion("mr_remark between", value1, value2, "mrRemark");
            return (Criteria) this;
        }

        public Criteria andMrRemarkNotBetween(String value1, String value2) {
            addCriterion("mr_remark not between", value1, value2, "mrRemark");
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