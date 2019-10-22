package com.vote.bean;

public class Performance {
    private Integer id;

    private String performanceName;

    private Integer matchId;

    private Integer singer1Id;

    private Integer singer2Id;

    private Integer audienceVote1;

    private Integer audienceVote2;

    private Integer judgeScore1;

    private Integer judgeScore2;

    private String totalScore1;

    private String totalScore2;

    private String status;

    public Performance(Integer id, String performanceName, Integer matchId, Integer singer1Id, Integer singer2Id, Integer audienceVote1, Integer audienceVote2, Integer judgeScore1, Integer judgeScore2, String totalScore1, String totalScore2, String status) {
        this.id = id;
        this.performanceName = performanceName;
        this.matchId = matchId;
        this.singer1Id = singer1Id;
        this.singer2Id = singer2Id;
        this.audienceVote1 = audienceVote1;
        this.audienceVote2 = audienceVote2;
        this.judgeScore1 = judgeScore1;
        this.judgeScore2 = judgeScore2;
        this.totalScore1 = totalScore1;
        this.totalScore2 = totalScore2;
        this.status = status;
    }

    public Performance() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPerformanceName() {
        return performanceName;
    }

    public void setPerformanceName(String performanceName) {
        this.performanceName = performanceName == null ? null : performanceName.trim();
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getSinger1Id() {
        return singer1Id;
    }

    public void setSinger1Id(Integer singer1Id) {
        this.singer1Id = singer1Id;
    }

    public Integer getSinger2Id() {
        return singer2Id;
    }

    public void setSinger2Id(Integer singer2Id) {
        this.singer2Id = singer2Id;
    }

    public Integer getAudienceVote1() {
        return audienceVote1;
    }

    public void setAudienceVote1(Integer audienceVote1) {
        this.audienceVote1 = audienceVote1;
    }

    public Integer getAudienceVote2() {
        return audienceVote2;
    }

    public void setAudienceVote2(Integer audienceVote2) {
        this.audienceVote2 = audienceVote2;
    }

    public Integer getJudgeScore1() {
        return judgeScore1;
    }

    public void setJudgeScore1(Integer judgeScore1) {
        this.judgeScore1 = judgeScore1;
    }

    public Integer getJudgeScore2() {
        return judgeScore2;
    }

    public void setJudgeScore2(Integer judgeScore2) {
        this.judgeScore2 = judgeScore2;
    }

    public String getTotalScore1() {
        return totalScore1;
    }

    public void setTotalScore1(String totalScore1) {
        this.totalScore1 = totalScore1 == null ? null : totalScore1.trim();
    }

    public String getTotalScore2() {
        return totalScore2;
    }

    public void setTotalScore2(String totalScore2) {
        this.totalScore2 = totalScore2 == null ? null : totalScore2.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}