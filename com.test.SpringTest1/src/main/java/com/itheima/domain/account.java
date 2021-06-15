package com.itheima.domain;

import java.io.Serializable;

public class account implements Serializable {
    private String name;
    private Float money;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", id=" + id +
                '}';
    }
}
