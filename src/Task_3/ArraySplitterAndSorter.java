package Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySplitterAndSorter {
    private List<String> intList;

    public ArraySplitterAndSorter(List<String> intList) {
        this.intList = intList;
    }

    public String splitAndSort(){
        return intList.stream()
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
