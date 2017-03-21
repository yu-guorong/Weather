package com.yugrdev.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by yuygu on 2017/1/18.
 */

public class HttpUtil {
    public static void sentOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
