package com.yuejinfu.util;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class toWebUtil {

    public static String successJson(Object o){

        Map<String,Object> map=new HashMap();
        map.put("data",o);
        map.put("code",1);
        return JSON.toJSONString(map);

    }
}
