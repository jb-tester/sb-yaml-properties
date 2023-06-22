package com.mytests.spring.boot.sbyamlproperties;

import com.mytests.spring.boot.sbyamlproperties.data.DiffStylesEnum;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@ConfigurationProperties("my.diff-style.props")
@Component
public class DiffStylesProps {

    /**
     * doc for myStrProp property.
     */
    String myStrProp = "default value for myStrProp";
    String prop_with_underscore;
    MyInnerClass myInnerClass;
    DiffStylesEnum[] stylesEnum;

    Map<DiffStylesEnum,String> stylesEnumStringMap;

    public Map<DiffStylesEnum, String> getStylesEnumStringMap() {
        return stylesEnumStringMap;
    }

    public DiffStylesProps setStylesEnumStringMap(Map<DiffStylesEnum, String> stylesEnumStringMap) {
        this.stylesEnumStringMap = stylesEnumStringMap;
        return this;
    }



    public DiffStylesEnum[] getStylesEnum() {
        return stylesEnum;
    }

    public DiffStylesProps setStylesEnum(DiffStylesEnum[] stylesEnum) {
        this.stylesEnum = stylesEnum;
        return this;
    }

    public String getMyStrProp() {
        return myStrProp;
    }

    public void setMyStrProp(String myStrProp) {
        this.myStrProp = myStrProp;
    }

    public MyInnerClass getMyInnerClass() {
        return myInnerClass;
    }

    public void setMyInnerClass(MyInnerClass myInnerClass) {
        this.myInnerClass = myInnerClass;
    }

    public String getProp_with_underscore() {
        return prop_with_underscore;
    }

    /**
     * prop_with_underscore setter
     */
    public void setProp_with_underscore(String prop_with_underscore) {
        this.prop_with_underscore = prop_with_underscore;
    }

    public static class MyInnerClass {

        String innerStrPropOne;
        String innerStrPropTwo;

        public String getInnerStrPropTwo() {
            return innerStrPropTwo;
        }

        public void setInnerStrPropTwo(String innerStrPropTwo) {
            this.innerStrPropTwo = innerStrPropTwo;
        }

        public String getInnerStrPropOne() {
            return innerStrPropOne;
        }

        public void setInnerStrPropOne(String innerStrPropOne) {
            this.innerStrPropOne = innerStrPropOne;
        }
    }
}
