package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIsNull() {
            addCriterion("user_headImage is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIsNotNull() {
            addCriterion("user_headImage is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageEqualTo(String value) {
            addCriterion("user_headImage =", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotEqualTo(String value) {
            addCriterion("user_headImage <>", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageGreaterThan(String value) {
            addCriterion("user_headImage >", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageGreaterThanOrEqualTo(String value) {
            addCriterion("user_headImage >=", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLessThan(String value) {
            addCriterion("user_headImage <", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLessThanOrEqualTo(String value) {
            addCriterion("user_headImage <=", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageLike(String value) {
            addCriterion("user_headImage like", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotLike(String value) {
            addCriterion("user_headImage not like", value, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageIn(List<String> values) {
            addCriterion("user_headImage in", values, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotIn(List<String> values) {
            addCriterion("user_headImage not in", values, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageBetween(String value1, String value2) {
            addCriterion("user_headImage between", value1, value2, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserHeadimageNotBetween(String value1, String value2) {
            addCriterion("user_headImage not between", value1, value2, "userHeadimage");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNull() {
            addCriterion("user_signature is null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIsNotNull() {
            addCriterion("user_signature is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignatureEqualTo(String value) {
            addCriterion("user_signature =", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotEqualTo(String value) {
            addCriterion("user_signature <>", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThan(String value) {
            addCriterion("user_signature >", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("user_signature >=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThan(String value) {
            addCriterion("user_signature <", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLessThanOrEqualTo(String value) {
            addCriterion("user_signature <=", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureLike(String value) {
            addCriterion("user_signature like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotLike(String value) {
            addCriterion("user_signature not like", value, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureIn(List<String> values) {
            addCriterion("user_signature in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotIn(List<String> values) {
            addCriterion("user_signature not in", values, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureBetween(String value1, String value2) {
            addCriterion("user_signature between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserSignatureNotBetween(String value1, String value2) {
            addCriterion("user_signature not between", value1, value2, "userSignature");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNull() {
            addCriterion("user_authority is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNotNull() {
            addCriterion("user_authority is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityEqualTo(String value) {
            addCriterion("user_authority =", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotEqualTo(String value) {
            addCriterion("user_authority <>", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThan(String value) {
            addCriterion("user_authority >", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("user_authority >=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThan(String value) {
            addCriterion("user_authority <", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThanOrEqualTo(String value) {
            addCriterion("user_authority <=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLike(String value) {
            addCriterion("user_authority like", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotLike(String value) {
            addCriterion("user_authority not like", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIn(List<String> values) {
            addCriterion("user_authority in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotIn(List<String> values) {
            addCriterion("user_authority not in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityBetween(String value1, String value2) {
            addCriterion("user_authority between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotBetween(String value1, String value2) {
            addCriterion("user_authority not between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIsNull() {
            addCriterion("user_lastLogin is null");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIsNotNull() {
            addCriterion("user_lastLogin is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastloginEqualTo(String value) {
            addCriterion("user_lastLogin =", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotEqualTo(String value) {
            addCriterion("user_lastLogin <>", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginGreaterThan(String value) {
            addCriterion("user_lastLogin >", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginGreaterThanOrEqualTo(String value) {
            addCriterion("user_lastLogin >=", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginLessThan(String value) {
            addCriterion("user_lastLogin <", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginLessThanOrEqualTo(String value) {
            addCriterion("user_lastLogin <=", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginLike(String value) {
            addCriterion("user_lastLogin like", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotLike(String value) {
            addCriterion("user_lastLogin not like", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIn(List<String> values) {
            addCriterion("user_lastLogin in", values, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotIn(List<String> values) {
            addCriterion("user_lastLogin not in", values, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginBetween(String value1, String value2) {
            addCriterion("user_lastLogin between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotBetween(String value1, String value2) {
            addCriterion("user_lastLogin not between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("user_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("user_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(String value) {
            addCriterion("user_remark =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(String value) {
            addCriterion("user_remark <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(String value) {
            addCriterion("user_remark >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("user_remark >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(String value) {
            addCriterion("user_remark <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(String value) {
            addCriterion("user_remark <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLike(String value) {
            addCriterion("user_remark like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotLike(String value) {
            addCriterion("user_remark not like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<String> values) {
            addCriterion("user_remark in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<String> values) {
            addCriterion("user_remark not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(String value1, String value2) {
            addCriterion("user_remark between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(String value1, String value2) {
            addCriterion("user_remark not between", value1, value2, "userRemark");
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