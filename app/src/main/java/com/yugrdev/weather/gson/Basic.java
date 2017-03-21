package com.yugrdev.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yugr on 2017/3/16 23:20.
 * Introduce:
 * Update by
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
