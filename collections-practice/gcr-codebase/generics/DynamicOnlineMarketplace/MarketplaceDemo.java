package DynamicOnlineMarketplace;

public class MarketplaceDemo {
    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 599.0, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("Cotton Shirt", 1299.0, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 19999.0, new GadgetCategory());

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.showCatalog();

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.showCatalog();
    }
}
