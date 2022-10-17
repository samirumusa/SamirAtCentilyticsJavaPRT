package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayToStream {

    private int[] set;

    public ArrayToStream(int[] set){
        this.set=set;
    }

    public IntStream toStream() {
        return Arrays.stream(this.set);
    }
}
