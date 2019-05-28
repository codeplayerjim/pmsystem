package com.spaker.pmsystem.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * json 序列化和反序列化工具类
 * Created by sunshine on 2019/3/21.
 */
public class JsonUtil {
    private static final ObjectMapper MAPPER=new ObjectMapper();

    /**
     * 将对象转换成json字符串
     */
    public static String ObjectToJson(Object data){
        try {
            String s=MAPPER.writeValueAsString(data);
            return s;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 将json结果集转化为对象
     */
    public static <T> T jsonToPojo(String jsonData,Class<T>beanType){
        try {
            T t=MAPPER.readValue(jsonData,beanType);
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json数据转换成pojo对象List
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T>List<T> jsonToList(String jsonData,Class<T>beanType){
        JavaType javaType=MAPPER.getTypeFactory().constructParametricType(List.class,beanType);
        try {
            List<T>list=MAPPER.readValue(jsonData,javaType);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
