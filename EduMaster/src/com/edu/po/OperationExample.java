package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class OperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationExample() {
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

        public Criteria andIfopcourseIsNull() {
            addCriterion("ifOpCourse is null");
            return (Criteria) this;
        }

        public Criteria andIfopcourseIsNotNull() {
            addCriterion("ifOpCourse is not null");
            return (Criteria) this;
        }

        public Criteria andIfopcourseEqualTo(String value) {
            addCriterion("ifOpCourse =", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseNotEqualTo(String value) {
            addCriterion("ifOpCourse <>", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseGreaterThan(String value) {
            addCriterion("ifOpCourse >", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseGreaterThanOrEqualTo(String value) {
            addCriterion("ifOpCourse >=", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseLessThan(String value) {
            addCriterion("ifOpCourse <", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseLessThanOrEqualTo(String value) {
            addCriterion("ifOpCourse <=", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseLike(String value) {
            addCriterion("ifOpCourse like", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseNotLike(String value) {
            addCriterion("ifOpCourse not like", value, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseIn(List<String> values) {
            addCriterion("ifOpCourse in", values, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseNotIn(List<String> values) {
            addCriterion("ifOpCourse not in", values, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseBetween(String value1, String value2) {
            addCriterion("ifOpCourse between", value1, value2, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopcourseNotBetween(String value1, String value2) {
            addCriterion("ifOpCourse not between", value1, value2, "ifopcourse");
            return (Criteria) this;
        }

        public Criteria andIfopgradeIsNull() {
            addCriterion("ifOpGrade is null");
            return (Criteria) this;
        }

        public Criteria andIfopgradeIsNotNull() {
            addCriterion("ifOpGrade is not null");
            return (Criteria) this;
        }

        public Criteria andIfopgradeEqualTo(String value) {
            addCriterion("ifOpGrade =", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeNotEqualTo(String value) {
            addCriterion("ifOpGrade <>", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeGreaterThan(String value) {
            addCriterion("ifOpGrade >", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeGreaterThanOrEqualTo(String value) {
            addCriterion("ifOpGrade >=", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeLessThan(String value) {
            addCriterion("ifOpGrade <", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeLessThanOrEqualTo(String value) {
            addCriterion("ifOpGrade <=", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeLike(String value) {
            addCriterion("ifOpGrade like", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeNotLike(String value) {
            addCriterion("ifOpGrade not like", value, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeIn(List<String> values) {
            addCriterion("ifOpGrade in", values, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeNotIn(List<String> values) {
            addCriterion("ifOpGrade not in", values, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeBetween(String value1, String value2) {
            addCriterion("ifOpGrade between", value1, value2, "ifopgrade");
            return (Criteria) this;
        }

        public Criteria andIfopgradeNotBetween(String value1, String value2) {
            addCriterion("ifOpGrade not between", value1, value2, "ifopgrade");
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