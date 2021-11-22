package io.zipcoder.interfaces;


import java.util.Iterator;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students(){


        this.add(new Student(123456, "Keerthi", 0.0));
        this.add(new Student(51, "Gaha", 0.0));
        this.add(new Student(1516, "Alekya", 0.0));
        this.add(new Student(600000, "Sushma", 0.0));
        this.add(new Student(314, "C", 0.0));



    }
    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] toArray(){
        Student[] studentArray = new Student[personList.size()];
        personList.toArray(studentArray);
        return studentArray;
    }

    public void clearAllStudyHours(){
        Iterator<Student> itr = personList.iterator();
        while(itr.hasNext()){
            Student student = itr.next();
            student.clearTotalStudyTime();
        }
    }
}
