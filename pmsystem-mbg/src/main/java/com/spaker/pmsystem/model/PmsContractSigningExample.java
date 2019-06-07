package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsContractSigningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsContractSigningExample() {
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

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andExiprTimeIsNull() {
            addCriterion("exipr_time is null");
            return (Criteria) this;
        }

        public Criteria andExiprTimeIsNotNull() {
            addCriterion("exipr_time is not null");
            return (Criteria) this;
        }

        public Criteria andExiprTimeEqualTo(Date value) {
            addCriterion("exipr_time =", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeNotEqualTo(Date value) {
            addCriterion("exipr_time <>", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeGreaterThan(Date value) {
            addCriterion("exipr_time >", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exipr_time >=", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeLessThan(Date value) {
            addCriterion("exipr_time <", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeLessThanOrEqualTo(Date value) {
            addCriterion("exipr_time <=", value, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeIn(List<Date> values) {
            addCriterion("exipr_time in", values, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeNotIn(List<Date> values) {
            addCriterion("exipr_time not in", values, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeBetween(Date value1, Date value2) {
            addCriterion("exipr_time between", value1, value2, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExiprTimeNotBetween(Date value1, Date value2) {
            addCriterion("exipr_time not between", value1, value2, "exiprTime");
            return (Criteria) this;
        }

        public Criteria andExpirSituationIsNull() {
            addCriterion("expir_situation is null");
            return (Criteria) this;
        }

        public Criteria andExpirSituationIsNotNull() {
            addCriterion("expir_situation is not null");
            return (Criteria) this;
        }

        public Criteria andExpirSituationEqualTo(String value) {
            addCriterion("expir_situation =", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationNotEqualTo(String value) {
            addCriterion("expir_situation <>", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationGreaterThan(String value) {
            addCriterion("expir_situation >", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationGreaterThanOrEqualTo(String value) {
            addCriterion("expir_situation >=", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationLessThan(String value) {
            addCriterion("expir_situation <", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationLessThanOrEqualTo(String value) {
            addCriterion("expir_situation <=", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationLike(String value) {
            addCriterion("expir_situation like", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationNotLike(String value) {
            addCriterion("expir_situation not like", value, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationIn(List<String> values) {
            addCriterion("expir_situation in", values, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationNotIn(List<String> values) {
            addCriterion("expir_situation not in", values, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationBetween(String value1, String value2) {
            addCriterion("expir_situation between", value1, value2, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andExpirSituationNotBetween(String value1, String value2) {
            addCriterion("expir_situation not between", value1, value2, "expirSituation");
            return (Criteria) this;
        }

        public Criteria andIsExpireIsNull() {
            addCriterion("is_expire is null");
            return (Criteria) this;
        }

        public Criteria andIsExpireIsNotNull() {
            addCriterion("is_expire is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpireEqualTo(String value) {
            addCriterion("is_expire =", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireNotEqualTo(String value) {
            addCriterion("is_expire <>", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireGreaterThan(String value) {
            addCriterion("is_expire >", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireGreaterThanOrEqualTo(String value) {
            addCriterion("is_expire >=", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireLessThan(String value) {
            addCriterion("is_expire <", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireLessThanOrEqualTo(String value) {
            addCriterion("is_expire <=", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireLike(String value) {
            addCriterion("is_expire like", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireNotLike(String value) {
            addCriterion("is_expire not like", value, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireIn(List<String> values) {
            addCriterion("is_expire in", values, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireNotIn(List<String> values) {
            addCriterion("is_expire not in", values, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireBetween(String value1, String value2) {
            addCriterion("is_expire between", value1, value2, "isExpire");
            return (Criteria) this;
        }

        public Criteria andIsExpireNotBetween(String value1, String value2) {
            addCriterion("is_expire not between", value1, value2, "isExpire");
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