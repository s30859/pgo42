public class Product {

    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }

    public void changePrice(double newPrice) {
        if (newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces >= 0) {
            this.numberOfPieces = numberOfPieces;
        } else {
            System.out.println("Error: Number of pieces cannot be negative.");
        }
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
    public static void main(String[] args) {
        Product product1 = new Product("T-Shirt", 19.99, "TSHIRT120");
        Product product2 = new Product("Book", 24.50, "BOOK456", 3);

        product1.changePrice(22.50);
        product2.setNumberOfPieces(10);

        System.out.println("Product 1: " + product1.getName() + " (" + product1.getPrice() + ")");
        System.out.println("Product 2: " + product2.getName() + " (" + product2.getNumberOfPieces() + " pieces)");
    }
}
