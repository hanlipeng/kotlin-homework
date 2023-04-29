import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HomeWork2Java2Kotlin {

    public String processString(String str) {
        return Optional.ofNullable(str)
                .filter(it -> it.length() > 10)
                .map(it -> "value is" + it)
                .orElse("default value");
    }

    public String joinListStr(List<String> arr) {
        return arr.stream()
                .map(String::chars)
                .flatMap(it -> it.mapToObj(i -> (char) i))
                .map(it -> "value is " + it)
                .collect(Collectors.joining(";"));
    }

    public Collection<List<String>> groupString(List<String> arr) {
        return arr.stream()
                .filter(it -> it.length() > 10)
                .collect(Collectors.groupingBy(it -> it.substring(0, 5)))
                .values();
    }

}
