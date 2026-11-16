public class GroceryProduct extends Product {
    public GroceryProduct(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 5 / 100;
    }
}
