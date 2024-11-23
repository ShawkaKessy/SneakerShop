public class Sneaker {
    private final String name;
    private final String brand;
    private final String category;
    private final double price;
    private final int size;
    private final double rating;

    private Sneaker(SneakerBuilder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.category = builder.category;
        this.price = builder.price;
        this.size = builder.size;
        this.rating = builder.rating;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getSize() { return size; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return String.format("%s - $%.2f [%s, %s, Size: %d] (Rating: %.1f)",
                name, price, brand, category, size, rating);
    }

    public static class SneakerBuilder {
        private final String name;
        private final double price;
        private String brand = "Unknown";
        private String category = "General";
        private int size = 0;
        private double rating = 0.0;

        public SneakerBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public SneakerBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public SneakerBuilder category(String category) {
            this.category = category;
            return this;
        }

        public SneakerBuilder size(int size) {
            this.size = size;
            return this;
        }

        public SneakerBuilder rating(double rating) {
            this.rating = rating;
            return this;
        }

        public Sneaker build() {
            return new Sneaker(this);
        }
    }
}
