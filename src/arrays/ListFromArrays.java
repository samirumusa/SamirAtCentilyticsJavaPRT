package arrays;

public class ListFromArrays {

    private int[][] jaggedSet;
    private int target;
    public ListFromArrays(int[][] jaggedSet,int target){
        this.jaggedSet =jaggedSet;
        this.target =target;
    }
    public  void jaggedForLoop(){
        int m = this.jaggedSet[0].length;
        int n = this.jaggedSet.length;
        boolean state = false;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int item = this.jaggedSet[i][j];
                if(item == this.target){
                    state = true;
                }
            }
        }
    }
}
