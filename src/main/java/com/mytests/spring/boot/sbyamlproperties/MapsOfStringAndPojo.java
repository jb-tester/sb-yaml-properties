package com.mytests.spring.boot.sbyamlproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

// https://youtrack.jetbrains.com/issue/IDEA-291922
@Component
@ConfigurationProperties("my.newprops")
public class MapsOfStringAndPojo {

    private Boolean firstKey;
    private Boolean secondKey;

    private Map<String, MyConfig> props;

    public Map<String, MyConfig> getProps() {
        return props;
    }

    public Boolean getFirstKey() {
        return firstKey;
    }
    // top-level property: here isXxx() getter works ok
    public Boolean isSecondKey() {
        return secondKey;
    }

    public void setProps(Map<String, MyConfig> props) {
        this.props = props;
    }

    public void setFirstKey(Boolean firstKey) {
        this.firstKey = firstKey;
    }

    public void setSecondKey(Boolean secondKey) {
        this.secondKey = secondKey;
    }

    public static class MyConfig {

        private Boolean trueKey;
        private Boolean falseKey;

        // problematic property: here isXxx() accessor using causes problem
        public Boolean isTrueKey() {
            return trueKey;
        }

        public void setTrueKey(Boolean trueKey) {
            this.trueKey = trueKey;
        }

        public Boolean getFalseKey() {
            return falseKey;
        }

        public void setFalseKey(Boolean falseKey) {
            this.falseKey = falseKey;
        }
    }
}
