package com.path.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PathvariationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PathvariationExample() {
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

        public Criteria andVariationIdIsNull() {
            addCriterion("variation_id is null");
            return (Criteria) this;
        }

        public Criteria andVariationIdIsNotNull() {
            addCriterion("variation_id is not null");
            return (Criteria) this;
        }

        public Criteria andVariationIdEqualTo(Integer value) {
            addCriterion("variation_id =", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdNotEqualTo(Integer value) {
            addCriterion("variation_id <>", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdGreaterThan(Integer value) {
            addCriterion("variation_id >", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("variation_id >=", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdLessThan(Integer value) {
            addCriterion("variation_id <", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdLessThanOrEqualTo(Integer value) {
            addCriterion("variation_id <=", value, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdIn(List<Integer> values) {
            addCriterion("variation_id in", values, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdNotIn(List<Integer> values) {
            addCriterion("variation_id not in", values, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdBetween(Integer value1, Integer value2) {
            addCriterion("variation_id between", value1, value2, "variationId");
            return (Criteria) this;
        }

        public Criteria andVariationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("variation_id not between", value1, value2, "variationId");
            return (Criteria) this;
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
            addCriterion("chuj_id =", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdNotEqualTo(Integer value) {
            addCriterion("chuj_id <>", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdGreaterThan(Integer value) {
            addCriterion("chuj_id >", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chuj_id >=", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdLessThan(Integer value) {
            addCriterion("chuj_id <", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdLessThanOrEqualTo(Integer value) {
            addCriterion("chuj_id <=", value, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdIn(List<Integer> values) {
            addCriterion("chuj_id in", values, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdNotIn(List<Integer> values) {
            addCriterion("chuj_id not in", values, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdBetween(Integer value1, Integer value2) {
            addCriterion("chuj_id between", value1, value2, "chuj_id");
            return (Criteria) this;
        }

        public Criteria andChujIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chuj_id not between", value1, value2, "chuj_id");
            return (Criteria) this;
        }
        
        public Criteria andVPathIsNull() {
            addCriterion("v_path is null");
            return (Criteria) this;
        }

        public Criteria andVPathIsNotNull() {
            addCriterion("v_path is not null");
            return (Criteria) this;
        }

        public Criteria andVPathEqualTo(String value) {
            addCriterion("v_path =", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotEqualTo(String value) {
            addCriterion("v_path <>", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathGreaterThan(String value) {
            addCriterion("v_path >", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathGreaterThanOrEqualTo(String value) {
            addCriterion("v_path >=", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLessThan(String value) {
            addCriterion("v_path <", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLessThanOrEqualTo(String value) {
            addCriterion("v_path <=", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathLike(String value) {
            addCriterion("v_path like", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotLike(String value) {
            addCriterion("v_path not like", value, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathIn(List<String> values) {
            addCriterion("v_path in", values, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotIn(List<String> values) {
            addCriterion("v_path not in", values, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathBetween(String value1, String value2) {
            addCriterion("v_path between", value1, value2, "vPath");
            return (Criteria) this;
        }

        public Criteria andVPathNotBetween(String value1, String value2) {
            addCriterion("v_path not between", value1, value2, "vPath");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
        
        public Criteria andVariationRecordeIsNull() {
            addCriterion("variation_recorde is null");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeIsNotNull() {
            addCriterion("variation_recorde is not null");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeEqualTo(String value) {
            addCriterion("variation_recorde =", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeNotEqualTo(String value) {
            addCriterion("variation_recorde <>", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeGreaterThan(String value) {
            addCriterion("variation_recorde >", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeGreaterThanOrEqualTo(String value) {
            addCriterion("variation_recorde >=", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeLessThan(String value) {
            addCriterion("variation_recorde <", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeLessThanOrEqualTo(String value) {
            addCriterion("variation_recorde <=", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeLike(String value) {
            addCriterion("variation_recorde like", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeNotLike(String value) {
            addCriterion("variation_recorde not like", value, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeIn(List<String> values) {
            addCriterion("variation_recorde in", values, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeNotIn(List<String> values) {
            addCriterion("variation_recorde not in", values, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeBetween(String value1, String value2) {
            addCriterion("variation_recorde between", value1, value2, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andVariationRecordeNotBetween(String value1, String value2) {
            addCriterion("variation_recorde not between", value1, value2, "variationRecorde");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
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

        public Criteria andCtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterionForJDBCDate("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }
        
        public Criteria andManIsNull() {
            addCriterion("man is null");
            return (Criteria) this;
        }

        public Criteria andManIsNotNull() {
            addCriterion("man is not null");
            return (Criteria) this;
        }

        public Criteria andManEqualTo(String value) {
            addCriterion("man =", value, "man");
            return (Criteria) this;
        }

        public Criteria andManNotEqualTo(String value) {
            addCriterion("man <>", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThan(String value) {
            addCriterion("man >", value, "man");
            return (Criteria) this;
        }

        public Criteria andManGreaterThanOrEqualTo(String value) {
            addCriterion("man >=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThan(String value) {
            addCriterion("man <", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLessThanOrEqualTo(String value) {
            addCriterion("man <=", value, "man");
            return (Criteria) this;
        }

        public Criteria andManLike(String value) {
            addCriterion("man like", value, "man");
            return (Criteria) this;
        }

        public Criteria andManNotLike(String value) {
            addCriterion("man not like", value, "man");
            return (Criteria) this;
        }

        public Criteria andManIn(List<String> values) {
            addCriterion("man in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManNotIn(List<String> values) {
            addCriterion("man not in", values, "man");
            return (Criteria) this;
        }

        public Criteria andManBetween(String value1, String value2) {
            addCriterion("man between", value1, value2, "man");
            return (Criteria) this;
        }

        public Criteria andManNotBetween(String value1, String value2) {
            addCriterion("man not between", value1, value2, "man");
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