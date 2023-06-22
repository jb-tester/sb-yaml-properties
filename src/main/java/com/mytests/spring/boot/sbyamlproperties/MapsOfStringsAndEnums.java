package com.mytests.spring.boot.sbyamlproperties;

import com.mytests.spring.boot.sbyamlproperties.data.Enum1;
import com.mytests.spring.boot.sbyamlproperties.data.Enum2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 **
 * <p>Created by irina on 2/25/2022.</p>
 * <p>Project: sb-yaml-properties</p>
 **
 */
@ConfigurationProperties("my.props")
@Component
public class MapsOfStringsAndEnums {

    Map<String,String> stringStringMap;
    Map<String, Enum1> stringEnum1Map;
    Map<Enum1,String> enum1StringMap;
    /**
     * enum - enum map property.
     */
    Map<Enum1, Enum2> enum1Enum2Map;

    /**
     * string - string map property. This doc should be ignored
     */
    public Map<String, String> getStringStringMap() {
        return stringStringMap;
    }

    public void setStringStringMap(Map<String, String> stringStringMap) {
        this.stringStringMap = stringStringMap;
    }

    public Map<String, Enum1> getStringEnum1Map() {
        return stringEnum1Map;
    }

    public void setStringEnum1Map(Map<String, Enum1> stringEnum1Map) {
        this.stringEnum1Map = stringEnum1Map;
    }

    public Map<Enum1, String> getEnum1StringMap() {
        return enum1StringMap;
    }

    /**
     * enum-String map property.
     */
    public void setEnum1StringMap(Map<Enum1, String> enum1StringMap) {
        this.enum1StringMap = enum1StringMap;
    }

    public Map<Enum1, Enum2> getEnum1Enum2Map() {
        return enum1Enum2Map;
    }

    public void setEnum1Enum2Map(Map<Enum1, Enum2> enum1Enum2Map) {
        this.enum1Enum2Map = enum1Enum2Map;
    }
}
