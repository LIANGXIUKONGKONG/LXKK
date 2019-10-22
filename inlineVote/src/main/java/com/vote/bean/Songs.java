package com.vote.bean;

public class Songs {
    private Integer id;

    private String songsName;

    private Integer singerId;

    public Songs(Integer id, String songsName, Integer singerId) {
        this.id = id;
        this.songsName = songsName;
        this.singerId = singerId;
    }

    public Songs() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongsName() {
        return songsName;
    }

    public void setSongsName(String songsName) {
        this.songsName = songsName == null ? null : songsName.trim();
    }

    public Integer getSingerId() {
        return singerId;
    }

    public void setSingerId(Integer singerId) {
        this.singerId = singerId;
    }
}