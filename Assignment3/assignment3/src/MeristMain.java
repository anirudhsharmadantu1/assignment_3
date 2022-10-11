import interfaces.Room;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class MeristMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Jagan","12345678","jagan@gmail.com");
        Employee employee1 =  new Employee(2, "John","09876544","john@gmail.com");

        Course course = new Course("MTH101","Maths",60,35);
        Course course1 = new Course("MTH103","Advance Maths",60,40);
        Course course2 = new Course("CS101","Computer Science",40, 50);
        Course course3 = new Course("CS103","Data Mining",90,35);
        Course course4 = new Course("CS104","Data Science",90,35);
        Course course5 = new Course("CS105","Data Structures and Algorithms",90,35);
        Course course6 = new Course("CS106","Web development",90,35);

        List<Course> room101Courses = new ArrayList<>();
        room101Courses.add(course);
        room101Courses.add(course1);

        List<Course> room102Courses = new ArrayList<>();
        room102Courses.add(course2);
        room102Courses.add(course3);

        List<Course> room103Courses = new ArrayList<>();
        room103Courses.add(course4);
        room103Courses.add(course5);

        List<Course> room104Courses = new ArrayList<>();
        room104Courses.add(course6);


        ClassRoom room1 = new ClassRoom(101,1,30,room101Courses);
        ClassRoom room2 = new ClassRoom(102,2,90,room102Courses);

        ClassRoom room3 = new ClassRoom(103, 2, 100, room103Courses);
        ClassRoom room4 = new ClassRoom(104, 2, 200, room104Courses);

        Office office = new Office(10, employee, 105);
        Office office1 = new Office(20, employee1, 106);

        List<Room> building1Rooms = new ArrayList<>();
        List<Room> building2Rooms = new ArrayList<>();

        building1Rooms.add(room1);
        building1Rooms.add(room2);
        building1Rooms.add(office);

        building2Rooms.add(room3);
        building2Rooms.add(room4);
        building2Rooms.add(office1);



        Building building1 = new Building(1,"1 sem CS Block",3, building1Rooms);
        Building building2 = new Building(2,"2 sem CS Block", 4, building2Rooms);

        List<Building> campusBuildings = new ArrayList<>();
        campusBuildings.add(building1);
        campusBuildings.add(building2);

        Campus campus = new Campus("11345","Mersit","","", campusBuildings);

        for(Building building : campusBuildings){
            System.out.println("");
            System.out.println(building.getName());
            System.out.println("------------------");
            System.out.println("Rooms  ");
            System.out.println("-------");
            for(Room room : building.getRooms()){
                if(room instanceof ClassRoom){
                    ClassRoom classRoom = (ClassRoom) room;
                    System.out.print("Courses in "+classRoom.roomNo()+" : ");
                    for(Course course7 : classRoom.getCourses()){
                        System.out.print(course7.getCourseName()+", ");
                    }
                    System.out.println("");
                } else {
                    Office office2 = (Office) room;
                    System.out.println("Office RoomNo "+office2.roomNo() +" Employee Name : "+ office2.getEmployeeName());
                }
            }
        }






    }
}