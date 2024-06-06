package com.web.db_exp_back.entity;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("orders")
public class Order {
    private int orderid;
    private int uid;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", uid=" + uid +
                '}';
    }
}
