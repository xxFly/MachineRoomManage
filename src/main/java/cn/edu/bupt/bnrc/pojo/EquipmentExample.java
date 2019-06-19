package cn.edu.bupt.bnrc.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquipIdIsNull() {
            addCriterion("equip_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipIdIsNotNull() {
            addCriterion("equip_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipIdEqualTo(Integer value) {
            addCriterion("equip_id =", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotEqualTo(Integer value) {
            addCriterion("equip_id <>", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThan(Integer value) {
            addCriterion("equip_id >", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_id >=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThan(Integer value) {
            addCriterion("equip_id <", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdLessThanOrEqualTo(Integer value) {
            addCriterion("equip_id <=", value, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdIn(List<Integer> values) {
            addCriterion("equip_id in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotIn(List<Integer> values) {
            addCriterion("equip_id not in", values, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdBetween(Integer value1, Integer value2) {
            addCriterion("equip_id between", value1, value2, "equipId");
            return (Criteria) this;
        }

        public Criteria andEquipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_id not between", value1, value2, "equipId");
            return (Criteria) this;
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

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipLengthIsNull() {
            addCriterion("equip_length is null");
            return (Criteria) this;
        }

        public Criteria andEquipLengthIsNotNull() {
            addCriterion("equip_length is not null");
            return (Criteria) this;
        }

        public Criteria andEquipLengthEqualTo(String value) {
            addCriterion("equip_length =", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthNotEqualTo(String value) {
            addCriterion("equip_length <>", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthGreaterThan(String value) {
            addCriterion("equip_length >", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthGreaterThanOrEqualTo(String value) {
            addCriterion("equip_length >=", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthLessThan(String value) {
            addCriterion("equip_length <", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthLessThanOrEqualTo(String value) {
            addCriterion("equip_length <=", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthLike(String value) {
            addCriterion("equip_length like", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthNotLike(String value) {
            addCriterion("equip_length not like", value, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthIn(List<String> values) {
            addCriterion("equip_length in", values, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthNotIn(List<String> values) {
            addCriterion("equip_length not in", values, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthBetween(String value1, String value2) {
            addCriterion("equip_length between", value1, value2, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipLengthNotBetween(String value1, String value2) {
            addCriterion("equip_length not between", value1, value2, "equipLength");
            return (Criteria) this;
        }

        public Criteria andEquipWidthIsNull() {
            addCriterion("equip_width is null");
            return (Criteria) this;
        }

        public Criteria andEquipWidthIsNotNull() {
            addCriterion("equip_width is not null");
            return (Criteria) this;
        }

        public Criteria andEquipWidthEqualTo(String value) {
            addCriterion("equip_width =", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthNotEqualTo(String value) {
            addCriterion("equip_width <>", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthGreaterThan(String value) {
            addCriterion("equip_width >", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthGreaterThanOrEqualTo(String value) {
            addCriterion("equip_width >=", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthLessThan(String value) {
            addCriterion("equip_width <", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthLessThanOrEqualTo(String value) {
            addCriterion("equip_width <=", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthLike(String value) {
            addCriterion("equip_width like", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthNotLike(String value) {
            addCriterion("equip_width not like", value, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthIn(List<String> values) {
            addCriterion("equip_width in", values, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthNotIn(List<String> values) {
            addCriterion("equip_width not in", values, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthBetween(String value1, String value2) {
            addCriterion("equip_width between", value1, value2, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipWidthNotBetween(String value1, String value2) {
            addCriterion("equip_width not between", value1, value2, "equipWidth");
            return (Criteria) this;
        }

        public Criteria andEquipHeightIsNull() {
            addCriterion("equip_height is null");
            return (Criteria) this;
        }

        public Criteria andEquipHeightIsNotNull() {
            addCriterion("equip_height is not null");
            return (Criteria) this;
        }

        public Criteria andEquipHeightEqualTo(String value) {
            addCriterion("equip_height =", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightNotEqualTo(String value) {
            addCriterion("equip_height <>", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightGreaterThan(String value) {
            addCriterion("equip_height >", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightGreaterThanOrEqualTo(String value) {
            addCriterion("equip_height >=", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightLessThan(String value) {
            addCriterion("equip_height <", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightLessThanOrEqualTo(String value) {
            addCriterion("equip_height <=", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightLike(String value) {
            addCriterion("equip_height like", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightNotLike(String value) {
            addCriterion("equip_height not like", value, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightIn(List<String> values) {
            addCriterion("equip_height in", values, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightNotIn(List<String> values) {
            addCriterion("equip_height not in", values, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightBetween(String value1, String value2) {
            addCriterion("equip_height between", value1, value2, "equipHeight");
            return (Criteria) this;
        }

        public Criteria andEquipHeightNotBetween(String value1, String value2) {
            addCriterion("equip_height not between", value1, value2, "equipHeight");
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

        public Criteria andEquipPictureIsNull() {
            addCriterion("equip_picture is null");
            return (Criteria) this;
        }

        public Criteria andEquipPictureIsNotNull() {
            addCriterion("equip_picture is not null");
            return (Criteria) this;
        }

        public Criteria andEquipPictureEqualTo(String value) {
            addCriterion("equip_picture =", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureNotEqualTo(String value) {
            addCriterion("equip_picture <>", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureGreaterThan(String value) {
            addCriterion("equip_picture >", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureGreaterThanOrEqualTo(String value) {
            addCriterion("equip_picture >=", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureLessThan(String value) {
            addCriterion("equip_picture <", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureLessThanOrEqualTo(String value) {
            addCriterion("equip_picture <=", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureLike(String value) {
            addCriterion("equip_picture like", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureNotLike(String value) {
            addCriterion("equip_picture not like", value, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureIn(List<String> values) {
            addCriterion("equip_picture in", values, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureNotIn(List<String> values) {
            addCriterion("equip_picture not in", values, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureBetween(String value1, String value2) {
            addCriterion("equip_picture between", value1, value2, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipPictureNotBetween(String value1, String value2) {
            addCriterion("equip_picture not between", value1, value2, "equipPicture");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNull() {
            addCriterion("equip_type is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIsNotNull() {
            addCriterion("equip_type is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeEqualTo(String value) {
            addCriterion("equip_type =", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotEqualTo(String value) {
            addCriterion("equip_type <>", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThan(String value) {
            addCriterion("equip_type >", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("equip_type >=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThan(String value) {
            addCriterion("equip_type <", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLessThanOrEqualTo(String value) {
            addCriterion("equip_type <=", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeLike(String value) {
            addCriterion("equip_type like", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotLike(String value) {
            addCriterion("equip_type not like", value, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIn(List<String> values) {
            addCriterion("equip_type in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotIn(List<String> values) {
            addCriterion("equip_type not in", values, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeBetween(String value1, String value2) {
            addCriterion("equip_type between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNotBetween(String value1, String value2) {
            addCriterion("equip_type not between", value1, value2, "equipType");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkIsNull() {
            addCriterion("equip_remark is null");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkIsNotNull() {
            addCriterion("equip_remark is not null");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkEqualTo(String value) {
            addCriterion("equip_remark =", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkNotEqualTo(String value) {
            addCriterion("equip_remark <>", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkGreaterThan(String value) {
            addCriterion("equip_remark >", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("equip_remark >=", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkLessThan(String value) {
            addCriterion("equip_remark <", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkLessThanOrEqualTo(String value) {
            addCriterion("equip_remark <=", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkLike(String value) {
            addCriterion("equip_remark like", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkNotLike(String value) {
            addCriterion("equip_remark not like", value, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkIn(List<String> values) {
            addCriterion("equip_remark in", values, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkNotIn(List<String> values) {
            addCriterion("equip_remark not in", values, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkBetween(String value1, String value2) {
            addCriterion("equip_remark between", value1, value2, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipRemarkNotBetween(String value1, String value2) {
            addCriterion("equip_remark not between", value1, value2, "equipRemark");
            return (Criteria) this;
        }

        public Criteria andEquipExtraIsNull() {
            addCriterion("equip_extra is null");
            return (Criteria) this;
        }

        public Criteria andEquipExtraIsNotNull() {
            addCriterion("equip_extra is not null");
            return (Criteria) this;
        }

        public Criteria andEquipExtraEqualTo(String value) {
            addCriterion("equip_extra =", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraNotEqualTo(String value) {
            addCriterion("equip_extra <>", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraGreaterThan(String value) {
            addCriterion("equip_extra >", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraGreaterThanOrEqualTo(String value) {
            addCriterion("equip_extra >=", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraLessThan(String value) {
            addCriterion("equip_extra <", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraLessThanOrEqualTo(String value) {
            addCriterion("equip_extra <=", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraLike(String value) {
            addCriterion("equip_extra like", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraNotLike(String value) {
            addCriterion("equip_extra not like", value, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraIn(List<String> values) {
            addCriterion("equip_extra in", values, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraNotIn(List<String> values) {
            addCriterion("equip_extra not in", values, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraBetween(String value1, String value2) {
            addCriterion("equip_extra between", value1, value2, "equipExtra");
            return (Criteria) this;
        }

        public Criteria andEquipExtraNotBetween(String value1, String value2) {
            addCriterion("equip_extra not between", value1, value2, "equipExtra");
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