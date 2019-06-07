package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProfessionalSkillsCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProfessionalSkillsCertificateExample() {
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

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_No is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_No is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_No =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_No <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_No >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_No >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_No <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_No <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_No like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_No not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_No in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_No not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_No between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_No not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelIsNull() {
            addCriterion("profession_level is null");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelIsNotNull() {
            addCriterion("profession_level is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelEqualTo(String value) {
            addCriterion("profession_level =", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelNotEqualTo(String value) {
            addCriterion("profession_level <>", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelGreaterThan(String value) {
            addCriterion("profession_level >", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("profession_level >=", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelLessThan(String value) {
            addCriterion("profession_level <", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelLessThanOrEqualTo(String value) {
            addCriterion("profession_level <=", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelLike(String value) {
            addCriterion("profession_level like", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelNotLike(String value) {
            addCriterion("profession_level not like", value, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelIn(List<String> values) {
            addCriterion("profession_level in", values, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelNotIn(List<String> values) {
            addCriterion("profession_level not in", values, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelBetween(String value1, String value2) {
            addCriterion("profession_level between", value1, value2, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andProfessionLevelNotBetween(String value1, String value2) {
            addCriterion("profession_level not between", value1, value2, "professionLevel");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIsNull() {
            addCriterion("release_organization is null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIsNotNull() {
            addCriterion("release_organization is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationEqualTo(String value) {
            addCriterion("release_organization =", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotEqualTo(String value) {
            addCriterion("release_organization <>", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationGreaterThan(String value) {
            addCriterion("release_organization >", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("release_organization >=", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLessThan(String value) {
            addCriterion("release_organization <", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLessThanOrEqualTo(String value) {
            addCriterion("release_organization <=", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationLike(String value) {
            addCriterion("release_organization like", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotLike(String value) {
            addCriterion("release_organization not like", value, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationIn(List<String> values) {
            addCriterion("release_organization in", values, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotIn(List<String> values) {
            addCriterion("release_organization not in", values, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationBetween(String value1, String value2) {
            addCriterion("release_organization between", value1, value2, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseOrganizationNotBetween(String value1, String value2) {
            addCriterion("release_organization not between", value1, value2, "releaseOrganization");
            return (Criteria) this;
        }

        public Criteria andReleaseDataIsNull() {
            addCriterion("release_data is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDataIsNotNull() {
            addCriterion("release_data is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDataEqualTo(Date value) {
            addCriterion("release_data =", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataNotEqualTo(Date value) {
            addCriterion("release_data <>", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataGreaterThan(Date value) {
            addCriterion("release_data >", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataGreaterThanOrEqualTo(Date value) {
            addCriterion("release_data >=", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataLessThan(Date value) {
            addCriterion("release_data <", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataLessThanOrEqualTo(Date value) {
            addCriterion("release_data <=", value, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataIn(List<Date> values) {
            addCriterion("release_data in", values, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataNotIn(List<Date> values) {
            addCriterion("release_data not in", values, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataBetween(Date value1, Date value2) {
            addCriterion("release_data between", value1, value2, "releaseData");
            return (Criteria) this;
        }

        public Criteria andReleaseDataNotBetween(Date value1, Date value2) {
            addCriterion("release_data not between", value1, value2, "releaseData");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillIsNull() {
            addCriterion("profession_skill is null");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillIsNotNull() {
            addCriterion("profession_skill is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillEqualTo(String value) {
            addCriterion("profession_skill =", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillNotEqualTo(String value) {
            addCriterion("profession_skill <>", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillGreaterThan(String value) {
            addCriterion("profession_skill >", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillGreaterThanOrEqualTo(String value) {
            addCriterion("profession_skill >=", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillLessThan(String value) {
            addCriterion("profession_skill <", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillLessThanOrEqualTo(String value) {
            addCriterion("profession_skill <=", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillLike(String value) {
            addCriterion("profession_skill like", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillNotLike(String value) {
            addCriterion("profession_skill not like", value, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillIn(List<String> values) {
            addCriterion("profession_skill in", values, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillNotIn(List<String> values) {
            addCriterion("profession_skill not in", values, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillBetween(String value1, String value2) {
            addCriterion("profession_skill between", value1, value2, "professionSkill");
            return (Criteria) this;
        }

        public Criteria andProfessionSkillNotBetween(String value1, String value2) {
            addCriterion("profession_skill not between", value1, value2, "professionSkill");
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