import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    /*
        Utworzyć strukturę, która pozwala przechować imię
        oraz wiek osoby. Następnie przygotować kolekcję elementów
        bez powtórzeń, która przechowa obiekty takiej struktury.
    */
    public static void main(String[] args) {
        var people = new HashSet<>(List.of(
                new Person("ADAM", 10),
                new Person("ADAM", 10)
        ));
        System.out.println(people);
    }
}
