package ch06.principle;

public class single {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车!");
        vehicle.run("汽车!");
        vehicle.run("飞机!");
    }
}
//方法一中违反了单一原则

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行！");
    }
}