package com.example.onlineshop.pojo;

import java.util.Date;

public class Carousel {
    private Integer id;

    private Integer categoryid;

    private String imgpath;

    private String cardesc;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardesc() {
        return cardesc;
    }

    public void setCardesc(String cardesc) {
        this.cardesc = cardesc;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
}