package com.yugrdev.weather.gson;

/**
 * Created by Yugr on 2017/3/16 23:21.
 * Introduce:
 * Update by
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
