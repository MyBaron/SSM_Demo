package com.test.Entity;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/24.
 */
@Component
public class MYTest {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
