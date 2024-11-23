import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SneakerFilter {
    public static List<Sneaker> filter(List<Sneaker> sneakers, Predicate<Sneaker> condition) {
        return sneakers.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}
