package model;

public class Course {
    private String id;
    private String courseName;
    private long duration;
    private double passPercentage;

    public boolean checkPassStatus(double percentage){
        if(passPercentage <= percentage){
            return true;
        }
        return false;
    }
    public char getGrade(double percentage){
        if(percentage > 90 && percentage <= 100){
            return 'A';
        } else if (percentage > 70 && percentage <= 90){
            return 'B';
        } else if(percentage > 50 && percentage <= 70){
            return 'C';
        }
        return 'F';
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "id='" + id + '\'' + "\n" +
                "courseName='" + courseName + '\'' + "\n" +
                "duration=" + duration + "\n" +
                "passPercentage=" + passPercentage + "\n" +
                '}' + "\n";
    }

    public Course(String id, String courseName, long duration, double passPercentage) {
        this.id = id;
        this.courseName = courseName;
        this.duration = duration;
        this.passPercentage = passPercentage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public double getPassPercentage() {
        return passPercentage;
    }

    public void setPassPercentage(double passPercentage) {
        this.passPercentage = passPercentage;
    }




}
