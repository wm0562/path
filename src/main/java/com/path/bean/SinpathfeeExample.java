package com.path.bean;

import java.util.ArrayList;
import java.util.List;

public class SinpathfeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SinpathfeeExample() {
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

        public Criteria andPathfeeIdIsNull() {
            addCriterion("pathfee_id is null");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdIsNotNull() {
            addCriterion("pathfee_id is not null");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdEqualTo(Integer value) {
            addCriterion("pathfee_id =", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdNotEqualTo(Integer value) {
            addCriterion("pathfee_id <>", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdGreaterThan(Integer value) {
            addCriterion("pathfee_id >", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pathfee_id >=", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdLessThan(Integer value) {
            addCriterion("pathfee_id <", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pathfee_id <=", value, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdIn(List<Integer> values) {
            addCriterion("pathfee_id in", values, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdNotIn(List<Integer> values) {
            addCriterion("pathfee_id not in", values, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdBetween(Integer value1, Integer value2) {
            addCriterion("pathfee_id between", value1, value2, "pathfeeId");
            return (Criteria) this;
        }

        public Criteria andPathfeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pathfee_id not between", value1, value2, "pathfeeId");
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
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

        public Criteria andHospExpIsNull() {
            addCriterion("hosp_exp is null");
            return (Criteria) this;
        }

        public Criteria andHospExpIsNotNull() {
            addCriterion("hosp_exp is not null");
            return (Criteria) this;
        }

        public Criteria andHospExpEqualTo(String value) {
            addCriterion("hosp_exp =", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpNotEqualTo(String value) {
            addCriterion("hosp_exp <>", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpGreaterThan(String value) {
            addCriterion("hosp_exp >", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_exp >=", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpLessThan(String value) {
            addCriterion("hosp_exp <", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpLessThanOrEqualTo(String value) {
            addCriterion("hosp_exp <=", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpLike(String value) {
            addCriterion("hosp_exp like", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpNotLike(String value) {
            addCriterion("hosp_exp not like", value, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpIn(List<String> values) {
            addCriterion("hosp_exp in", values, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpNotIn(List<String> values) {
            addCriterion("hosp_exp not in", values, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpBetween(String value1, String value2) {
            addCriterion("hosp_exp between", value1, value2, "hospExp");
            return (Criteria) this;
        }

        public Criteria andHospExpNotBetween(String value1, String value2) {
            addCriterion("hosp_exp not between", value1, value2, "hospExp");
            return (Criteria) this;
        }

        public Criteria andMedExpIsNull() {
            addCriterion("med_exp is null");
            return (Criteria) this;
        }

        public Criteria andMedExpIsNotNull() {
            addCriterion("med_exp is not null");
            return (Criteria) this;
        }

        public Criteria andMedExpEqualTo(String value) {
            addCriterion("med_exp =", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpNotEqualTo(String value) {
            addCriterion("med_exp <>", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpGreaterThan(String value) {
            addCriterion("med_exp >", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpGreaterThanOrEqualTo(String value) {
            addCriterion("med_exp >=", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpLessThan(String value) {
            addCriterion("med_exp <", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpLessThanOrEqualTo(String value) {
            addCriterion("med_exp <=", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpLike(String value) {
            addCriterion("med_exp like", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpNotLike(String value) {
            addCriterion("med_exp not like", value, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpIn(List<String> values) {
            addCriterion("med_exp in", values, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpNotIn(List<String> values) {
            addCriterion("med_exp not in", values, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpBetween(String value1, String value2) {
            addCriterion("med_exp between", value1, value2, "medExp");
            return (Criteria) this;
        }

        public Criteria andMedExpNotBetween(String value1, String value2) {
            addCriterion("med_exp not between", value1, value2, "medExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpIsNull() {
            addCriterion("drug_exp is null");
            return (Criteria) this;
        }

        public Criteria andDrugExpIsNotNull() {
            addCriterion("drug_exp is not null");
            return (Criteria) this;
        }

        public Criteria andDrugExpEqualTo(String value) {
            addCriterion("drug_exp =", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpNotEqualTo(String value) {
            addCriterion("drug_exp <>", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpGreaterThan(String value) {
            addCriterion("drug_exp >", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpGreaterThanOrEqualTo(String value) {
            addCriterion("drug_exp >=", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpLessThan(String value) {
            addCriterion("drug_exp <", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpLessThanOrEqualTo(String value) {
            addCriterion("drug_exp <=", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpLike(String value) {
            addCriterion("drug_exp like", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpNotLike(String value) {
            addCriterion("drug_exp not like", value, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpIn(List<String> values) {
            addCriterion("drug_exp in", values, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpNotIn(List<String> values) {
            addCriterion("drug_exp not in", values, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpBetween(String value1, String value2) {
            addCriterion("drug_exp between", value1, value2, "drugExp");
            return (Criteria) this;
        }

        public Criteria andDrugExpNotBetween(String value1, String value2) {
            addCriterion("drug_exp not between", value1, value2, "drugExp");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
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