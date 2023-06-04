public class Bean {
    public static void main(String[] args) {
        // Create a new instance of the Product class
        Product product = new Product();

        // Set the id, name, and price of the product
        product.setId(1);
        product.setName("The last Ronin");
        product.setPrice(25);

        // Print the id, name, and price of the product
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
    }
}

