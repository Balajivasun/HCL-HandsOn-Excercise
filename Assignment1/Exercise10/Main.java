import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productType = sc.nextInt();
        int productId = sc.nextInt();
        String productName = sc.next();
        double price = sc.nextDouble();

        Product product;
        if (productType == 1) {
            product = new ElectronicsProduct(productId, productName, price);
        } else if (productType == 2) {
            product = new ClothingProduct(productId, productName, price);
        } else {
            product = new GroceryProduct(productId, productName, price);
        }

        double discount = product.calculateDiscount();
        double finalPrice = product.getPrice() - discount;

        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final Price: %.2f%n", finalPrice);
        sc.close();
    }
}
