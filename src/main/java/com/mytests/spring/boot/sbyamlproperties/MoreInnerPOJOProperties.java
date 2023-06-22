package com.mytests.spring.boot.sbyamlproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties("demo.props")
@Component
public class MoreInnerPOJOProperties {


    private MyPOJO myPOJO;


    public MyPOJO getMyPOJO() {
        return myPOJO;
    }

    public void setMyPOJO(MyPOJO myPOJO) {
        this.myPOJO = myPOJO;
    }


    public static class MyPOJO {
        private int numProp;
        private String textValue;
        private String newValue;

        public String getTextValue() {
            return textValue;
        }

        public void setTextValue(String value) {
            this.textValue = value;
        }

        public int getNumProp() {
            return numProp;
        }

        public void setNumProp(int numProp) {
            this.numProp = numProp;
        }

        public String getNewValue() {
            return newValue;
        }

        public void setNewValue(String newValue) {
            this.newValue = newValue;
        }
    }
}
