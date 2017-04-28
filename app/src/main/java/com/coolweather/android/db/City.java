package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by deng on 2017/4/28.
 */

public class City extends DataSupport {

    private int id;
    //记录市的名字
    private String cityName;
    //记录市的代号
    private int cityCode;
    //记录当前市所属的省Id值
    private int provinceId;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
