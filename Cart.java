import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Sneaker> sneakers = new ArrayList<>();

    public void addSneaker(Sneaker sneaker) {
        sneakers.add(sneaker);
    }

    public List<Sneaker> getSneakers() {
        return sneakers;
    }

    public void displayCart() {
        if (sneakers.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            sneakers.forEach(System.out::println);
        }
    }
}
