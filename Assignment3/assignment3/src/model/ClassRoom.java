package model;

import interfaces.Room;

import java.util.List;

public class ClassRoom implements Room {

    private int roomNumber;
    private int floor;
    private int capacity;
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public boolean checkIfCourseIsHeldThisClassRoombyCourseId(String id){
        for(Course course : courses){
            if(course.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "roomNumber=" + roomNumber + "\n" +
                "floor=" + floor + "\n" +
                "capacity=" + capacity + "\n" +
                "courses=" + courses + "\n" +
                '}' + "\n";
    }

    public boolean checkIfCourseIsHeldThisClassRoombyCourseName(String courseName){
        for(Course course : courses){
            if(course.getCourseName().equals(courseName)){
                return true;
            }
        }
        return false;
    }

    public int totalCourseInClassRoom(){
        return this.courses.size();
    }

    public ClassRoom() {
    }

    public ClassRoom(int roomNumber, int floor, int capacity) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
    }

    public ClassRoom(int roomNumber, int floor, int capacity, List<Course> courses) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
        this.courses = courses;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



    @Override
    public int getRoomCapacity() {
        return 0;
    }

    @Override
    public int roomNo() {
        return this.roomNumber;
    }

}
