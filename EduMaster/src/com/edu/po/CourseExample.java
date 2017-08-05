package com.edu.po;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
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

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Float value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Float value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Float value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Float value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Float value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Float value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Float> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Float> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Float value1, Float value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Float value1, Float value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andClongIsNull() {
            addCriterion("clong is null");
            return (Criteria) this;
        }

        public Criteria andClongIsNotNull() {
            addCriterion("clong is not null");
            return (Criteria) this;
        }

        public Criteria andClongEqualTo(Integer value) {
            addCriterion("clong =", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongNotEqualTo(Integer value) {
            addCriterion("clong <>", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongGreaterThan(Integer value) {
            addCriterion("clong >", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongGreaterThanOrEqualTo(Integer value) {
            addCriterion("clong >=", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongLessThan(Integer value) {
            addCriterion("clong <", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongLessThanOrEqualTo(Integer value) {
            addCriterion("clong <=", value, "clong");
            return (Criteria) this;
        }

        public Criteria andClongIn(List<Integer> values) {
            addCriterion("clong in", values, "clong");
            return (Criteria) this;
        }

        public Criteria andClongNotIn(List<Integer> values) {
            addCriterion("clong not in", values, "clong");
            return (Criteria) this;
        }

        public Criteria andClongBetween(Integer value1, Integer value2) {
            addCriterion("clong between", value1, value2, "clong");
            return (Criteria) this;
        }

        public Criteria andClongNotBetween(Integer value1, Integer value2) {
            addCriterion("clong not between", value1, value2, "clong");
            return (Criteria) this;
        }

        public Criteria andCaddIsNull() {
            addCriterion("cadd is null");
            return (Criteria) this;
        }

        public Criteria andCaddIsNotNull() {
            addCriterion("cadd is not null");
            return (Criteria) this;
        }

        public Criteria andCaddEqualTo(String value) {
            addCriterion("cadd =", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddNotEqualTo(String value) {
            addCriterion("cadd <>", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddGreaterThan(String value) {
            addCriterion("cadd >", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddGreaterThanOrEqualTo(String value) {
            addCriterion("cadd >=", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddLessThan(String value) {
            addCriterion("cadd <", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddLessThanOrEqualTo(String value) {
            addCriterion("cadd <=", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddLike(String value) {
            addCriterion("cadd like", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddNotLike(String value) {
            addCriterion("cadd not like", value, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddIn(List<String> values) {
            addCriterion("cadd in", values, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddNotIn(List<String> values) {
            addCriterion("cadd not in", values, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddBetween(String value1, String value2) {
            addCriterion("cadd between", value1, value2, "cadd");
            return (Criteria) this;
        }

        public Criteria andCaddNotBetween(String value1, String value2) {
            addCriterion("cadd not between", value1, value2, "cadd");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNull() {
            addCriterion("weekday is null");
            return (Criteria) this;
        }

        public Criteria andWeekdayIsNotNull() {
            addCriterion("weekday is not null");
            return (Criteria) this;
        }

        public Criteria andWeekdayEqualTo(String value) {
            addCriterion("weekday =", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotEqualTo(String value) {
            addCriterion("weekday <>", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThan(String value) {
            addCriterion("weekday >", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayGreaterThanOrEqualTo(String value) {
            addCriterion("weekday >=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThan(String value) {
            addCriterion("weekday <", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLessThanOrEqualTo(String value) {
            addCriterion("weekday <=", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayLike(String value) {
            addCriterion("weekday like", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotLike(String value) {
            addCriterion("weekday not like", value, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayIn(List<String> values) {
            addCriterion("weekday in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotIn(List<String> values) {
            addCriterion("weekday not in", values, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayBetween(String value1, String value2) {
            addCriterion("weekday between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andWeekdayNotBetween(String value1, String value2) {
            addCriterion("weekday not between", value1, value2, "weekday");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(String value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(String value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(String value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(String value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(String value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLike(String value) {
            addCriterion("ctime like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotLike(String value) {
            addCriterion("ctime not like", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<String> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<String> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(String value1, String value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(String value1, String value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
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

        public Criteria andCimgIsNull() {
            addCriterion("cimg is null");
            return (Criteria) this;
        }

        public Criteria andCimgIsNotNull() {
            addCriterion("cimg is not null");
            return (Criteria) this;
        }

        public Criteria andCimgEqualTo(String value) {
            addCriterion("cimg =", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotEqualTo(String value) {
            addCriterion("cimg <>", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThan(String value) {
            addCriterion("cimg >", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgGreaterThanOrEqualTo(String value) {
            addCriterion("cimg >=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThan(String value) {
            addCriterion("cimg <", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLessThanOrEqualTo(String value) {
            addCriterion("cimg <=", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgLike(String value) {
            addCriterion("cimg like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotLike(String value) {
            addCriterion("cimg not like", value, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgIn(List<String> values) {
            addCriterion("cimg in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotIn(List<String> values) {
            addCriterion("cimg not in", values, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgBetween(String value1, String value2) {
            addCriterion("cimg between", value1, value2, "cimg");
            return (Criteria) this;
        }

        public Criteria andCimgNotBetween(String value1, String value2) {
            addCriterion("cimg not between", value1, value2, "cimg");
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