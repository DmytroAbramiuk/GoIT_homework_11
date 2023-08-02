package Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_5 {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 8);
        Stream<Integer> secondStream = Stream.of(4, 5, 6, 7);

        StreamZipper.zip(firstStream, secondStream)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}

