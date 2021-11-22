package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray(){
        Instructor[] instructorArray = new Instructor[personList.size()];
        personList.toArray(instructorArray);
        return instructorArray;
    }
}
