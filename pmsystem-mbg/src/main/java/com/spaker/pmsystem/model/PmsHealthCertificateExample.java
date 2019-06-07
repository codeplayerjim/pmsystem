package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsHealthCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsHealthCertificateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServTimeIsNull() {
            addCriterion("serv_time is null");
            return (Criteria) this;
        }

        public Criteria andServTimeIsNotNull() {
            addCriterion("serv_time is not null");
            return (Criteria) this;
        }

        public Criteria andServTimeEqualTo(Date value) {
            addCriterion("serv_time =", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeNotEqualTo(Date value) {
            addCriterion("serv_time <>", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeGreaterThan(Date value) {
            addCriterion("serv_time >", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("serv_time >=", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeLessThan(Date value) {
            addCriterion("serv_time <", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeLessThanOrEqualTo(Date value) {
            addCriterion("serv_time <=", value, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeIn(List<Date> values) {
            addCriterion("serv_time in", values, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeNotIn(List<Date> values) {
            addCriterion("serv_time not in", values, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeBetween(Date value1, Date value2) {
            addCriterion("serv_time between", value1, value2, "servTime");
            return (Criteria) this;
        }

        public Criteria andServTimeNotBetween(Date value1, Date value2) {
            addCriterion("serv_time not between", value1, value2, "servTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeIsNull() {
            addCriterion("expir_time is null");
            return (Criteria) this;
        }

        public Criteria andExpirTimeIsNotNull() {
            addCriterion("expir_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpirTimeEqualTo(Date value) {
            addCriterion("expir_time =", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeNotEqualTo(Date value) {
            addCriterion("expir_time <>", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeGreaterThan(Date value) {
            addCriterion("expir_time >", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expir_time >=", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeLessThan(Date value) {
            addCriterion("expir_time <", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeLessThanOrEqualTo(Date value) {
            addCriterion("expir_time <=", value, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeIn(List<Date> values) {
            addCriterion("expir_time in", values, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeNotIn(List<Date> values) {
            addCriterion("expir_time not in", values, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeBetween(Date value1, Date value2) {
            addCriterion("expir_time between", value1, value2, "expirTime");
            return (Criteria) this;
        }

        public Criteria andExpirTimeNotBetween(Date value1, Date value2) {
            addCriterion("expir_time not between", value1, value2, "expirTime");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNull() {
            addCriterion("institution is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionIsNotNull() {
            addCriterion("institution is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionEqualTo(String value) {
            addCriterion("institution =", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotEqualTo(String value) {
            addCriterion("institution <>", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThan(String value) {
            addCriterion("institution >", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("institution >=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThan(String value) {
            addCriterion("institution <", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLessThanOrEqualTo(String value) {
            addCriterion("institution <=", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionLike(String value) {
            addCriterion("institution like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotLike(String value) {
            addCriterion("institution not like", value, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionIn(List<String> values) {
            addCriterion("institution in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotIn(List<String> values) {
            addCriterion("institution not in", values, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionBetween(String value1, String value2) {
            addCriterion("institution between", value1, value2, "institution");
            return (Criteria) this;
        }

        public Criteria andInstitutionNotBetween(String value1, String value2) {
            addCriterion("institution not between", value1, value2, "institution");
            return (Criteria) this;
        }

        public Criteria andHasScriptIsNull() {
            addCriterion("has_script is null");
            return (Criteria) this;
        }

        public Criteria andHasScriptIsNotNull() {
            addCriterion("has_script is not null");
            return (Criteria) this;
        }

        public Criteria andHasScriptEqualTo(String value) {
            addCriterion("has_script =", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptNotEqualTo(String value) {
            addCriterion("has_script <>", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptGreaterThan(String value) {
            addCriterion("has_script >", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptGreaterThanOrEqualTo(String value) {
            addCriterion("has_script >=", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptLessThan(String value) {
            addCriterion("has_script <", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptLessThanOrEqualTo(String value) {
            addCriterion("has_script <=", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptLike(String value) {
            addCriterion("has_script like", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptNotLike(String value) {
            addCriterion("has_script not like", value, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptIn(List<String> values) {
            addCriterion("has_script in", values, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptNotIn(List<String> values) {
            addCriterion("has_script not in", values, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptBetween(String value1, String value2) {
            addCriterion("has_script between", value1, value2, "hasScript");
            return (Criteria) this;
        }

        public Criteria andHasScriptNotBetween(String value1, String value2) {
            addCriterion("has_script not between", value1, value2, "hasScript");
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