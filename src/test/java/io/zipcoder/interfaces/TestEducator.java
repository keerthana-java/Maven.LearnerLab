package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void implementationTest() {
        //Given
        Educator instructor = Educator.LEON;

        //When

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }


    @Test
    public void teachTest(){
        //Given
        Educator educator = Educator.DOLIO;
        Student student = new Student(123456L, "Keerthi", 0.0);
        educator.teach(student, 20);

        //When
        double expectedTimeWorked = 20;
        double actualTimeWorked = educator.getTimeWorked();

        //Then
        Assert.assertEquals(expectedTimeWorked, actualTimeWorked,0);
    }

}
