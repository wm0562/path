package com.path.bean;

import java.util.ArrayList;
import java.util.List;

import com.path.bean.PathExample.Criteria;

public class PathcountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathcountExample() {
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
        
        public Criteria andCountIdIsNull() {
            addCriterion("count_id is null");
            return (Criteria) this;
        }

        public Criteria andCountIdIsNotNull() {
            addCriterion("count_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountIdEqualTo(Integer value) {
            addCriterion("count_id =", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotEqualTo(Integer value) {
            addCriterion("count_id <>", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThan(Integer value) {
            addCriterion("count_id >", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_id >=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThan(Integer value) {
            addCriterion("count_id <", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdLessThanOrEqualTo(Integer value) {
            addCriterion("count_id <=", value, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdIn(List<Integer> values) {
            addCriterion("count_id in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotIn(List<Integer> values) {
            addCriterion("count_id not in", values, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdBetween(Integer value1, Integer value2) {
            addCriterion("count_id between", value1, value2, "countId");
            return (Criteria) this;
        }

        public Criteria andCountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("count_id not between", value1, value2, "countId");
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

        public Criteria andPathIdcountIdanOrEqualTo(Integer value) {
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

        public Criteria andHospFeeIsNull() {
            addCriterion("hosp_fee is null");
            return (Criteria) this;
        }

        public Criteria andHospFeeIsNotNull() {
            addCriterion("hosp_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHospFeeEqualTo(String value) {
            addCriterion("hosp_fee =", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeNotEqualTo(String value) {
            addCriterion("hosp_fee <>", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeGreaterThan(String value) {
            addCriterion("hosp_fee >", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_fee >=", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeLessThan(String value) {
            addCriterion("hosp_fee <", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeLessThanOrEqualTo(String value) {
            addCriterion("hosp_fee <=", value, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeIn(List<String> values) {
            addCriterion("hosp_fee in", values, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeNotIn(List<String> values) {
            addCriterion("hosp_fee not in", values, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeBetween(String value1, String value2) {
            addCriterion("hosp_fee between", value1, value2, "hospFee");
            return (Criteria) this;
        }

        public Criteria andHospFeeNotBetween(String value1, String value2) {
            addCriterion("hosp_fee not between", value1, value2, "hospFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeIsNull() {
            addCriterion("path_fee is null");
            return (Criteria) this;
        }

        public Criteria andPathFeeIsNotNull() {
            addCriterion("path_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPathFeeEqualTo(String value) {
            addCriterion("path_fee =", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeNotEqualTo(String value) {
            addCriterion("path_fee <>", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeGreaterThan(String value) {
            addCriterion("path_fee >", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeGreaterThanOrEqualTo(String value) {
            addCriterion("path_fee >=", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeLessThan(String value) {
            addCriterion("path_fee <", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeLessThanOrEqualTo(String value) {
            addCriterion("path_fee <=", value, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeIn(List<String> values) {
            addCriterion("path_fee in", values, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeNotIn(List<String> values) {
            addCriterion("path_fee not in", values, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeBetween(String value1, String value2) {
            addCriterion("path_fee between", value1, value2, "pathFee");
            return (Criteria) this;
        }

        public Criteria andPathFeeNotBetween(String value1, String value2) {
            addCriterion("path_fee not between", value1, value2, "pathFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeIsNull() {
            addCriterion("depart_fee is null");
            return (Criteria) this;
        }

        public Criteria andDepartFeeIsNotNull() {
            addCriterion("depart_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDepartFeeEqualTo(String value) {
            addCriterion("depart_fee =", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeNotEqualTo(String value) {
            addCriterion("depart_fee <>", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeGreaterThan(String value) {
            addCriterion("depart_fee >", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeGreaterThanOrEqualTo(String value) {
            addCriterion("depart_fee >=", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeLessThan(String value) {
            addCriterion("depart_fee <", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeLessThanOrEqualTo(String value) {
            addCriterion("depart_fee <=", value, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeIn(List<String> values) {
            addCriterion("depart_fee in", values, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeNotIn(List<String> values) {
            addCriterion("depart_fee not in", values, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeBetween(String value1, String value2) {
            addCriterion("depart_fee between", value1, value2, "departFee");
            return (Criteria) this;
        }

        public Criteria andDepartFeeNotBetween(String value1, String value2) {
            addCriterion("depart_fee not between", value1, value2, "departFee");
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