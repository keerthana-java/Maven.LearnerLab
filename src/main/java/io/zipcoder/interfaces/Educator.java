package io.zipcoder.interfaces;

public enum Educator implements Teacher{

        LEON(900,"leon"), KRIS(950,"kris"), DOLIO(980,"dolio");


        private final Instructor instructor;
        private double timeWorked;

        Educator(long id,String name){
            this.instructor = new Instructor(id,name);
            Instructors.getInstance().add(this.instructor);
        }

        public Instructor getInstructor(){
            return this.instructor;
        }


    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }


    public double getTimeWorked() {
            return this.timeWorked;
        }
        public void clearTimeWorked(){
            this.timeWorked = 0;
        }
    }

