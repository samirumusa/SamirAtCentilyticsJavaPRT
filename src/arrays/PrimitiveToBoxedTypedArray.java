package arrays;

import java.util.List;

public class PrimitiveToBoxedTypedArray {

    private int[] set;

    public PrimitiveToBoxedTypedArray(int[] set){
        this.set=set;
    }

    public Integer[] toBoxedTypedArray(){
        Integer[] boxedSet = new Integer[this.set.length];
        for(int i=0; i<this.set.length; i++){
            boxedSet[i] = this.set[i];
        }
        return boxedSet;
    }
}
