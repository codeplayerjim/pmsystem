package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsEmployeeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthpalceIsNull() {
            addCriterion("birthpalce is null");
            return (Criteria) this;
        }

        public Criteria andBirthpalceIsNotNull() {
            addCriterion("birthpalce is not null");
            return (Criteria) this;
        }

        public Criteria andBirthpalceEqualTo(String value) {
            addCriterion("birthpalce =", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceNotEqualTo(String value) {
            addCriterion("birthpalce <>", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceGreaterThan(String value) {
            addCriterion("birthpalce >", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceGreaterThanOrEqualTo(String value) {
            addCriterion("birthpalce >=", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceLessThan(String value) {
            addCriterion("birthpalce <", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceLessThanOrEqualTo(String value) {
            addCriterion("birthpalce <=", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceLike(String value) {
            addCriterion("birthpalce like", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceNotLike(String value) {
            addCriterion("birthpalce not like", value, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceIn(List<String> values) {
            addCriterion("birthpalce in", values, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceNotIn(List<String> values) {
            addCriterion("birthpalce not in", values, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceBetween(String value1, String value2) {
            addCriterion("birthpalce between", value1, value2, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andBirthpalceNotBetween(String value1, String value2) {
            addCriterion("birthpalce not between", value1, value2, "birthpalce");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("job_number not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNull() {
            addCriterion("date_of_birth is null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIsNotNull() {
            addCriterion("date_of_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthEqualTo(Date value) {
            addCriterion("date_of_birth =", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotEqualTo(Date value) {
            addCriterion("date_of_birth <>", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThan(Date value) {
            addCriterion("date_of_birth >", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("date_of_birth >=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThan(Date value) {
            addCriterion("date_of_birth <", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthLessThanOrEqualTo(Date value) {
            addCriterion("date_of_birth <=", value, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthIn(List<Date> values) {
            addCriterion("date_of_birth in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotIn(List<Date> values) {
            addCriterion("date_of_birth not in", values, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthBetween(Date value1, Date value2) {
            addCriterion("date_of_birth between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andDateOfBirthNotBetween(Date value1, Date value2) {
            addCriterion("date_of_birth not between", value1, value2, "dateOfBirth");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIsNull() {
            addCriterion("identification_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIsNotNull() {
            addCriterion("identification_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberEqualTo(String value) {
            addCriterion("identification_number =", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotEqualTo(String value) {
            addCriterion("identification_number <>", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberGreaterThan(String value) {
            addCriterion("identification_number >", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identification_number >=", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLessThan(String value) {
            addCriterion("identification_number <", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLessThanOrEqualTo(String value) {
            addCriterion("identification_number <=", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberLike(String value) {
            addCriterion("identification_number like", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotLike(String value) {
            addCriterion("identification_number not like", value, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberIn(List<String> values) {
            addCriterion("identification_number in", values, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotIn(List<String> values) {
            addCriterion("identification_number not in", values, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberBetween(String value1, String value2) {
            addCriterion("identification_number between", value1, value2, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIdentificationNumberNotBetween(String value1, String value2) {
            addCriterion("identification_number not between", value1, value2, "identificationNumber");
            return (Criteria) this;
        }

        public Criteria andIsMarryIsNull() {
            addCriterion("is_marry is null");
            return (Criteria) this;
        }

        public Criteria andIsMarryIsNotNull() {
            addCriterion("is_marry is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarryEqualTo(String value) {
            addCriterion("is_marry =", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotEqualTo(String value) {
            addCriterion("is_marry <>", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThan(String value) {
            addCriterion("is_marry >", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThanOrEqualTo(String value) {
            addCriterion("is_marry >=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThan(String value) {
            addCriterion("is_marry <", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThanOrEqualTo(String value) {
            addCriterion("is_marry <=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLike(String value) {
            addCriterion("is_marry like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotLike(String value) {
            addCriterion("is_marry not like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryIn(List<String> values) {
            addCriterion("is_marry in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotIn(List<String> values) {
            addCriterion("is_marry not in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryBetween(String value1, String value2) {
            addCriterion("is_marry between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotBetween(String value1, String value2) {
            addCriterion("is_marry not between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeIsNull() {
            addCriterion("house_register_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeIsNotNull() {
            addCriterion("house_register_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeEqualTo(String value) {
            addCriterion("house_register_type =", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeNotEqualTo(String value) {
            addCriterion("house_register_type <>", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeGreaterThan(String value) {
            addCriterion("house_register_type >", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_register_type >=", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeLessThan(String value) {
            addCriterion("house_register_type <", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeLessThanOrEqualTo(String value) {
            addCriterion("house_register_type <=", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeLike(String value) {
            addCriterion("house_register_type like", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeNotLike(String value) {
            addCriterion("house_register_type not like", value, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeIn(List<String> values) {
            addCriterion("house_register_type in", values, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeNotIn(List<String> values) {
            addCriterion("house_register_type not in", values, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeBetween(String value1, String value2) {
            addCriterion("house_register_type between", value1, value2, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterTypeNotBetween(String value1, String value2) {
            addCriterion("house_register_type not between", value1, value2, "houseRegisterType");
            return (Criteria) this;
        }

        public Criteria andCanteenIsNull() {
            addCriterion("canteen is null");
            return (Criteria) this;
        }

        public Criteria andCanteenIsNotNull() {
            addCriterion("canteen is not null");
            return (Criteria) this;
        }

        public Criteria andCanteenEqualTo(String value) {
            addCriterion("canteen =", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotEqualTo(String value) {
            addCriterion("canteen <>", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenGreaterThan(String value) {
            addCriterion("canteen >", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenGreaterThanOrEqualTo(String value) {
            addCriterion("canteen >=", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLessThan(String value) {
            addCriterion("canteen <", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLessThanOrEqualTo(String value) {
            addCriterion("canteen <=", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenLike(String value) {
            addCriterion("canteen like", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotLike(String value) {
            addCriterion("canteen not like", value, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenIn(List<String> values) {
            addCriterion("canteen in", values, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotIn(List<String> values) {
            addCriterion("canteen not in", values, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenBetween(String value1, String value2) {
            addCriterion("canteen between", value1, value2, "canteen");
            return (Criteria) this;
        }

        public Criteria andCanteenNotBetween(String value1, String value2) {
            addCriterion("canteen not between", value1, value2, "canteen");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenIsNull() {
            addCriterion("authr_stren is null");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenIsNotNull() {
            addCriterion("authr_stren is not null");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenEqualTo(String value) {
            addCriterion("authr_stren =", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenNotEqualTo(String value) {
            addCriterion("authr_stren <>", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenGreaterThan(String value) {
            addCriterion("authr_stren >", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenGreaterThanOrEqualTo(String value) {
            addCriterion("authr_stren >=", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenLessThan(String value) {
            addCriterion("authr_stren <", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenLessThanOrEqualTo(String value) {
            addCriterion("authr_stren <=", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenLike(String value) {
            addCriterion("authr_stren like", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenNotLike(String value) {
            addCriterion("authr_stren not like", value, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenIn(List<String> values) {
            addCriterion("authr_stren in", values, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenNotIn(List<String> values) {
            addCriterion("authr_stren not in", values, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenBetween(String value1, String value2) {
            addCriterion("authr_stren between", value1, value2, "authrStren");
            return (Criteria) this;
        }

        public Criteria andAuthrStrenNotBetween(String value1, String value2) {
            addCriterion("authr_stren not between", value1, value2, "authrStren");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNull() {
            addCriterion("highest_education is null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIsNotNull() {
            addCriterion("highest_education is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationEqualTo(String value) {
            addCriterion("highest_education =", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotEqualTo(String value) {
            addCriterion("highest_education <>", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThan(String value) {
            addCriterion("highest_education >", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationGreaterThanOrEqualTo(String value) {
            addCriterion("highest_education >=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThan(String value) {
            addCriterion("highest_education <", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLessThanOrEqualTo(String value) {
            addCriterion("highest_education <=", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationLike(String value) {
            addCriterion("highest_education like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotLike(String value) {
            addCriterion("highest_education not like", value, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationIn(List<String> values) {
            addCriterion("highest_education in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotIn(List<String> values) {
            addCriterion("highest_education not in", values, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationBetween(String value1, String value2) {
            addCriterion("highest_education between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andHighestEducationNotBetween(String value1, String value2) {
            addCriterion("highest_education not between", value1, value2, "highestEducation");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("graduated_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("graduated_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("graduated_school =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("graduated_school <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("graduated_school >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduated_school >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("graduated_school <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduated_school <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("graduated_school like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("graduated_school not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("graduated_school in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("graduated_school not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("graduated_school between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("graduated_school not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationIsNull() {
            addCriterion("house_register_location is null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationIsNotNull() {
            addCriterion("house_register_location is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationEqualTo(String value) {
            addCriterion("house_register_location =", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationNotEqualTo(String value) {
            addCriterion("house_register_location <>", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationGreaterThan(String value) {
            addCriterion("house_register_location >", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationGreaterThanOrEqualTo(String value) {
            addCriterion("house_register_location >=", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationLessThan(String value) {
            addCriterion("house_register_location <", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationLessThanOrEqualTo(String value) {
            addCriterion("house_register_location <=", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationLike(String value) {
            addCriterion("house_register_location like", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationNotLike(String value) {
            addCriterion("house_register_location not like", value, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationIn(List<String> values) {
            addCriterion("house_register_location in", values, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationNotIn(List<String> values) {
            addCriterion("house_register_location not in", values, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationBetween(String value1, String value2) {
            addCriterion("house_register_location between", value1, value2, "houseRegisterLocation");
            return (Criteria) this;
        }

        public Criteria andHouseRegisterLocationNotBetween(String value1, String value2) {
            addCriterion("house_register_location not between", value1, value2, "houseRegisterLocation");
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