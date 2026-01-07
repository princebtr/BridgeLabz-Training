//Problem Statement: Cab Booking / Ride Management System : Key Features (CRUD)
//Real Scenario
//Users book rides, drivers accept, and fare is calculated.Key Features
//Ride booking
//Driver assignment
//Fare calculation
//Ride history
//Concepts Used
//OOP: User, Driver, Ride
//Interface: FareCalculator
//Polymorphism: Peak vs normal pricing
//Exception Handling: NoDriverAvailableException.

package oops;
import java.util.*;

interface FareCalculator {
    double calculateFare(int distance);
}

class NormalFare implements FareCalculator {
    public double calculateFare(int distance) {
        return distance * 10;
    }
}

class PeakFare implements FareCalculator {
    public double calculateFare(int distance) {
        return distance * 15;
    }
}

class User {
    int userId;
    String name;
    List<String> rideHistory = new ArrayList<>();

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void bookRide(String pickUp, String drop, int distance) {
        String ride = "From " + pickUp + " To " + drop + " Distance: " + distance + " km";
        rideHistory.add(ride);
        System.out.println("Ride Booked Successfully!");
    }

    void viewRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No rides taken yet.");
            return;
        }
        for (String ride : rideHistory) {
            System.out.println(ride);
        }
    }
}

class Driver {
    String driverName;
    boolean available;

    Driver(String driverName, boolean available) {
        this.driverName = driverName;
        this.available = available;
    }

    void acceptRide() {
        System.out.println(driverName + " accepted the ride.");
        available = false;
    }
}

class Ride {
    String pickUp;
    String drop;
    int distance;
    boolean peak;

    Ride(String pickUp, String drop, int distance, boolean peak) {
        this.pickUp = pickUp;
        this.drop = drop;
        this.distance = distance;
        this.peak = peak;
    }
}

class CabBookingApp {
    public static void main(String[] args) {

        User user = new User(101, "Prince");

        Driver driver = new Driver("Rahul", true);

        Ride ride = new Ride("Delhi", "Noida", 20, true);
        
        driver.acceptRide();

        FareCalculator fareCalculator;
        if (ride.peak) {
            fareCalculator = new PeakFare();
        } else {
            fareCalculator = new NormalFare();
        }

        double fare = fareCalculator.calculateFare(ride.distance);
        user.bookRide(ride.pickUp, ride.drop, ride.distance);

        System.out.println("Total Fare: ₹" + fare);
        user.viewRideHistory();
    }
}
