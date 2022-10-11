package model;

import interfaces.Room;

public class Office implements Room {
    private int capacity;
    private Employee employee;
    private int roomNo;

    public String getEmployeeName(){
        return employee.getName();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Office(int capacity, Employee employee, int roomNo) {
        this.capacity = capacity;
        this.employee = employee;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "capacity=" + capacity +"\n"+
                "employee=" + employee +"\n"+
                "roomNo=" + roomNo +"\n"+
                '}' + "\n";
    }

    @Override
    public int getRoomCapacity() {
        return this.capacity;
    }

    @Override
    public int roomNo() {
        return this.roomNo;
    }

    public Office() {
    }
    public void changeEmployee(Employee employee){
        this.employee = employee;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Office(int capacity, Employee employee) {
        this.capacity = capacity;
        this.employee = employee;
    }
}
