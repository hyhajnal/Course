package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("ssex is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("ssex is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("ssex =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("ssex <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("ssex >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("ssex >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("ssex <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("ssex <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("ssex like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("ssex not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("ssex in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("ssex not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("ssex between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("ssex not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSpsdIsNull() {
            addCriterion("spsd is null");
            return (Criteria) this;
        }

        public Criteria andSpsdIsNotNull() {
            addCriterion("spsd is not null");
            return (Criteria) this;
        }

        public Criteria andSpsdEqualTo(String value) {
            addCriterion("spsd =", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdNotEqualTo(String value) {
            addCriterion("spsd <>", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdGreaterThan(String value) {
            addCriterion("spsd >", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdGreaterThanOrEqualTo(String value) {
            addCriterion("spsd >=", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdLessThan(String value) {
            addCriterion("spsd <", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdLessThanOrEqualTo(String value) {
            addCriterion("spsd <=", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdLike(String value) {
            addCriterion("spsd like", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdNotLike(String value) {
            addCriterion("spsd not like", value, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdIn(List<String> values) {
            addCriterion("spsd in", values, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdNotIn(List<String> values) {
            addCriterion("spsd not in", values, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdBetween(String value1, String value2) {
            addCriterion("spsd between", value1, value2, "spsd");
            return (Criteria) this;
        }

        public Criteria andSpsdNotBetween(String value1, String value2) {
            addCriterion("spsd not between", value1, value2, "spsd");
            return (Criteria) this;
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

        public Criteria andSgradeIsNull() {
            addCriterion("sgrade is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("sgrade is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(Integer value) {
            addCriterion("sgrade =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(Integer value) {
            addCriterion("sgrade <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(Integer value) {
            addCriterion("sgrade >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgrade >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(Integer value) {
            addCriterion("sgrade <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(Integer value) {
            addCriterion("sgrade <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<Integer> values) {
            addCriterion("sgrade in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<Integer> values) {
            addCriterion("sgrade not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(Integer value1, Integer value2) {
            addCriterion("sgrade between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("sgrade not between", value1, value2, "sgrade");
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