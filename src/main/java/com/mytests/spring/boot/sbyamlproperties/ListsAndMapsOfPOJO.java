package com.mytests.spring.boot.sbyamlproperties;

import com.mytests.spring.boot.sbyamlproperties.data.Enum1;
import com.mytests.spring.boot.sbyamlproperties.data.Pojo1;
import com.mytests.spring.boot.sbyamlproperties.data.Pojo2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 2/25/2022.</p>
 * <p>Project: sb-yaml-properties</p>
 * *
 */
@ConfigurationProperties("my.props")
@Component
public class ListsAndMapsOfPOJO {

    List<Enum1> enumList;

    List<String> stringList;

    List<Pojo1> pojoList;

    Map<Enum1,Pojo1> enumPojoMap;

    Pojo2[] pojo2array;

    public Pojo2[] getPojo2array() {
        return pojo2array;
    }

    public void setPojo2array(Pojo2[] pojo2array) {
        this.pojo2array = pojo2array;
    }

    public List<Pojo1> getPojoList() {
        return pojoList;
    }

    public void setPojoList(List<Pojo1> pojoList) {
        this.pojoList = pojoList;
    }



    public Map<Enum1, Pojo1> getEnumPojoMap() {
        return enumPojoMap;
    }

    public void setEnumPojoMap(Map<Enum1, Pojo1> enumPojoMap) {
        this.enumPojoMap = enumPojoMap;
    }

    public List<Enum1> getEnumList() {
        return enumList;
    }

    public void setEnumList(List<Enum1> enumList) {
        this.enumList = enumList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
