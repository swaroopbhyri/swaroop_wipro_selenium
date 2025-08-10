package day11;
import java.sql.*;
import java.util.*;


class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {

        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

public class productsort {
    private static final String URL = "jdbc:mysql://localhost:3306/dbb";
    private static final String USER = "root";
    private static final String PASSWORD = "Swaroop@2706";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL to fetch products
            String sql = "SELECT * FROM products";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Store data in Product list
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                products.add(new Product(id, name, price));
            }

            // Sort using Comparable
            Collections.sort(products);

            // Print sorted products
            for (Product p : products) {
                System.out.println(p);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
