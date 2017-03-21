package com.yugrdev.weather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Yugr on 2017/3/16 23:28.
 * Introduce:
 * Update by
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
