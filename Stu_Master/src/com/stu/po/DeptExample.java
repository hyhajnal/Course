package com.stu.po;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(String value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(String value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(String value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(String value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(String value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(String value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLike(String value) {
            addCriterion("did like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotLike(String value) {
            addCriterion("did not like", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<String> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<String> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(String value1, String value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(String value1, String value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNull() {
            addCriterion("academy is null");
            return (Criteria) this;
        }

        public Criteria andAcademyIsNotNull() {
            addCriterion("academy is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyEqualTo(String value) {
            addCriterion("academy =", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotEqualTo(String value) {
            addCriterion("academy <>", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThan(String value) {
            addCriterion("academy >", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("academy >=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThan(String value) {
            addCriterion("academy <", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLessThanOrEqualTo(String value) {
            addCriterion("academy <=", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyLike(String value) {
            addCriterion("academy like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotLike(String value) {
            addCriterion("academy not like", value, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyIn(List<String> values) {
            addCriterion("academy in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotIn(List<String> values) {
            addCriterion("academy not in", values, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyBetween(String value1, String value2) {
            addCriterion("academy between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andAcademyNotBetween(String value1, String value2) {
            addCriterion("academy not between", value1, value2, "academy");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dName is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dName is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dName =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dName <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dName >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dName >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dName <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dName <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dName like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dName not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dName in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dName not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dName between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dName not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDtelIsNull() {
            addCriterion("dTel is null");
            return (Criteria) this;
        }

        public Criteria andDtelIsNotNull() {
            addCriterion("dTel is not null");
            return (Criteria) this;
        }

        public Criteria andDtelEqualTo(Integer value) {
            addCriterion("dTel =", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotEqualTo(Integer value) {
            addCriterion("dTel <>", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelGreaterThan(Integer value) {
            addCriterion("dTel >", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dTel >=", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelLessThan(Integer value) {
            addCriterion("dTel <", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelLessThanOrEqualTo(Integer value) {
            addCriterion("dTel <=", value, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelIn(List<Integer> values) {
            addCriterion("dTel in", values, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotIn(List<Integer> values) {
            addCriterion("dTel not in", values, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelBetween(Integer value1, Integer value2) {
            addCriterion("dTel between", value1, value2, "dtel");
            return (Criteria) this;
        }

        public Criteria andDtelNotBetween(Integer value1, Integer value2) {
            addCriterion("dTel not between", value1, value2, "dtel");
            return (Criteria) this;
        }

        public Criteria andDteacherIsNull() {
            addCriterion("dTeacher is null");
            return (Criteria) this;
        }

        public Criteria andDteacherIsNotNull() {
            addCriterion("dTeacher is not null");
            return (Criteria) this;
        }

        public Criteria andDteacherEqualTo(String value) {
            addCriterion("dTeacher =", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherNotEqualTo(String value) {
            addCriterion("dTeacher <>", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherGreaterThan(String value) {
            addCriterion("dTeacher >", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherGreaterThanOrEqualTo(String value) {
            addCriterion("dTeacher >=", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherLessThan(String value) {
            addCriterion("dTeacher <", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherLessThanOrEqualTo(String value) {
            addCriterion("dTeacher <=", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherLike(String value) {
            addCriterion("dTeacher like", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherNotLike(String value) {
            addCriterion("dTeacher not like", value, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherIn(List<String> values) {
            addCriterion("dTeacher in", values, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherNotIn(List<String> values) {
            addCriterion("dTeacher not in", values, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherBetween(String value1, String value2) {
            addCriterion("dTeacher between", value1, value2, "dteacher");
            return (Criteria) this;
        }

        public Criteria andDteacherNotBetween(String value1, String value2) {
            addCriterion("dTeacher not between", value1, value2, "dteacher");
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