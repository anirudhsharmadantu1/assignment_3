package model;

import interfaces.Room;

import java.util.List;

public class Building {
    private int number;
    private String name;
    private int floors;
    private List<Room> rooms;

    public Building() {
    }

    public Building(int number, String name, int floors, List<Room> rooms) {
        this.number = number;
        this.name = name;
        this.floors = floors;
        this.rooms = rooms;
    }

    public Room getClassRoomWithMaxCapacity(){
        int max = Integer.MIN_VALUE;
        Room res = null;
        for(Room room : rooms){
            if( room instanceof ClassRoom && max < room.getRoomCapacity()){
                max = ((ClassRoom) room).getCapacity();
                res = room;
            }
        }
        return res;
    }

    public Room getClassRoomWithMinCapacity(){
        int min = Integer.MIN_VALUE;
        Room res = null;
        for(Room room : rooms){
            if( room instanceof ClassRoom && min > room.getRoomCapacity()){
                min = ((ClassRoom) room).getCapacity();
                res = room;
            }
        }
        return res;
    }

    public int getRoomNumberOfEmployee(int employeeId){
        for(Room room : rooms){
            if(room instanceof Office ){
                Office office = (Office) room;
                if(office.getEmployee().getId() == employeeId){
                    return office.roomNo();
                }
            }
        }
        return -1;
    }


    public Room getRoomById(int roomNo){
        for(Room room : rooms){
            if(room.roomNo() == roomNo){
                return room;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +"\n"+
                "Building Number=" + number +"\n"+
                "Building Name='" + name + '\'' +"\n"+
                "Number of floors=" + floors + "\n"+
                '}' +"\n";
    }

    public int totalBuildingCapacity(){
        int capacity = 0;
        for(Room room : rooms){
            capacity += room.getRoomCapacity();
        }
        return capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfRooms(){
        return rooms.size();
    }
    public int totalCapacity(){
        return 0;
    }
    public int totalOfficeRooms(){
        return 0;
    }
    public int totalClassRooms(){
        return 0;
    }

}
