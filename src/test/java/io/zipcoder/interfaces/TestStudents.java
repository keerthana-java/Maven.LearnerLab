package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void getStudentsTest(){
        //Given
        People people = Students.getInstance();
        int expected = 5;

        //When
        int actual = people.count();


        //Then
        Assert.assertEquals(expected, actual);

    }
}
