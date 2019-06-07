package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsPurchaseAndPurchaseSituationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsPurchaseAndPurchaseSituationExample() {
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

        public Criteria andPurchaseTimeIsNull() {
            addCriterion("purchase_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIsNotNull() {
            addCriterion("purchase_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeEqualTo(Date value) {
            addCriterion("purchase_time =", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotEqualTo(Date value) {
            addCriterion("purchase_time <>", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThan(Date value) {
            addCriterion("purchase_time >", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("purchase_time >=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThan(Date value) {
            addCriterion("purchase_time <", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("purchase_time <=", value, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeIn(List<Date> values) {
            addCriterion("purchase_time in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotIn(List<Date> values) {
            addCriterion("purchase_time not in", values, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeBetween(Date value1, Date value2) {
            addCriterion("purchase_time between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("purchase_time not between", value1, value2, "purchaseTime");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendIsNull() {
            addCriterion("time_to_suspend is null");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendIsNotNull() {
            addCriterion("time_to_suspend is not null");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendEqualTo(Date value) {
            addCriterion("time_to_suspend =", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendNotEqualTo(Date value) {
            addCriterion("time_to_suspend <>", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendGreaterThan(Date value) {
            addCriterion("time_to_suspend >", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendGreaterThanOrEqualTo(Date value) {
            addCriterion("time_to_suspend >=", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendLessThan(Date value) {
            addCriterion("time_to_suspend <", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendLessThanOrEqualTo(Date value) {
            addCriterion("time_to_suspend <=", value, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendIn(List<Date> values) {
            addCriterion("time_to_suspend in", values, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendNotIn(List<Date> values) {
            addCriterion("time_to_suspend not in", values, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendBetween(Date value1, Date value2) {
            addCriterion("time_to_suspend between", value1, value2, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andTimeToSuspendNotBetween(Date value1, Date value2) {
            addCriterion("time_to_suspend not between", value1, value2, "timeToSuspend");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdIsNull() {
            addCriterion("personal_computer_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdIsNotNull() {
            addCriterion("personal_computer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdEqualTo(Integer value) {
            addCriterion("personal_computer_id =", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdNotEqualTo(Integer value) {
            addCriterion("personal_computer_id <>", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdGreaterThan(Integer value) {
            addCriterion("personal_computer_id >", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("personal_computer_id >=", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdLessThan(Integer value) {
            addCriterion("personal_computer_id <", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdLessThanOrEqualTo(Integer value) {
            addCriterion("personal_computer_id <=", value, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdIn(List<Integer> values) {
            addCriterion("personal_computer_id in", values, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdNotIn(List<Integer> values) {
            addCriterion("personal_computer_id not in", values, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdBetween(Integer value1, Integer value2) {
            addCriterion("personal_computer_id between", value1, value2, "personalComputerId");
            return (Criteria) this;
        }

        public Criteria andPersonalComputerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("personal_computer_id not between", value1, value2, "personalComputerId");
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