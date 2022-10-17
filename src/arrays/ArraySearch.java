package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySearch {

    private int[] set;
    public  ArraySearch(int[] set){
        this.set = set;
    }
    public int normalForLoop (int item){
        int index =-1;
        for(int i=0; i<this.set.length; i++) {
             if(this.set[i]==item){
                 index=i;
                 break;
             }
            }
        return index;
        }

    public boolean shortenedForLoop(int item){
        boolean state= false;
        for(int i:this.set){
            if(i ==item){
                state=true;
            }
        }
        return state;
    }
   public boolean jaggedShortenedForLoop(int[][] JaggedSet,int target){
        boolean state= false;
        for(int[] val : JaggedSet){
            for(int i : val){
                if(i ==target){
                    state=true;
                }
            }
        }
       return state;
   }
   public  void jaggedForLoop(int[][] jaggedSet, int target){
        int m = jaggedSet[0].length;
        int n = jaggedSet.length;
        boolean state = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int item = jaggedSet[i][j];
                if(item == target){
                    state = true;
                }
            }
        }
   }
   public IntStream streamMap(){
       return Arrays.stream(this.set).map(item-> {
           return item;});
   }
   public void jaggedBinarySearch(){

   }
}
