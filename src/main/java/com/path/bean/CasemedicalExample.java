package com.path.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CasemedicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CasemedicalExample() {
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

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterionForJDBCDate("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterionForJDBCDate("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterionForJDBCDate("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryIsNull() {
            addCriterion("visit_history is null");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryIsNotNull() {
            addCriterion("visit_history is not null");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryEqualTo(String value) {
            addCriterion("visit_history =", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryNotEqualTo(String value) {
            addCriterion("visit_history <>", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryGreaterThan(String value) {
            addCriterion("visit_history >", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("visit_history >=", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryLessThan(String value) {
            addCriterion("visit_history <", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryLessThanOrEqualTo(String value) {
            addCriterion("visit_history <=", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryLike(String value) {
            addCriterion("visit_history like", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryNotLike(String value) {
            addCriterion("visit_history not like", value, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryIn(List<String> values) {
            addCriterion("visit_history in", values, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryNotIn(List<String> values) {
            addCriterion("visit_history not in", values, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryBetween(String value1, String value2) {
            addCriterion("visit_history between", value1, value2, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andVisitHistoryNotBetween(String value1, String value2) {
            addCriterion("visit_history not between", value1, value2, "visitHistory");
            return (Criteria) this;
        }

        public Criteria andTreatResultIsNull() {
            addCriterion("treat_result is null");
            return (Criteria) this;
        }

        public Criteria andTreatResultIsNotNull() {
            addCriterion("treat_result is not null");
            return (Criteria) this;
        }

        public Criteria andTreatResultEqualTo(String value) {
            addCriterion("treat_result =", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultNotEqualTo(String value) {
            addCriterion("treat_result <>", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultGreaterThan(String value) {
            addCriterion("treat_result >", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultGreaterThanOrEqualTo(String value) {
            addCriterion("treat_result >=", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultLessThan(String value) {
            addCriterion("treat_result <", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultLessThanOrEqualTo(String value) {
            addCriterion("treat_result <=", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultLike(String value) {
            addCriterion("treat_result like", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultNotLike(String value) {
            addCriterion("treat_result not like", value, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultIn(List<String> values) {
            addCriterion("treat_result in", values, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultNotIn(List<String> values) {
            addCriterion("treat_result not in", values, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultBetween(String value1, String value2) {
            addCriterion("treat_result between", value1, value2, "treatResult");
            return (Criteria) this;
        }

        public Criteria andTreatResultNotBetween(String value1, String value2) {
            addCriterion("treat_result not between", value1, value2, "treatResult");
            return (Criteria) this;
        }

        public Criteria andRecomPathidIsNull() {
            addCriterion("recom_pathid is null");
            return (Criteria) this;
        }

        public Criteria andRecomPathidIsNotNull() {
            addCriterion("recom_pathid is not null");
            return (Criteria) this;
        }

        public Criteria andRecomPathidEqualTo(String value) {
            addCriterion("recom_pathid =", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidNotEqualTo(String value) {
            addCriterion("recom_pathid <>", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidGreaterThan(String value) {
            addCriterion("recom_pathid >", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidGreaterThanOrEqualTo(String value) {
            addCriterion("recom_pathid >=", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidLessThan(String value) {
            addCriterion("recom_pathid <", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidLessThanOrEqualTo(String value) {
            addCriterion("recom_pathid <=", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidLike(String value) {
            addCriterion("recom_pathid like", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidNotLike(String value) {
            addCriterion("recom_pathid not like", value, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidIn(List<String> values) {
            addCriterion("recom_pathid in", values, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidNotIn(List<String> values) {
            addCriterion("recom_pathid not in", values, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidBetween(String value1, String value2) {
            addCriterion("recom_pathid between", value1, value2, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andRecomPathidNotBetween(String value1, String value2) {
            addCriterion("recom_pathid not between", value1, value2, "recomPathid");
            return (Criteria) this;
        }

        public Criteria andZresultIsNull() {
            addCriterion("zresult is null");
            return (Criteria) this;
        }

        public Criteria andZresultIsNotNull() {
            addCriterion("zresult is not null");
            return (Criteria) this;
        }

        public Criteria andZresultEqualTo(String value) {
            addCriterion("zresult =", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultNotEqualTo(String value) {
            addCriterion("zresult <>", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultGreaterThan(String value) {
            addCriterion("zresult >", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultGreaterThanOrEqualTo(String value) {
            addCriterion("zresult >=", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultLessThan(String value) {
            addCriterion("zresult <", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultLessThanOrEqualTo(String value) {
            addCriterion("zresult <=", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultLike(String value) {
            addCriterion("zresult like", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultNotLike(String value) {
            addCriterion("zresult not like", value, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultIn(List<String> values) {
            addCriterion("zresult in", values, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultNotIn(List<String> values) {
            addCriterion("zresult not in", values, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultBetween(String value1, String value2) {
            addCriterion("zresult between", value1, value2, "zresult");
            return (Criteria) this;
        }

        public Criteria andZresultNotBetween(String value1, String value2) {
            addCriterion("zresult not between", value1, value2, "zresult");
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