package WarehouseManagementSystem;

class Furniture extends WarehouseItem {
    public Furniture(String itemId, String name) {
        super(itemId, name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
  