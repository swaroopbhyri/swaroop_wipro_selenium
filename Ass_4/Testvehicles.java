package Ass_4;

public class Testvehicles {

    // Static method to test polymorphism
    public static void startVehicle(vehicless v) {
        v.start(); // Calls overridden version based on object type
    }

    public static void main(String[] args) {
    	vehicless car = new caruu();
    	vehicless bike = new bikeuuu();
    	vehicless truck = new truckuu();

        startVehicle(car);
        startVehicle(bike);
        startVehicle(truck);
    }
}