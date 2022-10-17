package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IteratingOverArrays {
    private int[] set;
    public  IteratingOverArrays(int[] set){
        this.set = set;
    }
    public void normalForLoop (){
        for(int i=0; i<this.set.length; i++) {
            System.out.println(this.set[i]);
        }
    }

    public void shortenedForLoop(){
        for(int i:this.set){
            System.out.println(i);
        }
    }
    public void jaggedShortenedForLoop(int[][] JaggedSet){
        for(int[] val : JaggedSet){
            for(int i : val){
                System.out.println(i);
            }
        }
    }
    public  void jaggedForLoop(int[][] jaggedSet){
        int m = jaggedSet[0].length;
        int n = jaggedSet.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(jaggedSet[i][j]);
            }
        }
    }
    public IntStream streamMap(){
        return Arrays.stream(this.set).map(item-> {
            return item;});
    }
}
