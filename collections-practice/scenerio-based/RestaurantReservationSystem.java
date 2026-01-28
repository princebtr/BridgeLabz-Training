// Problem Statement: Restaurant Table Reservation System
// Scenario:
//  A restaurant allows customers to reserve tables for specific time slots.
// Requirements:
// Use Map<Integer, Table> (tableNumber → Table)
// Store reservations in List<Reservation>
// Prevent double booking using logic + exception
// Throw TableAlreadyReservedException
// Use methods: reserveTable(), cancelReservation(), showAvailableTables()

import java.util.*;

class Table {
    private int tableNumber;
    private int capacity;
    private boolean isReserved;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isReserved = false;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}

class AlreadyBookedException extends Exception {
    public AlreadyBookedException(String message){
        super(message);
    }
}

public class RestaurantReservationSystem {
    private Map<Integer, Table> tables;
    private List<Reservation> reservations;

    public RestaurantReservationSystem() {
        this.tables = new HashMap<>();
        this.reservations = new ArrayList<>();
    }

    public void addTable(int tableNumber, int capacity) {
        tables.put(tableNumber, new Table(tableNumber, capacity));
    }

    public void reserveTable(int tableNumber, String customerName) throws AlreadyBookedException {
        Table table = tables.get(tableNumber);
        if (table == null) {
            System.out.println("Table " + tableNumber + " does not exist.");
            return;
        }
        if (table.isReserved()) {
            throw new AlreadyBookedException("Table " + tableNumber + " is already reserved.");
        }
        table.setReserved(true);
        reservations.add(new Reservation(tableNumber, customerName));
        System.out.println("Table " + tableNumber + " reserved for " + customerName + ".");
    }

    public void cancelReservation(int tableNumber) {
        Table table = tables.get(tableNumber);
        if (table == null || !table.isReserved()) {
            System.out.println("No reservation found for table " + tableNumber + ".");
            return;
        }
        table.setReserved(false);
        reservations.removeIf(reservation -> reservation.getTableNumber() == tableNumber);
        System.out.println("Reservation for table " + tableNumber + " has been canceled.");
    }

    public void showAvailableTables() {
        System.out.println("Available Tables:");
        for (Table table : tables.values()) {
            if (!table.isReserved()) {
                System.out.println("Table " + table.getTableNumber() + " (Capacity: " + table.getCapacity() + ")");
            }
        }
    }

}

class Reservation {
    private int tableNumber;
    private String customerName;

    public Reservation(int tableNumber, String customerName) {
        this.tableNumber = tableNumber;
        this.customerName = customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}

class Main {
    public static void main(String[] args) {
        RestaurantReservationSystem system = new RestaurantReservationSystem();
        system.addTable(1, 4);
        system.addTable(2, 2);
        system.addTable(3, 6);

        try {
            system.reserveTable(1, "Alice");
            system.reserveTable(2, "Bob");
            system.reserveTable(1, "Charlie");
        } catch (AlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables();

        system.cancelReservation(1);
        system.showAvailableTables();
    }
}