import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SneakerFilter {
    public static List<Product> filter(List<Product> products, Predicate<Product> condition) {
        return products.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}

