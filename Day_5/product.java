package Day_5;

public final class product {
    private final String name;
    private final String code;
    private final double price;
    private final String category; 
    private product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category; // optional

        public Builder withName(String name) {
            if (name == null || name.trim().isEmpty()) {
                throw new IllegalArgumentException("Product name cannot be null or empty.");
            }
            this.name = name;
            return this;
        }

        public Builder withCode(String code) {
            if (code == null || code.trim().isEmpty()) {
                throw new IllegalArgumentException("Product code cannot be null or empty.");
            }
            this.code = code;
            return this;
        }

        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
            return this;
        }

        public Builder withCategory(String category) {
       
            if (category != null && category.trim().isEmpty()) {
                throw new IllegalArgumentException("Category cannot be empty string.");
            }
            this.category = category;
            return this;
        }

   
        public product build() {
            if (name == null) {
                throw new IllegalStateException("Product name is required.");
            }
            if (code == null) {
                throw new IllegalStateException("Product code is required.");
            }
            if (price < 0) {
                throw new IllegalStateException("Price cannot be negative.");
            }
            return new product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", category='" + (category != null ? category : "N/A") + '\'' +
                '}';
    }
}


class ProductTest {
    public static void main(String[] args) {
        product laptop = new product.Builder()
                .withName("Laptop")
                .withCode("LP123")
                .withPrice(75000)
                .withCategory("Electronics")
                .build();

        System.out.println(laptop);

    }
}

