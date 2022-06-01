import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String str = "Артур = 25, бывало Антон = 31, иногда Леха = 43.";
        Pattern pattern = Pattern.compile("[А-Я].+?\\d{1,2}");
        Matcher matcher = pattern.matcher(str);

        List<String> strings = matcher.results()
                .map(MatchResult::group)

                .toList();
        strings.forEach(System.out::println);

        System.out.println("Количество совпадений: " + matcher.reset().results().count());




        System.out.println(RegularExpression.class.getResource("Text"));
    }
}
