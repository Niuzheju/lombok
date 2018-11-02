package com.niuzj.test;

import com.niuzj.model.Person;
import org.junit.Test;

import java.math.BigDecimal;

public class LombokTest {

    @Test
    public void test01(){
        Person person = new Person();
        person.setName("罗辑");
        person.setAge(22);
        person.setMoney(BigDecimal.ONE);
        person.setMarry(false);
        System.out.println(person);
    }

}
