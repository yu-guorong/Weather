package com.yugrdev.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yugr on 2017/3/16 23:22.
 * Introduce:
 * Update by
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

