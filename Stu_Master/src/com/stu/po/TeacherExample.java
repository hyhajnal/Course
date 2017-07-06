package com.stu.po;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTsexIsNull() {
            addCriterion("tsex is null");
            return (Criteria) this;
        }

        public Criteria andTsexIsNotNull() {
            addCriterion("tsex is not null");
            return (Criteria) this;
        }

        public Criteria andTsexEqualTo(String value) {
            addCriterion("tsex =", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotEqualTo(String value) {
            addCriterion("tsex <>", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThan(String value) {
            addCriterion("tsex >", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexGreaterThanOrEqualTo(String value) {
            addCriterion("tsex >=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThan(String value) {
            addCriterion("tsex <", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLessThanOrEqualTo(String value) {
            addCriterion("tsex <=", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexLike(String value) {
            addCriterion("tsex like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotLike(String value) {
            addCriterion("tsex not like", value, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexIn(List<String> values) {
            addCriterion("tsex in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotIn(List<String> values) {
            addCriterion("tsex not in", values, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexBetween(String value1, String value2) {
            addCriterion("tsex between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTsexNotBetween(String value1, String value2) {
            addCriterion("tsex not between", value1, value2, "tsex");
            return (Criteria) this;
        }

        public Criteria andTageIsNull() {
            addCriterion("tage is null");
            return (Criteria) this;
        }

        public Criteria andTageIsNotNull() {
            addCriterion("tage is not null");
            return (Criteria) this;
        }

        public Criteria andTageEqualTo(Integer value) {
            addCriterion("tage =", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotEqualTo(Integer value) {
            addCriterion("tage <>", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageGreaterThan(Integer value) {
            addCriterion("tage >", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tage >=", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageLessThan(Integer value) {
            addCriterion("tage <", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageLessThanOrEqualTo(Integer value) {
            addCriterion("tage <=", value, "tage");
            return (Criteria) this;
        }

        public Criteria andTageIn(List<Integer> values) {
            addCriterion("tage in", values, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotIn(List<Integer> values) {
            addCriterion("tage not in", values, "tage");
            return (Criteria) this;
        }

        public Criteria andTageBetween(Integer value1, Integer value2) {
            addCriterion("tage between", value1, value2, "tage");
            return (Criteria) this;
        }

        public Criteria andTageNotBetween(Integer value1, Integer value2) {
            addCriterion("tage not between", value1, value2, "tage");
            return (Criteria) this;
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

        public Criteria andTpassIsNull() {
            addCriterion("tpass is null");
            return (Criteria) this;
        }

        public Criteria andTpassIsNotNull() {
            addCriterion("tpass is not null");
            return (Criteria) this;
        }

        public Criteria andTpassEqualTo(String value) {
            addCriterion("tpass =", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassNotEqualTo(String value) {
            addCriterion("tpass <>", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassGreaterThan(String value) {
            addCriterion("tpass >", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassGreaterThanOrEqualTo(String value) {
            addCriterion("tpass >=", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassLessThan(String value) {
            addCriterion("tpass <", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassLessThanOrEqualTo(String value) {
            addCriterion("tpass <=", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassLike(String value) {
            addCriterion("tpass like", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassNotLike(String value) {
            addCriterion("tpass not like", value, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassIn(List<String> values) {
            addCriterion("tpass in", values, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassNotIn(List<String> values) {
            addCriterion("tpass not in", values, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassBetween(String value1, String value2) {
            addCriterion("tpass between", value1, value2, "tpass");
            return (Criteria) this;
        }

        public Criteria andTpassNotBetween(String value1, String value2) {
            addCriterion("tpass not between", value1, value2, "tpass");
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