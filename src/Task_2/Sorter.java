package Task_2;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Sorter implements UpperCaseSorter{

    private List<String> nameList;

    public Sorter(List<String> nameList) {
        this.nameList = nameList;
    }

    @Override
    public List<String> sort() {
        return nameList.stream()
                .map(str -> str.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
