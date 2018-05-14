package com.example.febriardis.aplikasiku;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Background extends StringRequest {
    private static final String REGIST ="http://apiritz.herokuapp.com/api/books";
    private Map<String,String> params;

    public Background(String username, String password){
        super(Method.POST, REGIST, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
