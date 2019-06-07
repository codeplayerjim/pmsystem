package com.spaker.pmsystem.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsRewardsAndPunishmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsRewardsAndPunishmentsExample() {
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

        public Criteria andRewardsIsNull() {
            addCriterion("rewards is null");
            return (Criteria) this;
        }

        public Criteria andRewardsIsNotNull() {
            addCriterion("rewards is not null");
            return (Criteria) this;
        }

        public Criteria andRewardsEqualTo(String value) {
            addCriterion("rewards =", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotEqualTo(String value) {
            addCriterion("rewards <>", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsGreaterThan(String value) {
            addCriterion("rewards >", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsGreaterThanOrEqualTo(String value) {
            addCriterion("rewards >=", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLessThan(String value) {
            addCriterion("rewards <", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLessThanOrEqualTo(String value) {
            addCriterion("rewards <=", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsLike(String value) {
            addCriterion("rewards like", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotLike(String value) {
            addCriterion("rewards not like", value, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsIn(List<String> values) {
            addCriterion("rewards in", values, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotIn(List<String> values) {
            addCriterion("rewards not in", values, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsBetween(String value1, String value2) {
            addCriterion("rewards between", value1, value2, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardsNotBetween(String value1, String value2) {
            addCriterion("rewards not between", value1, value2, "rewards");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIsNull() {
            addCriterion("reward_time is null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIsNotNull() {
            addCriterion("reward_time is not null");
            return (Criteria) this;
        }

        public Criteria andRewardTimeEqualTo(Date value) {
            addCriterion("reward_time =", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotEqualTo(Date value) {
            addCriterion("reward_time <>", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThan(Date value) {
            addCriterion("reward_time >", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reward_time >=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThan(Date value) {
            addCriterion("reward_time <", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeLessThanOrEqualTo(Date value) {
            addCriterion("reward_time <=", value, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeIn(List<Date> values) {
            addCriterion("reward_time in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotIn(List<Date> values) {
            addCriterion("reward_time not in", values, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeBetween(Date value1, Date value2) {
            addCriterion("reward_time between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andRewardTimeNotBetween(Date value1, Date value2) {
            addCriterion("reward_time not between", value1, value2, "rewardTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentsIsNull() {
            addCriterion("punishments is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentsIsNotNull() {
            addCriterion("punishments is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentsEqualTo(String value) {
            addCriterion("punishments =", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsNotEqualTo(String value) {
            addCriterion("punishments <>", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsGreaterThan(String value) {
            addCriterion("punishments >", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsGreaterThanOrEqualTo(String value) {
            addCriterion("punishments >=", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsLessThan(String value) {
            addCriterion("punishments <", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsLessThanOrEqualTo(String value) {
            addCriterion("punishments <=", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsLike(String value) {
            addCriterion("punishments like", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsNotLike(String value) {
            addCriterion("punishments not like", value, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsIn(List<String> values) {
            addCriterion("punishments in", values, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsNotIn(List<String> values) {
            addCriterion("punishments not in", values, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsBetween(String value1, String value2) {
            addCriterion("punishments between", value1, value2, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentsNotBetween(String value1, String value2) {
            addCriterion("punishments not between", value1, value2, "punishments");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeIsNull() {
            addCriterion("punishment_time is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeIsNotNull() {
            addCriterion("punishment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeEqualTo(Date value) {
            addCriterion("punishment_time =", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeNotEqualTo(Date value) {
            addCriterion("punishment_time <>", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeGreaterThan(Date value) {
            addCriterion("punishment_time >", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("punishment_time >=", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeLessThan(Date value) {
            addCriterion("punishment_time <", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeLessThanOrEqualTo(Date value) {
            addCriterion("punishment_time <=", value, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeIn(List<Date> values) {
            addCriterion("punishment_time in", values, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeNotIn(List<Date> values) {
            addCriterion("punishment_time not in", values, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeBetween(Date value1, Date value2) {
            addCriterion("punishment_time between", value1, value2, "punishmentTime");
            return (Criteria) this;
        }

        public Criteria andPunishmentTimeNotBetween(Date value1, Date value2) {
            addCriterion("punishment_time not between", value1, value2, "punishmentTime");
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