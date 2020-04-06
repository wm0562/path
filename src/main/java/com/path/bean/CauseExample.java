package com.path.bean;

import java.util.ArrayList;
import java.util.List;

import com.path.bean.DeartmentExample.Criteria;

public class CauseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CauseExample() {
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

        public Criteria andCauseIdIsNull() {
            addCriterion("cause_id is null");
            return (Criteria) this;
        }

        public Criteria andCauseIdIsNotNull() {
            addCriterion("cause_id is not null");
            return (Criteria) this;
        }

        public Criteria andCauseIdEqualTo(Integer value) {
            addCriterion("cause_id =", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotEqualTo(Integer value) {
            addCriterion("cause_id <>", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdGreaterThan(Integer value) {
            addCriterion("cause_id >", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cause_id >=", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdLessThan(Integer value) {
            addCriterion("cause_id <", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdLessThanOrEqualTo(Integer value) {
            addCriterion("cause_id <=", value, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdIn(List<Integer> values) {
            addCriterion("cause_id in", values, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotIn(List<Integer> values) {
            addCriterion("cause_id not in", values, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdBetween(Integer value1, Integer value2) {
            addCriterion("cause_id between", value1, value2, "causeId");
            return (Criteria) this;
        }

        public Criteria andCauseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cause_id not between", value1, value2, "causeId");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Integer value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Integer value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Integer value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Integer value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Integer value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Integer> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Integer> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Integer value1, Integer value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
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

        public Criteria andDepNameIsNull() {
            addCriterion("dep_name is null");
            return (Criteria) this;
        }

        public Criteria andDepNameIsNotNull() {
            addCriterion("dep_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepNameEqualTo(String value) {
            addCriterion("dep_name =", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotEqualTo(String value) {
            addCriterion("dep_name <>", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThan(String value) {
            addCriterion("dep_name >", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameGreaterThanOrEqualTo(String value) {
            addCriterion("dep_name >=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThan(String value) {
            addCriterion("dep_name <", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLessThanOrEqualTo(String value) {
            addCriterion("dep_name <=", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameLike(String value) {
            addCriterion("dep_name like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotLike(String value) {
            addCriterion("dep_name not like", value, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameIn(List<String> values) {
            addCriterion("dep_name in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotIn(List<String> values) {
            addCriterion("dep_name not in", values, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameBetween(String value1, String value2) {
            addCriterion("dep_name between", value1, value2, "depName");
            return (Criteria) this;
        }

        public Criteria andDepNameNotBetween(String value1, String value2) {
            addCriterion("dep_name not between", value1, value2, "depName");
            return (Criteria) this;
        }
        
        public Criteria andRjbrIsNull() {
            addCriterion("rjbr is null");
            return (Criteria) this;
        }

        public Criteria andRjbrIsNotNull() {
            addCriterion("rjbr is not null");
            return (Criteria) this;
        }

        public Criteria andRjbrEqualTo(String value) {
            addCriterion("rjbr =", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrNotEqualTo(String value) {
            addCriterion("rjbr <>", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrGreaterThan(String value) {
            addCriterion("rjbr >", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrGreaterThanOrEqualTo(String value) {
            addCriterion("rjbr >=", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrLessThan(String value) {
            addCriterion("rjbr <", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrLessThanOrEqualTo(String value) {
            addCriterion("rjbr <=", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrLike(String value) {
            addCriterion("rjbr like", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrNotLike(String value) {
            addCriterion("rjbr not like", value, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrIn(List<String> values) {
            addCriterion("rjbr in", values, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrNotIn(List<String> values) {
            addCriterion("rjbr not in", values, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrBetween(String value1, String value2) {
            addCriterion("rjbr between", value1, value2, "rjbr");
            return (Criteria) this;
        }

        public Criteria andRjbrNotBetween(String value1, String value2) {
            addCriterion("rjbr not between", value1, value2, "rjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrIsNull() {
            addCriterion("cjbr is null");
            return (Criteria) this;
        }

        public Criteria andCjbrIsNotNull() {
            addCriterion("cjbr is not null");
            return (Criteria) this;
        }

        public Criteria andCjbrEqualTo(String value) {
            addCriterion("cjbr =", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrNotEqualTo(String value) {
            addCriterion("cjbr <>", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrGreaterThan(String value) {
            addCriterion("cjbr >", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrGreaterThanOrEqualTo(String value) {
            addCriterion("cjbr >=", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrLessThan(String value) {
            addCriterion("cjbr <", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrLessThanOrEqualTo(String value) {
            addCriterion("cjbr <=", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrLike(String value) {
            addCriterion("cjbr like", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrNotLike(String value) {
            addCriterion("cjbr not like", value, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrIn(List<String> values) {
            addCriterion("cjbr in", values, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrNotIn(List<String> values) {
            addCriterion("cjbr not in", values, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrBetween(String value1, String value2) {
            addCriterion("cjbr between", value1, value2, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCjbrNotBetween(String value1, String value2) {
            addCriterion("cjbr not between", value1, value2, "cjbr");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
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