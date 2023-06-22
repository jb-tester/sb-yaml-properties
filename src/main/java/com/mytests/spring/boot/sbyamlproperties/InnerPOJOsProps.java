package com.mytests.spring.boot.sbyamlproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.pojos.props")
public class InnerPOJOsProps {

    private MyPOJO myPOJO;
    private InnerClass innerClass;

    public MyPOJO getMyPOJO() {
        return myPOJO;
    }

    public void setMyPOJO(MyPOJO myPOJO) {
        this.myPOJO = myPOJO;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    public static class MyPOJO {
        /**
         * ***MyPOJO.strProp: has String type.***
         */
        private String strProp;

        /**
         * ***MyPOJO.numProp: has int type.***
         */
        private int numProp;

        public String getStrProp() {
            return strProp;
        }

        public void setStrProp(String strProp) {
            this.strProp = strProp;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }
    }
    public static class InnerClass{

        private String strProp;
        private int numProp;

        public String getStrProp() {
            return strProp;
        }

        public void setStrProp(String strProp) {
            this.strProp = strProp;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }
    }
}
