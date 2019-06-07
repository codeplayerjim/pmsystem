package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsWorkPermitProcessingRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsWorkPermitProcessingRecordExample() {
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

        public Criteria andHealthyIdIsNull() {
            addCriterion("healthy_id is null");
            return (Criteria) this;
        }

        public Criteria andHealthyIdIsNotNull() {
            addCriterion("healthy_id is not null");
            return (Criteria) this;
        }

        public Criteria andHealthyIdEqualTo(Integer value) {
            addCriterion("healthy_id =", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdNotEqualTo(Integer value) {
            addCriterion("healthy_id <>", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdGreaterThan(Integer value) {
            addCriterion("healthy_id >", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("healthy_id >=", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdLessThan(Integer value) {
            addCriterion("healthy_id <", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdLessThanOrEqualTo(Integer value) {
            addCriterion("healthy_id <=", value, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdIn(List<Integer> values) {
            addCriterion("healthy_id in", values, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdNotIn(List<Integer> values) {
            addCriterion("healthy_id not in", values, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdBetween(Integer value1, Integer value2) {
            addCriterion("healthy_id between", value1, value2, "healthyId");
            return (Criteria) this;
        }

        public Criteria andHealthyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("healthy_id not between", value1, value2, "healthyId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdIsNull() {
            addCriterion("family_planning_certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdIsNotNull() {
            addCriterion("family_planning_certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdEqualTo(String value) {
            addCriterion("family_planning_certificate_id =", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdNotEqualTo(String value) {
            addCriterion("family_planning_certificate_id <>", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdGreaterThan(String value) {
            addCriterion("family_planning_certificate_id >", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("family_planning_certificate_id >=", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdLessThan(String value) {
            addCriterion("family_planning_certificate_id <", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdLessThanOrEqualTo(String value) {
            addCriterion("family_planning_certificate_id <=", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdLike(String value) {
            addCriterion("family_planning_certificate_id like", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdNotLike(String value) {
            addCriterion("family_planning_certificate_id not like", value, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdIn(List<String> values) {
            addCriterion("family_planning_certificate_id in", values, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdNotIn(List<String> values) {
            addCriterion("family_planning_certificate_id not in", values, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdBetween(String value1, String value2) {
            addCriterion("family_planning_certificate_id between", value1, value2, "familyPlanningCertificateId");
            return (Criteria) this;
        }

        public Criteria andFamilyPlanningCertificateIdNotBetween(String value1, String value2) {
            addCriterion("family_planning_certificate_id not between", value1, value2, "familyPlanningCertificateId");
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