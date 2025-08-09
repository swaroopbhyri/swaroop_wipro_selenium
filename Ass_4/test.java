package Ass_4;

class Vehicle {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

class Four_wheeler extends Vehicle {
    void wheels() {
        System.out.println("This is a Four Wheeler");
    }
}


class Petrol_Four_Wheeler extends Four_wheeler {
    void fuelType() {
        System.out.println("Fuel type: Petrol");
    }
}


class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler {
    void seatingCapacity() {
        System.out.println("Seating Capacity: 5");
    }
}


class Baleno_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
    void model() {
        System.out.println("Model: Baleno");
    }
}

// Main class to test
public class test {
    public static void main(String[] args) {
        Baleno_Four_Wheeler car = new Baleno_Four_Wheeler();

        car.vehicleType();
        car.wheels();
        car.fuelType();
        car.seatingCapacity();
        car.model();
    }
}