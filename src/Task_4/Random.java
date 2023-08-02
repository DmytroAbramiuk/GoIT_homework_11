package Task_4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Random {
    private long a, c, m;
    private long x;

    public Random(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.x = c;
    }

    private Long nextInt() {
        return  ((a * (x++) + c) % m);
    }

    public Stream<Long> createLoopStream(){
        return Stream.iterate(x, seed -> nextInt());
    }
}
