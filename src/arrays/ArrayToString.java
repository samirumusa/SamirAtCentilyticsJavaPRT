package arrays;

import java.util.Arrays;

public class ArrayToString {

    /*
    *  converts array to a string
    * */

    public void arrayToString(int[] set){

        System.out.println(Arrays.toString(set));
    }

    /*
    *  convert multi-dimensional array to string
    * */
    public void jaggedArrayToString(int[][] set){

        System.out.println(Arrays.deepToString(set));
    }
}
