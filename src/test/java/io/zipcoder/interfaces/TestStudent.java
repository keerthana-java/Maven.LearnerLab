package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest(){
        //Given
        Student student = new Student(123456L, "Keerthi", 5.0);

        //When

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    }

