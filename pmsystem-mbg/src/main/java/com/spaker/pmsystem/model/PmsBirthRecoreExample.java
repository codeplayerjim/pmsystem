package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsBirthRecoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsBirthRecoreExample() {
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

        public Criteria andNewbornIsNull() {
            addCriterion("newborn is null");
            return (Criteria) this;
        }

        public Criteria andNewbornIsNotNull() {
            addCriterion("newborn is not null");
            return (Criteria) this;
        }

        public Criteria andNewbornEqualTo(String value) {
            addCriterion("newborn =", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornNotEqualTo(String value) {
            addCriterion("newborn <>", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornGreaterThan(String value) {
            addCriterion("newborn >", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornGreaterThanOrEqualTo(String value) {
            addCriterion("newborn >=", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornLessThan(String value) {
            addCriterion("newborn <", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornLessThanOrEqualTo(String value) {
            addCriterion("newborn <=", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornLike(String value) {
            addCriterion("newborn like", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornNotLike(String value) {
            addCriterion("newborn not like", value, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornIn(List<String> values) {
            addCriterion("newborn in", values, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornNotIn(List<String> values) {
            addCriterion("newborn not in", values, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornBetween(String value1, String value2) {
            addCriterion("newborn between", value1, value2, "newborn");
            return (Criteria) this;
        }

        public Criteria andNewbornNotBetween(String value1, String value2) {
            addCriterion("newborn not between", value1, value2, "newborn");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalIsNull() {
            addCriterion("Product_inspection_hospital is null");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalIsNotNull() {
            addCriterion("Product_inspection_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalEqualTo(String value) {
            addCriterion("Product_inspection_hospital =", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalNotEqualTo(String value) {
            addCriterion("Product_inspection_hospital <>", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalGreaterThan(String value) {
            addCriterion("Product_inspection_hospital >", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("Product_inspection_hospital >=", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalLessThan(String value) {
            addCriterion("Product_inspection_hospital <", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalLessThanOrEqualTo(String value) {
            addCriterion("Product_inspection_hospital <=", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalLike(String value) {
            addCriterion("Product_inspection_hospital like", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalNotLike(String value) {
            addCriterion("Product_inspection_hospital not like", value, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalIn(List<String> values) {
            addCriterion("Product_inspection_hospital in", values, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalNotIn(List<String> values) {
            addCriterion("Product_inspection_hospital not in", values, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalBetween(String value1, String value2) {
            addCriterion("Product_inspection_hospital between", value1, value2, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andProductInspectionHospitalNotBetween(String value1, String value2) {
            addCriterion("Product_inspection_hospital not between", value1, value2, "productInspectionHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalIsNull() {
            addCriterion("childbirth_hospital is null");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalIsNotNull() {
            addCriterion("childbirth_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalEqualTo(String value) {
            addCriterion("childbirth_hospital =", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalNotEqualTo(String value) {
            addCriterion("childbirth_hospital <>", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalGreaterThan(String value) {
            addCriterion("childbirth_hospital >", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("childbirth_hospital >=", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalLessThan(String value) {
            addCriterion("childbirth_hospital <", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalLessThanOrEqualTo(String value) {
            addCriterion("childbirth_hospital <=", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalLike(String value) {
            addCriterion("childbirth_hospital like", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalNotLike(String value) {
            addCriterion("childbirth_hospital not like", value, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalIn(List<String> values) {
            addCriterion("childbirth_hospital in", values, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalNotIn(List<String> values) {
            addCriterion("childbirth_hospital not in", values, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalBetween(String value1, String value2) {
            addCriterion("childbirth_hospital between", value1, value2, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andChildbirthHospitalNotBetween(String value1, String value2) {
            addCriterion("childbirth_hospital not between", value1, value2, "childbirthHospital");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberIsNull() {
            addCriterion("birth_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberIsNotNull() {
            addCriterion("birth_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberEqualTo(Integer value) {
            addCriterion("birth_certificate_number =", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberNotEqualTo(Integer value) {
            addCriterion("birth_certificate_number <>", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberGreaterThan(Integer value) {
            addCriterion("birth_certificate_number >", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("birth_certificate_number >=", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberLessThan(Integer value) {
            addCriterion("birth_certificate_number <", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberLessThanOrEqualTo(Integer value) {
            addCriterion("birth_certificate_number <=", value, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberIn(List<Integer> values) {
            addCriterion("birth_certificate_number in", values, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberNotIn(List<Integer> values) {
            addCriterion("birth_certificate_number not in", values, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberBetween(Integer value1, Integer value2) {
            addCriterion("birth_certificate_number between", value1, value2, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andBirthCertificateNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("birth_certificate_number not between", value1, value2, "birthCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andFertilityDateIsNull() {
            addCriterion("fertility_date is null");
            return (Criteria) this;
        }

        public Criteria andFertilityDateIsNotNull() {
            addCriterion("fertility_date is not null");
            return (Criteria) this;
        }

        public Criteria andFertilityDateEqualTo(Date value) {
            addCriterion("fertility_date =", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateNotEqualTo(Date value) {
            addCriterion("fertility_date <>", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateGreaterThan(Date value) {
            addCriterion("fertility_date >", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateGreaterThanOrEqualTo(Date value) {
            addCriterion("fertility_date >=", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateLessThan(Date value) {
            addCriterion("fertility_date <", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateLessThanOrEqualTo(Date value) {
            addCriterion("fertility_date <=", value, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateIn(List<Date> values) {
            addCriterion("fertility_date in", values, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateNotIn(List<Date> values) {
            addCriterion("fertility_date not in", values, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateBetween(Date value1, Date value2) {
            addCriterion("fertility_date between", value1, value2, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andFertilityDateNotBetween(Date value1, Date value2) {
            addCriterion("fertility_date not between", value1, value2, "fertilityDate");
            return (Criteria) this;
        }

        public Criteria andAbortionDataIsNull() {
            addCriterion("abortion_data is null");
            return (Criteria) this;
        }

        public Criteria andAbortionDataIsNotNull() {
            addCriterion("abortion_data is not null");
            return (Criteria) this;
        }

        public Criteria andAbortionDataEqualTo(Date value) {
            addCriterion("abortion_data =", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataNotEqualTo(Date value) {
            addCriterion("abortion_data <>", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataGreaterThan(Date value) {
            addCriterion("abortion_data >", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataGreaterThanOrEqualTo(Date value) {
            addCriterion("abortion_data >=", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataLessThan(Date value) {
            addCriterion("abortion_data <", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataLessThanOrEqualTo(Date value) {
            addCriterion("abortion_data <=", value, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataIn(List<Date> values) {
            addCriterion("abortion_data in", values, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataNotIn(List<Date> values) {
            addCriterion("abortion_data not in", values, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataBetween(Date value1, Date value2) {
            addCriterion("abortion_data between", value1, value2, "abortionData");
            return (Criteria) this;
        }

        public Criteria andAbortionDataNotBetween(Date value1, Date value2) {
            addCriterion("abortion_data not between", value1, value2, "abortionData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataIsNull() {
            addCriterion("birth_control_data is null");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataIsNotNull() {
            addCriterion("birth_control_data is not null");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataEqualTo(Date value) {
            addCriterion("birth_control_data =", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataNotEqualTo(Date value) {
            addCriterion("birth_control_data <>", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataGreaterThan(Date value) {
            addCriterion("birth_control_data >", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_control_data >=", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataLessThan(Date value) {
            addCriterion("birth_control_data <", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataLessThanOrEqualTo(Date value) {
            addCriterion("birth_control_data <=", value, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataIn(List<Date> values) {
            addCriterion("birth_control_data in", values, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataNotIn(List<Date> values) {
            addCriterion("birth_control_data not in", values, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataBetween(Date value1, Date value2) {
            addCriterion("birth_control_data between", value1, value2, "birthControlData");
            return (Criteria) this;
        }

        public Criteria andBirthControlDataNotBetween(Date value1, Date value2) {
            addCriterion("birth_control_data not between", value1, value2, "birthControlData");
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