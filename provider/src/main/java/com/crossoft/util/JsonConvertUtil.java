/**
 * JsonConvertUtil.java
 * Created at 2016年7月15日
 * Created by andy
 * Copyright (C) 2016 SHANGHAI VOLKSWAGEN, All rights reserved.
 */
package com.crossoft.util;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <p>ClassName: JsonConvertUtil</p>
 * <p>Description: TODO</p>
 * <p>Author: andy</p>
 * <p>Date: 2016年7月15日</p>
 */
public final class JsonConvertUtil {
    
    private static ObjectMapper mapper;
    
    /**
     * 获取ObjectMapper实例
     * @param createNew 方式：true，新实例；false,存在的mapper实例
     * @return
     */
    public static synchronized ObjectMapper getMapperInstance(boolean createNew) {   
        if (createNew) {   
            return new ObjectMapper();   
        } else if (mapper == null) {   
            mapper = new ObjectMapper();   
        }
        //设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性 
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        return mapper;
    } 
    
    /**
     * 将java对象转换成json字符串
     * @param obj 准备转换的对象
     * @return json字符串
     * @throws JsonProcessingException 
     * @throws Exception 
     */
    public static String beanToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = getMapperInstance(false);
        String json = objectMapper.writeValueAsString(obj);
        return json;       
    }
    
    /**
     * 将java对象转换成json字符串
     * @param obj 准备转换的对象
     * @param createNew ObjectMapper实例方式:true，新实例;false,存在的mapper实例
     * @return json字符串
     * @throws JsonProcessingException 
     * @throws Exception
     */
    public static String beanToJson(Object obj,Boolean createNew) throws JsonProcessingException {
        ObjectMapper objectMapper = getMapperInstance(createNew);
        String json = objectMapper.writeValueAsString(obj);
        return json;    
    }
    
    /**
     * 将json字符串转换成java对象
     * @param json 准备转换的json字符串
     * @param cls  准备转换的类
     * @return 
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @throws Exception 
     */
    public static Object jsonToBean(String json, Class<?> cls) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = getMapperInstance(false);
        Object vo = objectMapper.readValue(json, cls);
        return vo;  
    }
    
    /**
     * 将json字符串转换成java对象
     * @param json 准备转换的json字符串
     * @param cls  准备转换的类
     * @param createNew ObjectMapper实例方式:true，新实例;false,存在的mapper实例
     * @return
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @throws Exception
     */
    public static Object jsonToBean(String json, Class<?> cls,Boolean createNew) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = getMapperInstance(createNew);
        Object vo = objectMapper.readValue(json, cls);
        return vo;
    }
    
    public static <T>T jsonToCollection(String json, TypeReference<T> valueTypeRef) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objectMapper = getMapperInstance(false);
        return objectMapper.readValue(json, valueTypeRef);  
    } 
    
    
}
