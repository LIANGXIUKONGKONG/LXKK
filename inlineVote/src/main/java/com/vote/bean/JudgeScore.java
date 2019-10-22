package com.vote.bean;

public class JudgeScore {
    private Integer id;

    private Integer matchId;

    private Integer performanceId;

    private Integer singerId;

    private Integer userId;

    private String score;

    public JudgeScore(Integer id, Integer matchId, Integer performanceId, Integer singerId, Integer userId, String score) {
        this.id = id;
        this.matchId = matchId;
        this.performanceId = performanceId;
        this.singerId = singerId;
        this.userId = userId;
        this.score = score;
    }

    public JudgeScore() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Integer performanceId) {
        this.performanceId = performanceId;
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}