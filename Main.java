import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sneaker> sneakers = initializeSneakers();
        SneakersShop shop = new SneakersShop(sneakers);
        shop.start();
    }

    private static List<Sneaker> initializeSneakers() {
        List<Sneaker> sneakers = new ArrayList<>();
        sneakers.add(new Sneaker.SneakerBuilder("Air Max", 120.00)
                .brand("Nike")
                .category("Casual")
                .size(42)
                .rating(4.5)
                .build());
        sneakers.add(new Sneaker.SneakerBuilder("UltraBoost", 150.00)
                .brand("Adidas")
                .category("Running")
                .size(43)
                .rating(4.8)
                .build());
        sneakers.add(new Sneaker.SneakerBuilder("Chuck Taylor", 60.00)
                .brand("Converse")
                .category("Casual")
                .size(41)
                .rating(4.3)
                .build());
        sneakers.add(new Sneaker.SneakerBuilder("Gel-Kayano", 130.00)
                .brand("Asics")
                .category("Running")
                .size(42)
                .rating(4.6)
                .build());
        sneakers.add(new Sneaker.SneakerBuilder("Pegasus", 150.00)
                .brand("Nike")
                .category("Running")
                .size(43)
                .rating(4.7)
                .build());
        sneakers.add(new Sneaker.SneakerBuilder("3", 180.00)
                .brand("Jordan")
                .category("Basketball")
                .size(41)
                .rating(5.0)
                .build());
        return sneakers;
    }
}
