package com.wf.springboot.domain;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(String value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(String value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(String value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(String value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(String value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(String value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLike(String value) {
            addCriterion("publish like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotLike(String value) {
            addCriterion("publish not like", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<String> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<String> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(String value1, String value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(String value1, String value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Integer value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Integer value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Integer value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Integer value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Integer value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Integer> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Integer> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Integer value1, Integer value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBookcaseidIsNull() {
            addCriterion("bookcaseid is null");
            return (Criteria) this;
        }

        public Criteria andBookcaseidIsNotNull() {
            addCriterion("bookcaseid is not null");
            return (Criteria) this;
        }

        public Criteria andBookcaseidEqualTo(Integer value) {
            addCriterion("bookcaseid =", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidNotEqualTo(Integer value) {
            addCriterion("bookcaseid <>", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidGreaterThan(Integer value) {
            addCriterion("bookcaseid >", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookcaseid >=", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidLessThan(Integer value) {
            addCriterion("bookcaseid <", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidLessThanOrEqualTo(Integer value) {
            addCriterion("bookcaseid <=", value, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidIn(List<Integer> values) {
            addCriterion("bookcaseid in", values, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidNotIn(List<Integer> values) {
            addCriterion("bookcaseid not in", values, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidBetween(Integer value1, Integer value2) {
            addCriterion("bookcaseid between", value1, value2, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andBookcaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookcaseid not between", value1, value2, "bookcaseid");
            return (Criteria) this;
        }

        public Criteria andAbledIsNull() {
            addCriterion("abled is null");
            return (Criteria) this;
        }

        public Criteria andAbledIsNotNull() {
            addCriterion("abled is not null");
            return (Criteria) this;
        }

        public Criteria andAbledEqualTo(Integer value) {
            addCriterion("abled =", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledNotEqualTo(Integer value) {
            addCriterion("abled <>", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledGreaterThan(Integer value) {
            addCriterion("abled >", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledGreaterThanOrEqualTo(Integer value) {
            addCriterion("abled >=", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledLessThan(Integer value) {
            addCriterion("abled <", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledLessThanOrEqualTo(Integer value) {
            addCriterion("abled <=", value, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledIn(List<Integer> values) {
            addCriterion("abled in", values, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledNotIn(List<Integer> values) {
            addCriterion("abled not in", values, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledBetween(Integer value1, Integer value2) {
            addCriterion("abled between", value1, value2, "abled");
            return (Criteria) this;
        }

        public Criteria andAbledNotBetween(Integer value1, Integer value2) {
            addCriterion("abled not between", value1, value2, "abled");
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