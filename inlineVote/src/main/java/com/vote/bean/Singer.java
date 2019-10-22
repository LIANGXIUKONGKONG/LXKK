package com.vote.bean;

public class Singer {
    private Integer id;

    private String singerNumber;

    private String singerName;

    private String imgUrl;

    private String status;

    private Integer matchId;

    public Singer(Integer id, String singerNumber, String singerName, String imgUrl, String status, Integer matchId) {
        this.id = id;
        this.singerNumber = singerNumber;
        this.singerName = singerName;
        this.imgUrl = imgUrl;
        this.status = status;
        this.matchId = matchId;
    }

    public Singer() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSingerNumber() {
        return singerNumber;
    }

    public void setSingerNumber(String singerNumber) {
        this.singerNumber = singerNumber == null ? null : singerNumber.trim();
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName == null ? null : singerName.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }
}