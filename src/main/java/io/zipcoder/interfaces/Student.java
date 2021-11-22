package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id , String name,Double totalStudyTime){
        super(id,name);

    }

    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;
    }
    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
    public void clearTotalStudyTime(){
        this.totalStudyTime = 0;
    }

}
