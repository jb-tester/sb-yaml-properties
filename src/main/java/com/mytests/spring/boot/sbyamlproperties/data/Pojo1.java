package com.mytests.spring.boot.sbyamlproperties.data;

import java.util.List;

/**
 **
 * <p>Created by irina on 2/25/2022.</p>
 * <p>Project: sb-yaml-properties</p>
 **
 */
public class Pojo1 {
    String str1;
    List<String> strlist1;
    Enum1 enum1;
    List<Enum1> enumsList1;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public List<String> getStrlist1() {
        return strlist1;
    }

    public void setStrlist1(List<String> strlist1) {
        this.strlist1 = strlist1;
    }

    public Enum1 getEnum1() {
        return enum1;
    }

    public void setEnum1(Enum1 enum1) {
        this.enum1 = enum1;
    }

    public List<Enum1> getEnumsList1() {
        return enumsList1;
    }

    public void setEnumsList1(List<Enum1> enumsList1) {
        this.enumsList1 = enumsList1;
    }

    @Override
    public String toString() {
        return "Pojo1{" +
                "str1='" + str1 + '\'' +
                ", strlist1=" + strlist1 +
                ", enum1=" + enum1 +
                ", enumsList1=" + enumsList1 +
                '}';
    }
}
