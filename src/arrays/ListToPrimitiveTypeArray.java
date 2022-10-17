package arrays;

import java.util.List;

public class ListToPrimitiveTypeArray {

    private List<Integer> set;

    public ListToPrimitiveTypeArray(List set){
        this.set=set;
    }
    public int[] toPrimitiveArray(){
        int[] newSet = new int[this.set.size()];
        for(int i=0; i<this.set.size(); i++){
            newSet[i] = (int) this.set.get(i);
        }
        return newSet;
    }
}
