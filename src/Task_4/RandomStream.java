package Task_4;

import java.util.stream.Collectors;

public class RandomStream {
    public static void main(String[] args) {
        Random random = new Random(25214903917L, 11, 2^48);
        random.createLoopStream().peek(System.out::println).collect(Collectors.toList());
    }
}
