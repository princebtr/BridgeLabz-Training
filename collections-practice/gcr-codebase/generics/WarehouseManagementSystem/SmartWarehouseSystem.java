package WarehouseManagementSystem;

public class SmartWarehouseSystem {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("E101", "Laptop"));
        electronicsStorage.addItem(new Electronics("E102", "Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("G201", "Rice"));
        groceriesStorage.addItem(new Groceries("G202", "Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("F301", "Chair"));
        furnitureStorage.addItem(new Furniture("F302", "Table"));

        System.out.println("Electronics Items:");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());
 
        System.out.println("\nGroceries Items:");
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture Items:");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}
   