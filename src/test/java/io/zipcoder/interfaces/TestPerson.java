package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        String expectedName = "Keerthi";
        long id = 4l;
        Person person = new Person(4l, "Keerthi");
        //when
        String actual = person.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        long expectedId = 123456;
        String expectedName = "Tatiana";
        Person person = new Person (expectedId, expectedName);

        //When
        person.setName("Tatiana");
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}


