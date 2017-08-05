package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andMajornumIsNull() {
            addCriterion("majorNum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("majorNum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(String value) {
            addCriterion("majorNum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(String value) {
            addCriterion("majorNum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(String value) {
            addCriterion("majorNum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(String value) {
            addCriterion("majorNum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(String value) {
            addCriterion("majorNum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(String value) {
            addCriterion("majorNum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLike(String value) {
            addCriterion("majorNum like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotLike(String value) {
            addCriterion("majorNum not like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<String> values) {
            addCriterion("majorNum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<String> values) {
            addCriterion("majorNum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(String value1, String value2) {
            addCriterion("majorNum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(String value1, String value2) {
            addCriterion("majorNum not between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNull() {
            addCriterion("majorName is null");
            return (Criteria) this;
        }

        public Criteria andMajornameIsNotNull() {
            addCriterion("majorName is not null");
            return (Criteria) this;
        }

        public Criteria andMajornameEqualTo(String value) {
            addCriterion("majorName =", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotEqualTo(String value) {
            addCriterion("majorName <>", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThan(String value) {
            addCriterion("majorName >", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameGreaterThanOrEqualTo(String value) {
            addCriterion("majorName >=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThan(String value) {
            addCriterion("majorName <", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLessThanOrEqualTo(String value) {
            addCriterion("majorName <=", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameLike(String value) {
            addCriterion("majorName like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotLike(String value) {
            addCriterion("majorName not like", value, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameIn(List<String> values) {
            addCriterion("majorName in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotIn(List<String> values) {
            addCriterion("majorName not in", values, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameBetween(String value1, String value2) {
            addCriterion("majorName between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajornameNotBetween(String value1, String value2) {
            addCriterion("majorName not between", value1, value2, "majorname");
            return (Criteria) this;
        }

        public Criteria andMajortehIsNull() {
            addCriterion("majorTeh is null");
            return (Criteria) this;
        }

        public Criteria andMajortehIsNotNull() {
            addCriterion("majorTeh is not null");
            return (Criteria) this;
        }

        public Criteria andMajortehEqualTo(String value) {
            addCriterion("majorTeh =", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehNotEqualTo(String value) {
            addCriterion("majorTeh <>", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehGreaterThan(String value) {
            addCriterion("majorTeh >", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehGreaterThanOrEqualTo(String value) {
            addCriterion("majorTeh >=", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehLessThan(String value) {
            addCriterion("majorTeh <", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehLessThanOrEqualTo(String value) {
            addCriterion("majorTeh <=", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehLike(String value) {
            addCriterion("majorTeh like", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehNotLike(String value) {
            addCriterion("majorTeh not like", value, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehIn(List<String> values) {
            addCriterion("majorTeh in", values, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehNotIn(List<String> values) {
            addCriterion("majorTeh not in", values, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehBetween(String value1, String value2) {
            addCriterion("majorTeh between", value1, value2, "majorteh");
            return (Criteria) this;
        }

        public Criteria andMajortehNotBetween(String value1, String value2) {
            addCriterion("majorTeh not between", value1, value2, "majorteh");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDepttehIsNull() {
            addCriterion("deptTeh is null");
            return (Criteria) this;
        }

        public Criteria andDepttehIsNotNull() {
            addCriterion("deptTeh is not null");
            return (Criteria) this;
        }

        public Criteria andDepttehEqualTo(String value) {
            addCriterion("deptTeh =", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehNotEqualTo(String value) {
            addCriterion("deptTeh <>", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehGreaterThan(String value) {
            addCriterion("deptTeh >", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehGreaterThanOrEqualTo(String value) {
            addCriterion("deptTeh >=", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehLessThan(String value) {
            addCriterion("deptTeh <", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehLessThanOrEqualTo(String value) {
            addCriterion("deptTeh <=", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehLike(String value) {
            addCriterion("deptTeh like", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehNotLike(String value) {
            addCriterion("deptTeh not like", value, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehIn(List<String> values) {
            addCriterion("deptTeh in", values, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehNotIn(List<String> values) {
            addCriterion("deptTeh not in", values, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehBetween(String value1, String value2) {
            addCriterion("deptTeh between", value1, value2, "deptteh");
            return (Criteria) this;
        }

        public Criteria andDepttehNotBetween(String value1, String value2) {
            addCriterion("deptTeh not between", value1, value2, "deptteh");
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