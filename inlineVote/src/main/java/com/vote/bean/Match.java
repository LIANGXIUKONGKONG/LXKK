package com.vote.bean;

public class Match {
    private Integer id;

    private String matchName;

    private String status;

    public Match(Integer id, String matchName, String status) {
        this.id = id;
        this.matchName = matchName;
        this.status = status;
    }

    public Match() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}