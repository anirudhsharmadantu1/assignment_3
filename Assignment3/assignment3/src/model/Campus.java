package model;

import java.util.List;

public class Campus {
    private String registrationNumber;
    private String campusName;
    private String campusLocation;
    private String city;
    private List<Building> buildings;

    public Campus() {
    }

    public Campus(String registrationNumber, String campusName, String campusLocation, String city, List<Building> buildings) {
        this.registrationNumber = registrationNumber;
        this.campusName = campusName;
        this.campusLocation = campusLocation;
        this.city = city;
        this.buildings = buildings;
    }

    private Building getLargestBuilding(){
        Building res = null;
        int max = Integer.MIN_VALUE;
        for(Building building : buildings){
            if(max < building.totalBuildingCapacity()){
                max = building.totalBuildingCapacity();
                res = building;
            }
        }
        return res;
    }
    private Building getSmallestBuilding(){
        Building res = null;
        int min = Integer.MAX_VALUE;
        for(Building building : buildings){
            if(min > building.totalBuildingCapacity()){
                min = building.totalBuildingCapacity();
                res = building;
            }
        }
        return res;
    }
    private Building searchByBuildingNumber(int number){
        for(Building building : buildings){
            if(building.getNumber() == number){
                return building;
            }
        }
        return null;
    }
    private Building searchByBuildingName(String name){
        for(Building building : buildings){
            if(building.getName().equals(name)){
                return building;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" + "\n"+
                "registrationNumber='" + registrationNumber + '\'' + "\n"+
                "campusName='" + campusName + '\'' + "\n"+
                "campusLocation='" + campusLocation + '\'' + "\n"+
                "city='" + city + '\'' + "\n"+
                '}'+"\n";
    }
}
