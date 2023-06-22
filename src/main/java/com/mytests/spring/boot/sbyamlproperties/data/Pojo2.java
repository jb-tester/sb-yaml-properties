package com.mytests.spring.boot.sbyamlproperties.data;

import java.util.Map;

/**
 * *
 * <p>Created by irina on 2/25/2022.</p>
 * <p>Project: sb-yaml-properties</p>
 * *
 */
public class Pojo2 {
    String id;
    Map<String,String> stringStringMap;
    Map<String, Enum1> stringEnumMap;
    Map<Enum1,String> enumStringMap;
    Map<Enum1, Enum2> enum1Enum2Map;

    public String getId() {
        return id;
    }

    public Pojo2 setId(String id) {
        this.id = id;
        return this;
    }

    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    public Map<String, Enum1> getStringEnumMap() {
        return stringEnumMap;
    }

    public void setStringEnumMap(Map<String, Enum1> stringEnumMap) {
        this.stringEnumMap = stringEnumMap;
    }

    public Map<Enum1, String> getEnumStringMap() {
        return enumStringMap;
    }

    public void setEnumStringMap(Map<Enum1, String> enumStringMap) {
        this.enumStringMap = enumStringMap;
    }

    public Map<Enum1, Enum2> getEnum1Enum2Map() {
        return enum1Enum2Map;
    }

    public void setEnum1Enum2Map(Map<Enum1, Enum2> enum1Enum2Map) {
        this.enum1Enum2Map = enum1Enum2Map;
    }
}
