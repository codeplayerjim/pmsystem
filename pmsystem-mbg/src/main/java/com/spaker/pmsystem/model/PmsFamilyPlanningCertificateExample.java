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

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(Integer value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(Integer value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(Integer value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(Integer value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(Integer value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<Integer> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<Integer> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(Integer value1, Integer value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
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

        public Criteria andContraceptionMeasuresIsNull() {
            addCriterion("contraception_measures is null");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresIsNotNull() {
            addCriterion("contraception_measures is not null");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresEqualTo(String value) {
            addCriterion("contraception_measures =", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresNotEqualTo(String value) {
            addCriterion("contraception_measures <>", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresGreaterThan(String value) {
            addCriterion("contraception_measures >", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("contraception_measures >=", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresLessThan(String value) {
            addCriterion("contraception_measures <", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresLessThanOrEqualTo(String value) {
            addCriterion("contraception_measures <=", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresLike(String value) {
            addCriterion("contraception_measures like", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresNotLike(String value) {
            addCriterion("contraception_measures not like", value, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresIn(List<String> values) {
            addCriterion("contraception_measures in", values, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresNotIn(List<String> values) {
            addCriterion("contraception_measures not in", values, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresBetween(String value1, String value2) {
            addCriterion("contraception_measures between", value1, value2, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andContraceptionMeasuresNotBetween(String value1, String value2) {
            addCriterion("contraception_measures not between", value1, value2, "contraceptionMeasures");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
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

        public Criteria andVaildTimeIsNull() {
            addCriterion("vaild_time is null");
            return (Criteria) this;
        }

        public Criteria andVaildTimeIsNotNull() {
            addCriterion("vaild_time is not null");
            return (Criteria) this;
        }

        public Criteria andVaildTimeEqualTo(Date value) {
            addCriterion("vaild_time =", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeNotEqualTo(Date value) {
            addCriterion("vaild_time <>", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeGreaterThan(Date value) {
            addCriterion("vaild_time >", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vaild_time >=", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeLessThan(Date value) {
            addCriterion("vaild_time <", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeLessThanOrEqualTo(Date value) {
            addCriterion("vaild_time <=", value, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeIn(List<Date> values) {
            addCriterion("vaild_time in", values, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeNotIn(List<Date> values) {
            addCriterion("vaild_time not in", values, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeBetween(Date value1, Date value2) {
            addCriterion("vaild_time between", value1, value2, "vaildTime");
            return (Criteria) this;
        }

        public Criteria andVaildTimeNotBetween(Date value1, Date value2) {
            addCriterion("vaild_time not between", value1, value2, "vaildTime");
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