package ch06.principle;

import org.junit.Test;

public class single2 {
    @Test
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("摩托车!");
        vehicle.run("汽车!");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
//方法二遵守单一原则
//但浪费资源

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行！");
    }
}
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空上运行！");
    }
}