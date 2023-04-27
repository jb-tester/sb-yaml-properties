package com.mytests.spring.boot.sbyamlproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@ConfigurationProperties("my.props2")
@Component
public class MyConfigurationProperties {
    private List<MyBean> list;
    private Map<String, MyBean> map;
    private Set<MyBean> set;


    public List<MyBean> getList() {
        return list;
    }

    public void setList(List<MyBean> list) {
        this.list = list;
    }

    public Map<String, MyBean> getMap() {
        return map;
    }

    public void setMap(Map<String, MyBean> map) {
        this.map = map;
    }

    public Set<MyBean> getSet() {
        return set;
    }

    public void setSet(Set<MyBean> set) {
        this.set = set;
    }

    public enum MyEnum {APPLE, ORANGE, LEMON}

    public static class MyBean {

        private Map<String, MyBean> map;
        private Map<MyEnum, MyBean> emap;
        private boolean bool;

        public Map<String, MyBean> getMap() {
            return map;
        }

        public void setMap(Map<String, MyBean> map) {
            this.map = map;
        }

        public Map<MyEnum, MyBean> getEmap() {
            return emap;
        }

        public void setEmap(Map<MyEnum, MyBean> emap) {
            this.emap = emap;
        }

        public boolean isBool() {
            return bool;
        }

        public boolean getBool() {
            return bool;
        }

        public void setBool(boolean bool) {
            this.bool = bool;
        }

    }
}