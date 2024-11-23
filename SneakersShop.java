import java.util.List;
import java.util.Scanner;

public class SneakersShop {
    private final List<Sneaker> sneakers;
    private final Cart cart;

    public SneakersShop(List<Sneaker> sneakers) {
        this.sneakers = sneakers;
        this.cart = new Cart();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            handleMenuChoice(scanner, choice);
        } while (choice != AppConstants.EXIT);
    }

    private void printMenu() {
        System.out.println("Welcome to Sneakers Shop!");
        System.out.println("1. View all sneakers");
        System.out.println("2. Filter sneakers");
        System.out.println("3. Add to cart");
        System.out.println("4. View cart");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void handleMenuChoice(Scanner scanner, int choice) {
        switch (choice) {
            case AppConstants.VIEW_ALL_SNEAKERS -> displaySneakers();
            case AppConstants.FILTER_SNEAKERS -> filterAndDisplaySneakers(scanner);
            case AppConstants.ADD_TO_CART -> addSneakerToCart(scanner);
            case AppConstants.VIEW_CART -> cart.displayCart();
            case AppConstants.EXIT -> System.out.println("Thank you for visiting Sneakers Shop!");
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private void displaySneakers() {
        if (sneakers.isEmpty()) {
            System.out.println("No sneakers available.");
        } else {
            sneakers.forEach(System.out::println);
        }
    }

    private void filterAndDisplaySneakers(Scanner scanner) {
        System.out.print("Enter minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();

        List<Sneaker> filteredSneakers = SneakerFilter.filter(sneakers,
                s -> s.getPrice() >= minPrice && s.getPrice() <= maxPrice);

        if (filteredSneakers.isEmpty()) {
            System.out.println("No sneakers found in the given price range.");
        } else {
            filteredSneakers.forEach(System.out::println);
        }
    }

    private void addSneakerToCart(Scanner scanner) {
        displaySneakers();
        System.out.print("Enter the index of the sneaker to add to cart (1-based): ");
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < sneakers.size()) {
            cart.addSneaker(sneakers.get(index));
            System.out.println("Sneaker added to cart.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
