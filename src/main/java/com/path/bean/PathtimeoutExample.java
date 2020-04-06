package com.path.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.path.bean.PathExample.Criteria;

public class PathtimeoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathtimeoutExample() {
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

        public Criteria andTimeoutIdIsNull() {
            addCriterion("timeout_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdIsNotNull() {
            addCriterion("timeout_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdEqualTo(Integer value) {
            addCriterion("timeout_id =", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdNotEqualTo(Integer value) {
            addCriterion("timeout_id <>", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdGreaterThan(Integer value) {
            addCriterion("timeout_id >", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeout_id >=", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdLessThan(Integer value) {
            addCriterion("timeout_id <", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdLessThanOrEqualTo(Integer value) {
            addCriterion("timeout_id <=", value, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdIn(List<Integer> values) {
            addCriterion("timeout_id in", values, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdNotIn(List<Integer> values) {
            addCriterion("timeout_id not in", values, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdBetween(Integer value1, Integer value2) {
            addCriterion("timeout_id between", value1, value2, "timeoutId");
            return (Criteria) this;
        }

        public Criteria andTimeoutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timeout_id not between", value1, value2, "timeoutId");
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

        public Criteria andPathIdIsNull() {
            addCriterion("path_id is null");
            return (Criteria) this;
        }

        public Criteria andPathIdIsNotNull() {
            addCriterion("path_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathIdEqualTo(Integer value) {
            addCriterion("path_id =", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotEqualTo(Integer value) {
            addCriterion("path_id <>", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThan(Integer value) {
            addCriterion("path_id >", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("path_id >=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThan(Integer value) {
            addCriterion("path_id <", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdLessThanOrEqualTo(Integer value) {
            addCriterion("path_id <=", value, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdIn(List<Integer> values) {
            addCriterion("path_id in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotIn(List<Integer> values) {
            addCriterion("path_id not in", values, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdBetween(Integer value1, Integer value2) {
            addCriterion("path_id between", value1, value2, "pathId");
            return (Criteria) this;
        }

        public Criteria andPathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("path_id not between", value1, value2, "pathId");
            return (Criteria) this;
        }
        
        public Criteria andCsPathIsNull() {
            addCriterion("cs_path is null");
            return (Criteria) this;
        }

        public Criteria andCsPathIsNotNull() {
            addCriterion("cs_path is not null");
            return (Criteria) this;
        }

        public Criteria andCsPathEqualTo(String value) {
            addCriterion("cs_path =", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathNotEqualTo(String value) {
            addCriterion("cs_path <>", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathGreaterThan(String value) {
            addCriterion("cs_path >", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathGreaterThanOrEqualTo(String value) {
            addCriterion("cs_path >=", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathLessThan(String value) {
            addCriterion("cs_path <", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathLessThanOrEqualTo(String value) {
            addCriterion("cs_path <=", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathLike(String value) {
            addCriterion("cs_path like", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathNotLike(String value) {
            addCriterion("cs_path not like", value, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathIn(List<String> values) {
            addCriterion("cs_path in", values, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathNotIn(List<String> values) {
            addCriterion("cs_path not in", values, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathBetween(String value1, String value2) {
            addCriterion("cs_path between", value1, value2, "csPath");
            return (Criteria) this;
        }

        public Criteria andCsPathNotBetween(String value1, String value2) {
            addCriterion("cs_path not between", value1, value2, "csPath");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNull() {
            addCriterion("entrytime is null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIsNotNull() {
            addCriterion("entrytime is not null");
            return (Criteria) this;
        }

        public Criteria andEntrytimeEqualTo(Date value) {
            addCriterionForJDBCDate("entrytime =", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("entrytime <>", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("entrytime >", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entrytime >=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThan(Date value) {
            addCriterionForJDBCDate("entrytime <", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("entrytime <=", value, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeIn(List<Date> values) {
            addCriterionForJDBCDate("entrytime in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("entrytime not in", values, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entrytime between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andEntrytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("entrytime not between", value1, value2, "entrytime");
            return (Criteria) this;
        }

        public Criteria andTDaysIsNull() {
            addCriterion("t_days is null");
            return (Criteria) this;
        }

        public Criteria andTDaysIsNotNull() {
            addCriterion("t_days is not null");
            return (Criteria) this;
        }

        public Criteria andTDaysEqualTo(String value) {
            addCriterion("t_days =", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysNotEqualTo(String value) {
            addCriterion("t_days <>", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysGreaterThan(String value) {
            addCriterion("t_days >", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysGreaterThanOrEqualTo(String value) {
            addCriterion("t_days >=", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysLessThan(String value) {
            addCriterion("t_days <", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysLessThanOrEqualTo(String value) {
            addCriterion("t_days <=", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysLike(String value) {
            addCriterion("t_days like", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysNotLike(String value) {
            addCriterion("t_days not like", value, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysIn(List<String> values) {
            addCriterion("t_days in", values, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysNotIn(List<String> values) {
            addCriterion("t_days not in", values, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysBetween(String value1, String value2) {
            addCriterion("t_days between", value1, value2, "tDays");
            return (Criteria) this;
        }

        public Criteria andTDaysNotBetween(String value1, String value2) {
            addCriterion("t_days not between", value1, value2, "tDays");
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