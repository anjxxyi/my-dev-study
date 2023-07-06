package com.tj.edu.practice3.objectmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    private String name;
    @JsonProperty("oldage")     // : java와 json에서 다르게 변수명을 사용하고 싶을 때 =>  @JsonProperty("json에서 사용할 변수명 입력")
    private int age;

    private List<Car> userCars;

    public List<Car> getUserCars() {
        return userCars;
    }

    public void setUserCars(List<Car> userCars) {
        this.userCars = userCars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userCars=" + userCars +
                '}';
    }
}
