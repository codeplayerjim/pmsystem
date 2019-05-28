package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsFamilyPlanningCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsFamilyPlanningCertificateExample() {
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

        public Criteria andNumberingIsNull() {
            addCriterion("numbering is null");
            return (Criteria) this;
        }

        public Criteria andNumberingIsNotNull() {
            addCriterion("numbering is not null");
            return (Criteria) this;
        }

        public Criteria andNumberingEqualTo(String value) {
            addCriterion("numbering =", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotEqualTo(String value) {
            addCriterion("numbering <>", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingGreaterThan(String value) {
            addCriterion("numbering >", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingGreaterThanOrEqualTo(String value) {
            addCriterion("numbering >=", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLessThan(String value) {
            addCriterion("numbering <", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLessThanOrEqualTo(String value) {
            addCriterion("numbering <=", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingLike(String value) {
            addCriterion("numbering like", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotLike(String value) {
            addCriterion("numbering not like", value, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingIn(List<String> values) {
            addCriterion("numbering in", values, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotIn(List<String> values) {
            addCriterion("numbering not in", values, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingBetween(String value1, String value2) {
            addCriterion("numbering between", value1, value2, "numbering");
            return (Criteria) this;
        }

        public Criteria andNumberingNotBetween(String value1, String value2) {
            addCriterion("numbering not between", value1, value2, "numbering");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNull() {
            addCriterion("household_registration is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIsNotNull() {
            addCriterion("household_registration is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationEqualTo(String value) {
            addCriterion("household_registration =", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotEqualTo(String value) {
            addCriterion("household_registration <>", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThan(String value) {
            addCriterion("household_registration >", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("household_registration >=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThan(String value) {
            addCriterion("household_registration <", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLessThanOrEqualTo(String value) {
            addCriterion("household_registration <=", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationLike(String value) {
            addCriterion("household_registration like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotLike(String value) {
            addCriterion("household_registration not like", value, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationIn(List<String> values) {
            addCriterion("household_registration in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotIn(List<String> values) {
            addCriterion("household_registration not in", values, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationBetween(String value1, String value2) {
            addCriterion("household_registration between", value1, value2, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andHouseholdRegistrationNotBetween(String value1, String value2) {
            addCriterion("household_registration not between", value1, value2, "householdRegistration");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNull() {
            addCriterion("measures is null");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNotNull() {
            addCriterion("measures is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuresEqualTo(String value) {
            addCriterion("measures =", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotEqualTo(String value) {
            addCriterion("measures <>", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThan(String value) {
            addCriterion("measures >", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("measures >=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThan(String value) {
            addCriterion("measures <", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThanOrEqualTo(String value) {
            addCriterion("measures <=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLike(String value) {
            addCriterion("measures like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotLike(String value) {
            addCriterion("measures not like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresIn(List<String> values) {
            addCriterion("measures in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotIn(List<String> values) {
            addCriterion("measures not in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresBetween(String value1, String value2) {
            addCriterion("measures between", value1, value2, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotBetween(String value1, String value2) {
            addCriterion("measures not between", value1, value2, "measures");
            return (Criteria) this;
        }

        public Criteria andLiveIsNull() {
            addCriterion("live is null");
            return (Criteria) this;
        }

        public Criteria andLiveIsNotNull() {
            addCriterion("live is not null");
            return (Criteria) this;
        }

        public Criteria andLiveEqualTo(String value) {
            addCriterion("live =", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveNotEqualTo(String value) {
            addCriterion("live <>", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveGreaterThan(String value) {
            addCriterion("live >", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveGreaterThanOrEqualTo(String value) {
            addCriterion("live >=", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveLessThan(String value) {
            addCriterion("live <", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveLessThanOrEqualTo(String value) {
            addCriterion("live <=", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveLike(String value) {
            addCriterion("live like", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveNotLike(String value) {
            addCriterion("live not like", value, "live");
            return (Criteria) this;
        }

        public Criteria andLiveIn(List<String> values) {
            addCriterion("live in", values, "live");
            return (Criteria) this;
        }

        public Criteria andLiveNotIn(List<String> values) {
            addCriterion("live not in", values, "live");
            return (Criteria) this;
        }

        public Criteria andLiveBetween(String value1, String value2) {
            addCriterion("live between", value1, value2, "live");
            return (Criteria) this;
        }

        public Criteria andLiveNotBetween(String value1, String value2) {
            addCriterion("live not between", value1, value2, "live");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactIsNull() {
            addCriterion("department_contact is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactIsNotNull() {
            addCriterion("department_contact is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactEqualTo(String value) {
            addCriterion("department_contact =", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactNotEqualTo(String value) {
            addCriterion("department_contact <>", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactGreaterThan(String value) {
            addCriterion("department_contact >", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactGreaterThanOrEqualTo(String value) {
            addCriterion("department_contact >=", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactLessThan(String value) {
            addCriterion("department_contact <", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactLessThanOrEqualTo(String value) {
            addCriterion("department_contact <=", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactLike(String value) {
            addCriterion("department_contact like", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactNotLike(String value) {
            addCriterion("department_contact not like", value, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactIn(List<String> values) {
            addCriterion("department_contact in", values, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactNotIn(List<String> values) {
            addCriterion("department_contact not in", values, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactBetween(String value1, String value2) {
            addCriterion("department_contact between", value1, value2, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andDepartmentContactNotBetween(String value1, String value2) {
            addCriterion("department_contact not between", value1, value2, "departmentContact");
            return (Criteria) this;
        }

        public Criteria andMealTimeIsNull() {
            addCriterion("meal_time is null");
            return (Criteria) this;
        }

        public Criteria andMealTimeIsNotNull() {
            addCriterion("meal_time is not null");
            return (Criteria) this;
        }

        public Criteria andMealTimeEqualTo(Date value) {
            addCriterion("meal_time =", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeNotEqualTo(Date value) {
            addCriterion("meal_time <>", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeGreaterThan(Date value) {
            addCriterion("meal_time >", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("meal_time >=", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeLessThan(Date value) {
            addCriterion("meal_time <", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeLessThanOrEqualTo(Date value) {
            addCriterion("meal_time <=", value, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeIn(List<Date> values) {
            addCriterion("meal_time in", values, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeNotIn(List<Date> values) {
            addCriterion("meal_time not in", values, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeBetween(Date value1, Date value2) {
            addCriterion("meal_time between", value1, value2, "mealTime");
            return (Criteria) this;
        }

        public Criteria andMealTimeNotBetween(Date value1, Date value2) {
            addCriterion("meal_time not between", value1, value2, "mealTime");
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