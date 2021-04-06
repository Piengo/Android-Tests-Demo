package com.example.testingdemo;

import org.junit.Assert;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

// unit tests go in here
public class UserTest {

    private static final String name = "name";
    private static final int age = 10;

    @Test
    public void getNameTest() {
        User user = new User(name, age);
        assertThat(user.getName()).isEqualTo(name);
    }

    @Test
    public void getAgeTest() {
        User user = new User(name, age);
        assertThat(user.getAge()).isEqualTo(age);
    }

}