package com.ssm.tmall.pojo;

/**
 * Created by LXX on 2019/4/24.
 */
public class Category {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null?null: name.trim();
    }
}
