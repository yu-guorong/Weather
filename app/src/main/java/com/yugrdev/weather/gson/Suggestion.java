package com.yugrdev.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Yugr on 2017/3/16 23:23.
 * Introduce:
 * Update by
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
