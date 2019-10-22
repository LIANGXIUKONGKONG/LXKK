package com.vote.bean;

import java.util.ArrayList;
import java.util.List;

public class PerformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformanceExample() {
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

        public Criteria andPerformanceNameIsNull() {
            addCriterion("performance_name is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameIsNotNull() {
            addCriterion("performance_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameEqualTo(String value) {
            addCriterion("performance_name =", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameNotEqualTo(String value) {
            addCriterion("performance_name <>", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameGreaterThan(String value) {
            addCriterion("performance_name >", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("performance_name >=", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameLessThan(String value) {
            addCriterion("performance_name <", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameLessThanOrEqualTo(String value) {
            addCriterion("performance_name <=", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameLike(String value) {
            addCriterion("performance_name like", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameNotLike(String value) {
            addCriterion("performance_name not like", value, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameIn(List<String> values) {
            addCriterion("performance_name in", values, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameNotIn(List<String> values) {
            addCriterion("performance_name not in", values, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameBetween(String value1, String value2) {
            addCriterion("performance_name between", value1, value2, "performanceName");
            return (Criteria) this;
        }

        public Criteria andPerformanceNameNotBetween(String value1, String value2) {
            addCriterion("performance_name not between", value1, value2, "performanceName");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNull() {
            addCriterion("match_id is null");
            return (Criteria) this;
        }

        public Criteria andMatchIdIsNotNull() {
            addCriterion("match_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatchIdEqualTo(Integer value) {
            addCriterion("match_id =", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotEqualTo(Integer value) {
            addCriterion("match_id <>", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThan(Integer value) {
            addCriterion("match_id >", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("match_id >=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThan(Integer value) {
            addCriterion("match_id <", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("match_id <=", value, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdIn(List<Integer> values) {
            addCriterion("match_id in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotIn(List<Integer> values) {
            addCriterion("match_id not in", values, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdBetween(Integer value1, Integer value2) {
            addCriterion("match_id between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andMatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("match_id not between", value1, value2, "matchId");
            return (Criteria) this;
        }

        public Criteria andSinger1IdIsNull() {
            addCriterion("singer1_id is null");
            return (Criteria) this;
        }

        public Criteria andSinger1IdIsNotNull() {
            addCriterion("singer1_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinger1IdEqualTo(Integer value) {
            addCriterion("singer1_id =", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdNotEqualTo(Integer value) {
            addCriterion("singer1_id <>", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdGreaterThan(Integer value) {
            addCriterion("singer1_id >", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("singer1_id >=", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdLessThan(Integer value) {
            addCriterion("singer1_id <", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdLessThanOrEqualTo(Integer value) {
            addCriterion("singer1_id <=", value, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdIn(List<Integer> values) {
            addCriterion("singer1_id in", values, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdNotIn(List<Integer> values) {
            addCriterion("singer1_id not in", values, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdBetween(Integer value1, Integer value2) {
            addCriterion("singer1_id between", value1, value2, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger1IdNotBetween(Integer value1, Integer value2) {
            addCriterion("singer1_id not between", value1, value2, "singer1Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdIsNull() {
            addCriterion("singer2_id is null");
            return (Criteria) this;
        }

        public Criteria andSinger2IdIsNotNull() {
            addCriterion("singer2_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinger2IdEqualTo(Integer value) {
            addCriterion("singer2_id =", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdNotEqualTo(Integer value) {
            addCriterion("singer2_id <>", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdGreaterThan(Integer value) {
            addCriterion("singer2_id >", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("singer2_id >=", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdLessThan(Integer value) {
            addCriterion("singer2_id <", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdLessThanOrEqualTo(Integer value) {
            addCriterion("singer2_id <=", value, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdIn(List<Integer> values) {
            addCriterion("singer2_id in", values, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdNotIn(List<Integer> values) {
            addCriterion("singer2_id not in", values, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdBetween(Integer value1, Integer value2) {
            addCriterion("singer2_id between", value1, value2, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andSinger2IdNotBetween(Integer value1, Integer value2) {
            addCriterion("singer2_id not between", value1, value2, "singer2Id");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1IsNull() {
            addCriterion("audience_vote1 is null");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1IsNotNull() {
            addCriterion("audience_vote1 is not null");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1EqualTo(Integer value) {
            addCriterion("audience_vote1 =", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1NotEqualTo(Integer value) {
            addCriterion("audience_vote1 <>", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1GreaterThan(Integer value) {
            addCriterion("audience_vote1 >", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1GreaterThanOrEqualTo(Integer value) {
            addCriterion("audience_vote1 >=", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1LessThan(Integer value) {
            addCriterion("audience_vote1 <", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1LessThanOrEqualTo(Integer value) {
            addCriterion("audience_vote1 <=", value, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1In(List<Integer> values) {
            addCriterion("audience_vote1 in", values, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1NotIn(List<Integer> values) {
            addCriterion("audience_vote1 not in", values, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1Between(Integer value1, Integer value2) {
            addCriterion("audience_vote1 between", value1, value2, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote1NotBetween(Integer value1, Integer value2) {
            addCriterion("audience_vote1 not between", value1, value2, "audienceVote1");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2IsNull() {
            addCriterion("audience_vote2 is null");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2IsNotNull() {
            addCriterion("audience_vote2 is not null");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2EqualTo(Integer value) {
            addCriterion("audience_vote2 =", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2NotEqualTo(Integer value) {
            addCriterion("audience_vote2 <>", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2GreaterThan(Integer value) {
            addCriterion("audience_vote2 >", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2GreaterThanOrEqualTo(Integer value) {
            addCriterion("audience_vote2 >=", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2LessThan(Integer value) {
            addCriterion("audience_vote2 <", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2LessThanOrEqualTo(Integer value) {
            addCriterion("audience_vote2 <=", value, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2In(List<Integer> values) {
            addCriterion("audience_vote2 in", values, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2NotIn(List<Integer> values) {
            addCriterion("audience_vote2 not in", values, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2Between(Integer value1, Integer value2) {
            addCriterion("audience_vote2 between", value1, value2, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andAudienceVote2NotBetween(Integer value1, Integer value2) {
            addCriterion("audience_vote2 not between", value1, value2, "audienceVote2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1IsNull() {
            addCriterion("judge_score1 is null");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1IsNotNull() {
            addCriterion("judge_score1 is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1EqualTo(Integer value) {
            addCriterion("judge_score1 =", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1NotEqualTo(Integer value) {
            addCriterion("judge_score1 <>", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1GreaterThan(Integer value) {
            addCriterion("judge_score1 >", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1GreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_score1 >=", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1LessThan(Integer value) {
            addCriterion("judge_score1 <", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1LessThanOrEqualTo(Integer value) {
            addCriterion("judge_score1 <=", value, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1In(List<Integer> values) {
            addCriterion("judge_score1 in", values, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1NotIn(List<Integer> values) {
            addCriterion("judge_score1 not in", values, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1Between(Integer value1, Integer value2) {
            addCriterion("judge_score1 between", value1, value2, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore1NotBetween(Integer value1, Integer value2) {
            addCriterion("judge_score1 not between", value1, value2, "judgeScore1");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2IsNull() {
            addCriterion("judge_score2 is null");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2IsNotNull() {
            addCriterion("judge_score2 is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2EqualTo(Integer value) {
            addCriterion("judge_score2 =", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2NotEqualTo(Integer value) {
            addCriterion("judge_score2 <>", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2GreaterThan(Integer value) {
            addCriterion("judge_score2 >", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2GreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_score2 >=", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2LessThan(Integer value) {
            addCriterion("judge_score2 <", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2LessThanOrEqualTo(Integer value) {
            addCriterion("judge_score2 <=", value, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2In(List<Integer> values) {
            addCriterion("judge_score2 in", values, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2NotIn(List<Integer> values) {
            addCriterion("judge_score2 not in", values, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2Between(Integer value1, Integer value2) {
            addCriterion("judge_score2 between", value1, value2, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andJudgeScore2NotBetween(Integer value1, Integer value2) {
            addCriterion("judge_score2 not between", value1, value2, "judgeScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore1IsNull() {
            addCriterion("total_score1 is null");
            return (Criteria) this;
        }

        public Criteria andTotalScore1IsNotNull() {
            addCriterion("total_score1 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScore1EqualTo(String value) {
            addCriterion("total_score1 =", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1NotEqualTo(String value) {
            addCriterion("total_score1 <>", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1GreaterThan(String value) {
            addCriterion("total_score1 >", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1GreaterThanOrEqualTo(String value) {
            addCriterion("total_score1 >=", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1LessThan(String value) {
            addCriterion("total_score1 <", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1LessThanOrEqualTo(String value) {
            addCriterion("total_score1 <=", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1Like(String value) {
            addCriterion("total_score1 like", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1NotLike(String value) {
            addCriterion("total_score1 not like", value, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1In(List<String> values) {
            addCriterion("total_score1 in", values, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1NotIn(List<String> values) {
            addCriterion("total_score1 not in", values, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1Between(String value1, String value2) {
            addCriterion("total_score1 between", value1, value2, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore1NotBetween(String value1, String value2) {
            addCriterion("total_score1 not between", value1, value2, "totalScore1");
            return (Criteria) this;
        }

        public Criteria andTotalScore2IsNull() {
            addCriterion("total_score2 is null");
            return (Criteria) this;
        }

        public Criteria andTotalScore2IsNotNull() {
            addCriterion("total_score2 is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScore2EqualTo(String value) {
            addCriterion("total_score2 =", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2NotEqualTo(String value) {
            addCriterion("total_score2 <>", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2GreaterThan(String value) {
            addCriterion("total_score2 >", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2GreaterThanOrEqualTo(String value) {
            addCriterion("total_score2 >=", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2LessThan(String value) {
            addCriterion("total_score2 <", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2LessThanOrEqualTo(String value) {
            addCriterion("total_score2 <=", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2Like(String value) {
            addCriterion("total_score2 like", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2NotLike(String value) {
            addCriterion("total_score2 not like", value, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2In(List<String> values) {
            addCriterion("total_score2 in", values, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2NotIn(List<String> values) {
            addCriterion("total_score2 not in", values, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2Between(String value1, String value2) {
            addCriterion("total_score2 between", value1, value2, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andTotalScore2NotBetween(String value1, String value2) {
            addCriterion("total_score2 not between", value1, value2, "totalScore2");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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