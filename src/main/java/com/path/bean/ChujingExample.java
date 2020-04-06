package com.path.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChujingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChujingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andChujIdIsNull() {
            addCriterion("chuj_id is null");
            return (Criteria) this;
        }

        public Criteria andChujIdIsNotNull() {
            addCriterion("chuj_id is not null");
            return (Criteria) this;
        }

        public Criteria andChujIdEqualTo(Integer value) {
            addCriterion("chuj_id =", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdNotEqualTo(Integer value) {
            addCriterion("chuj_id <>", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdGreaterThan(Integer value) {
            addCriterion("chuj_id >", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chuj_id >=", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdLessThan(Integer value) {
            addCriterion("chuj_id <", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdLessThanOrEqualTo(Integer value) {
            addCriterion("chuj_id <=", value, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdIn(List<Integer> values) {
            addCriterion("chuj_id in", values, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdNotIn(List<Integer> values) {
            addCriterion("chuj_id not in", values, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdBetween(Integer value1, Integer value2) {
            addCriterion("chuj_id between", value1, value2, "chujId");
            return (Criteria) this;
        }

        public Criteria andChujIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chuj_id not between", value1, value2, "chujId");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andChujPathIsNull() {
            addCriterion("chuj_path is null");
            return (Criteria) this;
        }

        public Criteria andChujPathIsNotNull() {
            addCriterion("chuj_path is not null");
            return (Criteria) this;
        }

        public Criteria andChujPathEqualTo(String value) {
            addCriterion("chuj_path =", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathNotEqualTo(String value) {
            addCriterion("chuj_path <>", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathGreaterThan(String value) {
            addCriterion("chuj_path >", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathGreaterThanOrEqualTo(String value) {
            addCriterion("chuj_path >=", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathLessThan(String value) {
            addCriterion("chuj_path <", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathLessThanOrEqualTo(String value) {
            addCriterion("chuj_path <=", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathLike(String value) {
            addCriterion("chuj_path like", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathNotLike(String value) {
            addCriterion("chuj_path not like", value, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathIn(List<String> values) {
            addCriterion("chuj_path in", values, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathNotIn(List<String> values) {
            addCriterion("chuj_path not in", values, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathBetween(String value1, String value2) {
            addCriterion("chuj_path between", value1, value2, "chujPath");
            return (Criteria) this;
        }

        public Criteria andChujPathNotBetween(String value1, String value2) {
            addCriterion("chuj_path not between", value1, value2, "chujPath");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("outtime is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("outtime is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterionForJDBCDate("outtime =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("outtime <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("outtime >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outtime >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterionForJDBCDate("outtime <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("outtime <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterionForJDBCDate("outtime in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("outtime not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outtime between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("outtime not between", value1, value2, "outtime");
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