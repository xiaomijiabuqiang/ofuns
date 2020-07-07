package com.example.onlineshop.pojo;

import java.util.Date;

public class News {

    private Integer id;
    private String imgpath;
    private String newsDesc;
    private String newsinfo;
    private Date createTime;

    public String getNewsinfo() {
        return newsinfo;
    }

    public void setNewsinfo(String newsinfo) {
        this.newsinfo = newsinfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
