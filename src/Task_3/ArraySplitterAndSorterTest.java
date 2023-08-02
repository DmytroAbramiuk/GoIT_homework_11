package Task_3;

import java.util.List;

public class ArraySplitterAndSorterTest {
    public static void main(String[] args) {
        List<String> intList = List.of("7, 5, 3, 1", "2, 8, 4, 10, 6, 9", "221, 84, 42, 121, 612, -15");
        ArraySplitterAndSorter test = new ArraySplitterAndSorter(intList);
        System.out.println("test.splitAndSort() = " + test.splitAndSort());
    }
}
