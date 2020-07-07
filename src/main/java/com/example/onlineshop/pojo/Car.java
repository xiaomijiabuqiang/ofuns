package com.example.onlineshop.pojo;

import java.util.Date;

public class Car {
    private Integer id;

    private Integer userid;

    private Integer goods_id;

    private Goods goods;

    private Integer num;

    private Date create_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", userid=" + userid +
                ", goods_id=" + goods_id +
                ", goods=" + goods +
                ", num=" + num +
                ", create_date=" + create_date +
                '}';
    }
}