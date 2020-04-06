package com.path.bean;

import java.util.ArrayList;
import java.util.List;

import com.path.bean.DepartfeeExample.Criteria;

public class HospfeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospfeeExample() {
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

        public Criteria andHosIdIsNull() {
            addCriterion("hos_id is null");
            return (Criteria) this;
        }

        public Criteria andHosIdIsNotNull() {
            addCriterion("hos_id is not null");
            return (Criteria) this;
        }

        public Criteria andHosIdEqualTo(Integer value) {
            addCriterion("hos_id =", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotEqualTo(Integer value) {
            addCriterion("hos_id <>", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThan(Integer value) {
            addCriterion("hos_id >", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_id >=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThan(Integer value) {
            addCriterion("hos_id <", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdLessThanOrEqualTo(Integer value) {
            addCriterion("hos_id <=", value, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdIn(List<Integer> values) {
            addCriterion("hos_id in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotIn(List<Integer> values) {
            addCriterion("hos_id not in", values, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdBetween(Integer value1, Integer value2) {
            addCriterion("hos_id between", value1, value2, "hosId");
            return (Criteria) this;
        }

        public Criteria andHosIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_id not between", value1, value2, "hosId");
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

        public Criteria andOpeCostIsNull() {
            addCriterion("ope_cost is null");
            return (Criteria) this;
        }

        public Criteria andOpeCostIsNotNull() {
            addCriterion("ope_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOpeCostEqualTo(String value) {
            addCriterion("ope_cost =", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostNotEqualTo(String value) {
            addCriterion("ope_cost <>", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostGreaterThan(String value) {
            addCriterion("ope_cost >", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostGreaterThanOrEqualTo(String value) {
            addCriterion("ope_cost >=", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostLessThan(String value) {
            addCriterion("ope_cost <", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostLessThanOrEqualTo(String value) {
            addCriterion("ope_cost <=", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostLike(String value) {
            addCriterion("ope_cost like", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostNotLike(String value) {
            addCriterion("ope_cost not like", value, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostIn(List<String> values) {
            addCriterion("ope_cost in", values, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostNotIn(List<String> values) {
            addCriterion("ope_cost not in", values, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostBetween(String value1, String value2) {
            addCriterion("ope_cost between", value1, value2, "opeCost");
            return (Criteria) this;
        }

        public Criteria andOpeCostNotBetween(String value1, String value2) {
            addCriterion("ope_cost not between", value1, value2, "opeCost");
            return (Criteria) this;
        }

        public Criteria andPostCostIsNull() {
            addCriterion("post_cost is null");
            return (Criteria) this;
        }

        public Criteria andPostCostIsNotNull() {
            addCriterion("post_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPostCostEqualTo(String value) {
            addCriterion("post_cost =", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostNotEqualTo(String value) {
            addCriterion("post_cost <>", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostGreaterThan(String value) {
            addCriterion("post_cost >", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostGreaterThanOrEqualTo(String value) {
            addCriterion("post_cost >=", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostLessThan(String value) {
            addCriterion("post_cost <", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostLessThanOrEqualTo(String value) {
            addCriterion("post_cost <=", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostLike(String value) {
            addCriterion("post_cost like", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostNotLike(String value) {
            addCriterion("post_cost not like", value, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostIn(List<String> values) {
            addCriterion("post_cost in", values, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostNotIn(List<String> values) {
            addCriterion("post_cost not in", values, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostBetween(String value1, String value2) {
            addCriterion("post_cost between", value1, value2, "postCost");
            return (Criteria) this;
        }

        public Criteria andPostCostNotBetween(String value1, String value2) {
            addCriterion("post_cost not between", value1, value2, "postCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostIsNull() {
            addCriterion("wait_cost is null");
            return (Criteria) this;
        }

        public Criteria andWaitCostIsNotNull() {
            addCriterion("wait_cost is not null");
            return (Criteria) this;
        }

        public Criteria andWaitCostEqualTo(String value) {
            addCriterion("wait_cost =", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostNotEqualTo(String value) {
            addCriterion("wait_cost <>", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostGreaterThan(String value) {
            addCriterion("wait_cost >", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostGreaterThanOrEqualTo(String value) {
            addCriterion("wait_cost >=", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostLessThan(String value) {
            addCriterion("wait_cost <", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostLessThanOrEqualTo(String value) {
            addCriterion("wait_cost <=", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostLike(String value) {
            addCriterion("wait_cost like", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostNotLike(String value) {
            addCriterion("wait_cost not like", value, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostIn(List<String> values) {
            addCriterion("wait_cost in", values, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostNotIn(List<String> values) {
            addCriterion("wait_cost not in", values, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostBetween(String value1, String value2) {
            addCriterion("wait_cost between", value1, value2, "waitCost");
            return (Criteria) this;
        }

        public Criteria andWaitCostNotBetween(String value1, String value2) {
            addCriterion("wait_cost not between", value1, value2, "waitCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostIsNull() {
            addCriterion("ave_med_cost is null");
            return (Criteria) this;
        }

        public Criteria andAveMedCostIsNotNull() {
            addCriterion("ave_med_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAveMedCostEqualTo(String value) {
            addCriterion("ave_med_cost =", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostNotEqualTo(String value) {
            addCriterion("ave_med_cost <>", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostGreaterThan(String value) {
            addCriterion("ave_med_cost >", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostGreaterThanOrEqualTo(String value) {
            addCriterion("ave_med_cost >=", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostLessThan(String value) {
            addCriterion("ave_med_cost <", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostLessThanOrEqualTo(String value) {
            addCriterion("ave_med_cost <=", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostLike(String value) {
            addCriterion("ave_med_cost like", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostNotLike(String value) {
            addCriterion("ave_med_cost not like", value, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostIn(List<String> values) {
            addCriterion("ave_med_cost in", values, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostNotIn(List<String> values) {
            addCriterion("ave_med_cost not in", values, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostBetween(String value1, String value2) {
            addCriterion("ave_med_cost between", value1, value2, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveMedCostNotBetween(String value1, String value2) {
            addCriterion("ave_med_cost not between", value1, value2, "aveMedCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostIsNull() {
            addCriterion("ave_drug_cost is null");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostIsNotNull() {
            addCriterion("ave_drug_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostEqualTo(String value) {
            addCriterion("ave_drug_cost =", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostNotEqualTo(String value) {
            addCriterion("ave_drug_cost <>", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostGreaterThan(String value) {
            addCriterion("ave_drug_cost >", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostGreaterThanOrEqualTo(String value) {
            addCriterion("ave_drug_cost >=", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostLessThan(String value) {
            addCriterion("ave_drug_cost <", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostLessThanOrEqualTo(String value) {
            addCriterion("ave_drug_cost <=", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostLike(String value) {
            addCriterion("ave_drug_cost like", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostNotLike(String value) {
            addCriterion("ave_drug_cost not like", value, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostIn(List<String> values) {
            addCriterion("ave_drug_cost in", values, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostNotIn(List<String> values) {
            addCriterion("ave_drug_cost not in", values, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostBetween(String value1, String value2) {
            addCriterion("ave_drug_cost between", value1, value2, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andAveDrugCostNotBetween(String value1, String value2) {
            addCriterion("ave_drug_cost not between", value1, value2, "aveDrugCost");
            return (Criteria) this;
        }

        public Criteria andExpReimIsNull() {
            addCriterion("exp_reim is null");
            return (Criteria) this;
        }

        public Criteria andExpReimIsNotNull() {
            addCriterion("exp_reim is not null");
            return (Criteria) this;
        }

        public Criteria andExpReimEqualTo(String value) {
            addCriterion("exp_reim =", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimNotEqualTo(String value) {
            addCriterion("exp_reim <>", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimGreaterThan(String value) {
            addCriterion("exp_reim >", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimGreaterThanOrEqualTo(String value) {
            addCriterion("exp_reim >=", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimLessThan(String value) {
            addCriterion("exp_reim <", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimLessThanOrEqualTo(String value) {
            addCriterion("exp_reim <=", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimLike(String value) {
            addCriterion("exp_reim like", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimNotLike(String value) {
            addCriterion("exp_reim not like", value, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimIn(List<String> values) {
            addCriterion("exp_reim in", values, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimNotIn(List<String> values) {
            addCriterion("exp_reim not in", values, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimBetween(String value1, String value2) {
            addCriterion("exp_reim between", value1, value2, "expReim");
            return (Criteria) this;
        }

        public Criteria andExpReimNotBetween(String value1, String value2) {
            addCriterion("exp_reim not between", value1, value2, "expReim");
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