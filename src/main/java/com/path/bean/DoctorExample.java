package com.path.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDpwdIsNull() {
            addCriterion("dpwd is null");
            return (Criteria) this;
        }

        public Criteria andDpwdIsNotNull() {
            addCriterion("dpwd is not null");
            return (Criteria) this;
        }

        public Criteria andDpwdEqualTo(String value) {
            addCriterion("dpwd =", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdNotEqualTo(String value) {
            addCriterion("dpwd <>", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdGreaterThan(String value) {
            addCriterion("dpwd >", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdGreaterThanOrEqualTo(String value) {
            addCriterion("dpwd >=", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdLessThan(String value) {
            addCriterion("dpwd <", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdLessThanOrEqualTo(String value) {
            addCriterion("dpwd <=", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdLike(String value) {
            addCriterion("dpwd like", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdNotLike(String value) {
            addCriterion("dpwd not like", value, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdIn(List<String> values) {
            addCriterion("dpwd in", values, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdNotIn(List<String> values) {
            addCriterion("dpwd not in", values, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdBetween(String value1, String value2) {
            addCriterion("dpwd between", value1, value2, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDpwdNotBetween(String value1, String value2) {
            addCriterion("dpwd not between", value1, value2, "dpwd");
            return (Criteria) this;
        }

        public Criteria andDdepartmentIsNull() {
            addCriterion("ddepartment is null");
            return (Criteria) this;
        }

        public Criteria andDdepartmentIsNotNull() {
            addCriterion("ddepartment is not null");
            return (Criteria) this;
        }

        public Criteria andDdepartmentEqualTo(String value) {
            addCriterion("ddepartment =", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentNotEqualTo(String value) {
            addCriterion("ddepartment <>", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentGreaterThan(String value) {
            addCriterion("ddepartment >", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("ddepartment >=", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentLessThan(String value) {
            addCriterion("ddepartment <", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentLessThanOrEqualTo(String value) {
            addCriterion("ddepartment <=", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentLike(String value) {
            addCriterion("ddepartment like", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentNotLike(String value) {
            addCriterion("ddepartment not like", value, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentIn(List<String> values) {
            addCriterion("ddepartment in", values, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentNotIn(List<String> values) {
            addCriterion("ddepartment not in", values, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentBetween(String value1, String value2) {
            addCriterion("ddepartment between", value1, value2, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDdepartmentNotBetween(String value1, String value2) {
            addCriterion("ddepartment not between", value1, value2, "ddepartment");
            return (Criteria) this;
        }

        public Criteria andDjobIsNull() {
            addCriterion("djob is null");
            return (Criteria) this;
        }

        public Criteria andDjobIsNotNull() {
            addCriterion("djob is not null");
            return (Criteria) this;
        }

        public Criteria andDjobEqualTo(String value) {
            addCriterion("djob =", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobNotEqualTo(String value) {
            addCriterion("djob <>", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobGreaterThan(String value) {
            addCriterion("djob >", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobGreaterThanOrEqualTo(String value) {
            addCriterion("djob >=", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobLessThan(String value) {
            addCriterion("djob <", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobLessThanOrEqualTo(String value) {
            addCriterion("djob <=", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobLike(String value) {
            addCriterion("djob like", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobNotLike(String value) {
            addCriterion("djob not like", value, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobIn(List<String> values) {
            addCriterion("djob in", values, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobNotIn(List<String> values) {
            addCriterion("djob not in", values, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobBetween(String value1, String value2) {
            addCriterion("djob between", value1, value2, "djob");
            return (Criteria) this;
        }

        public Criteria andDjobNotBetween(String value1, String value2) {
            addCriterion("djob not between", value1, value2, "djob");
            return (Criteria) this;
        }

        public Criteria andDageIsNull() {
            addCriterion("dage is null");
            return (Criteria) this;
        }

        public Criteria andDageIsNotNull() {
            addCriterion("dage is not null");
            return (Criteria) this;
        }

        public Criteria andDageEqualTo(String value) {
            addCriterion("dage =", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotEqualTo(String value) {
            addCriterion("dage <>", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThan(String value) {
            addCriterion("dage >", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageGreaterThanOrEqualTo(String value) {
            addCriterion("dage >=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThan(String value) {
            addCriterion("dage <", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLessThanOrEqualTo(String value) {
            addCriterion("dage <=", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageLike(String value) {
            addCriterion("dage like", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotLike(String value) {
            addCriterion("dage not like", value, "dage");
            return (Criteria) this;
        }

        public Criteria andDageIn(List<String> values) {
            addCriterion("dage in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotIn(List<String> values) {
            addCriterion("dage not in", values, "dage");
            return (Criteria) this;
        }

        public Criteria andDageBetween(String value1, String value2) {
            addCriterion("dage between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDageNotBetween(String value1, String value2) {
            addCriterion("dage not between", value1, value2, "dage");
            return (Criteria) this;
        }

        public Criteria andDsexIsNull() {
            addCriterion("dsex is null");
            return (Criteria) this;
        }

        public Criteria andDsexIsNotNull() {
            addCriterion("dsex is not null");
            return (Criteria) this;
        }

        public Criteria andDsexEqualTo(String value) {
            addCriterion("dsex =", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotEqualTo(String value) {
            addCriterion("dsex <>", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThan(String value) {
            addCriterion("dsex >", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexGreaterThanOrEqualTo(String value) {
            addCriterion("dsex >=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThan(String value) {
            addCriterion("dsex <", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLessThanOrEqualTo(String value) {
            addCriterion("dsex <=", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexLike(String value) {
            addCriterion("dsex like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotLike(String value) {
            addCriterion("dsex not like", value, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexIn(List<String> values) {
            addCriterion("dsex in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotIn(List<String> values) {
            addCriterion("dsex not in", values, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexBetween(String value1, String value2) {
            addCriterion("dsex between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andDsexNotBetween(String value1, String value2) {
            addCriterion("dsex not between", value1, value2, "dsex");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianIsNull() {
            addCriterion("zuozhenshijian is null");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianIsNotNull() {
            addCriterion("zuozhenshijian is not null");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianEqualTo(Date value) {
            addCriterion("zuozhenshijian =", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianNotEqualTo(Date value) {
            addCriterion("zuozhenshijian <>", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianGreaterThan(Date value) {
            addCriterion("zuozhenshijian >", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("zuozhenshijian >=", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianLessThan(Date value) {
            addCriterion("zuozhenshijian <", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianLessThanOrEqualTo(Date value) {
            addCriterion("zuozhenshijian <=", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianLike(Date value) {
            addCriterion("zuozhenshijian like", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianNotLike(Date value) {
            addCriterion("zuozhenshijian not like", value, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianIn(List<Date> values) {
            addCriterion("zuozhenshijian in", values, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianNotIn(List<Date> values) {
            addCriterion("zuozhenshijian not in", values, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianBetween(Date value1, Date value2) {
            addCriterion("zuozhenshijian between", value1, value2, "zuozhenshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhenshijianNotBetween(Date value1, Date value2) {
            addCriterion("zuozhenshijian not between", value1, value2, "zuozhenshijian");
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