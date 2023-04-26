package com.mytests.spring.boot.sbyamlproperties;

import com.mytests.spring.boot.sbyamlproperties.data.Enum1;
import com.mytests.spring.boot.sbyamlproperties.data.Pojo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbYamlPropertiesApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SbYamlPropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MapsOfStringsAndEnums mapsOfStringsAndEnums = ctx.getBean(MapsOfStringsAndEnums.class);
        System.out.println("--- Map<String,String>: [key3] ---");
        System.out.println(mapsOfStringsAndEnums.getStringStringMap().get("[key3]"));
        System.out.println("--- Map<String,String>: all ---");
        mapsOfStringsAndEnums.getStringStringMap().forEach((k, v) -> System.out.println((k + ":" + v)));
        System.out.println("--- List<Enum> ---");
        ListsAndMapsOfPOJO listsAndMapsOfPOJO = ctx.getBean(ListsAndMapsOfPOJO.class);
        for (Enum1 enum1 : listsAndMapsOfPOJO.getEnumList()) {
            System.out.println(enum1);
        }
        System.out.println("--- List<string> ---");
        for (String str : listsAndMapsOfPOJO.getStringList()) {
            System.out.println(str);
        }
        System.out.println("--- List<Pojo> ---");
        for (Pojo1 pojo1 : listsAndMapsOfPOJO.getPojoList()) {
            System.out.println(pojo1);
        }

    }

}
