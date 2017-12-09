package com.p2p.restful.po;

import java.io.Serializable;

public class t_city implements Serializable {
    private int cityId;
    private int cityAreaNum;//城市编号
    private String cityName;//
    private int cityLevel;//城市级别
    private int parentCityAreaNum;//父级城市拜编号

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityAreaNum() {
        return cityAreaNum;
    }

    public void setCityAreaNum(int cityAreaNum) {
        this.cityAreaNum = cityAreaNum;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(int cityLevel) {
        this.cityLevel = cityLevel;
    }

    public int getParentCityAreaNum() {
        return parentCityAreaNum;
    }

    public void setParentCityAreaNum(int parentCityAreaNum) {
        this.parentCityAreaNum = parentCityAreaNum;
    }
}
