import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Any", "Artur", "Nadin", "Ilya");
        strings.stream().sorted((s1, s2) -> s1.length() - s2.length()).peek(System.out::println);




    }
}
