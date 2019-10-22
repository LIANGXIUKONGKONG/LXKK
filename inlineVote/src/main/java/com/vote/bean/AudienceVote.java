package com.vote.bean;

public class AudienceVote {
    private Integer id;

    private Integer matchId;

    private Integer performanceId;

    private Integer singerId;

    private Integer userId;

    public AudienceVote(Integer id, Integer matchId, Integer performanceId, Integer singerId, Integer userId) {
        this.id = id;
        this.matchId = matchId;
        this.performanceId = performanceId;
        this.singerId = singerId;
        this.userId = userId;
    }

    public AudienceVote() {
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
}