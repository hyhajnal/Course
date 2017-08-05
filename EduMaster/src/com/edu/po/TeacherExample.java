package com.edu.po;

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

        public Criteria andTnoIsNull() {
            addCriterion("tno is null");
            return (Criteria) this;
        }

        public Criteria andTnoIsNotNull() {
            addCriterion("tno is not null");
            return (Criteria) this;
        }

        public Criteria andTnoEqualTo(String value) {
            addCriterion("tno =", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotEqualTo(String value) {
            addCriterion("tno <>", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThan(String value) {
            addCriterion("tno >", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoGreaterThanOrEqualTo(String value) {
            addCriterion("tno >=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThan(String value) {
            addCriterion("tno <", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLessThanOrEqualTo(String value) {
            addCriterion("tno <=", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoLike(String value) {
            addCriterion("tno like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotLike(String value) {
            addCriterion("tno not like", value, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoIn(List<String> values) {
            addCriterion("tno in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotIn(List<String> values) {
            addCriterion("tno not in", values, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoBetween(String value1, String value2) {
            addCriterion("tno between", value1, value2, "tno");
            return (Criteria) this;
        }

        public Criteria andTnoNotBetween(String value1, String value2) {
            addCriterion("tno not between", value1, value2, "tno");
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

        public Criteria andTpsdIsNull() {
            addCriterion("tpsd is null");
            return (Criteria) this;
        }

        public Criteria andTpsdIsNotNull() {
            addCriterion("tpsd is not null");
            return (Criteria) this;
        }

        public Criteria andTpsdEqualTo(String value) {
            addCriterion("tpsd =", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdNotEqualTo(String value) {
            addCriterion("tpsd <>", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdGreaterThan(String value) {
            addCriterion("tpsd >", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdGreaterThanOrEqualTo(String value) {
            addCriterion("tpsd >=", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdLessThan(String value) {
            addCriterion("tpsd <", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdLessThanOrEqualTo(String value) {
            addCriterion("tpsd <=", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdLike(String value) {
            addCriterion("tpsd like", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdNotLike(String value) {
            addCriterion("tpsd not like", value, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdIn(List<String> values) {
            addCriterion("tpsd in", values, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdNotIn(List<String> values) {
            addCriterion("tpsd not in", values, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdBetween(String value1, String value2) {
            addCriterion("tpsd between", value1, value2, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTpsdNotBetween(String value1, String value2) {
            addCriterion("tpsd not between", value1, value2, "tpsd");
            return (Criteria) this;
        }

        public Criteria andTimgIsNull() {
            addCriterion("timg is null");
            return (Criteria) this;
        }

        public Criteria andTimgIsNotNull() {
            addCriterion("timg is not null");
            return (Criteria) this;
        }

        public Criteria andTimgEqualTo(String value) {
            addCriterion("timg =", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotEqualTo(String value) {
            addCriterion("timg <>", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThan(String value) {
            addCriterion("timg >", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgGreaterThanOrEqualTo(String value) {
            addCriterion("timg >=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThan(String value) {
            addCriterion("timg <", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLessThanOrEqualTo(String value) {
            addCriterion("timg <=", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgLike(String value) {
            addCriterion("timg like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotLike(String value) {
            addCriterion("timg not like", value, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgIn(List<String> values) {
            addCriterion("timg in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotIn(List<String> values) {
            addCriterion("timg not in", values, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgBetween(String value1, String value2) {
            addCriterion("timg between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andTimgNotBetween(String value1, String value2) {
            addCriterion("timg not between", value1, value2, "timg");
            return (Criteria) this;
        }

        public Criteria andMajorinfoIsNull() {
            addCriterion("majorInfo is null");
            return (Criteria) this;
        }

        public Criteria andMajorinfoIsNotNull() {
            addCriterion("majorInfo is not null");
            return (Criteria) this;
        }

        public Criteria andMajorinfoEqualTo(String value) {
            addCriterion("majorInfo =", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoNotEqualTo(String value) {
            addCriterion("majorInfo <>", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoGreaterThan(String value) {
            addCriterion("majorInfo >", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoGreaterThanOrEqualTo(String value) {
            addCriterion("majorInfo >=", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoLessThan(String value) {
            addCriterion("majorInfo <", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoLessThanOrEqualTo(String value) {
            addCriterion("majorInfo <=", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoLike(String value) {
            addCriterion("majorInfo like", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoNotLike(String value) {
            addCriterion("majorInfo not like", value, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoIn(List<String> values) {
            addCriterion("majorInfo in", values, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoNotIn(List<String> values) {
            addCriterion("majorInfo not in", values, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoBetween(String value1, String value2) {
            addCriterion("majorInfo between", value1, value2, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andMajorinfoNotBetween(String value1, String value2) {
            addCriterion("majorInfo not between", value1, value2, "majorinfo");
            return (Criteria) this;
        }

        public Criteria andProIsNull() {
            addCriterion("pro is null");
            return (Criteria) this;
        }

        public Criteria andProIsNotNull() {
            addCriterion("pro is not null");
            return (Criteria) this;
        }

        public Criteria andProEqualTo(String value) {
            addCriterion("pro =", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotEqualTo(String value) {
            addCriterion("pro <>", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThan(String value) {
            addCriterion("pro >", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProGreaterThanOrEqualTo(String value) {
            addCriterion("pro >=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThan(String value) {
            addCriterion("pro <", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLessThanOrEqualTo(String value) {
            addCriterion("pro <=", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProLike(String value) {
            addCriterion("pro like", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotLike(String value) {
            addCriterion("pro not like", value, "pro");
            return (Criteria) this;
        }

        public Criteria andProIn(List<String> values) {
            addCriterion("pro in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotIn(List<String> values) {
            addCriterion("pro not in", values, "pro");
            return (Criteria) this;
        }

        public Criteria andProBetween(String value1, String value2) {
            addCriterion("pro between", value1, value2, "pro");
            return (Criteria) this;
        }

        public Criteria andProNotBetween(String value1, String value2) {
            addCriterion("pro not between", value1, value2, "pro");
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