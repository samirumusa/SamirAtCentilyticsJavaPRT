package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCRUD {
    private int[] set;
    private Integer[] boxedSet;

    /*
    *Get the set of data from the constructor
    * */
    public ArrayCRUD(int[] arr){
        this.set = arr;
        this.boxedSet = this.primitiveArrayToBoxed(this.set);
    }

    /*
    * Add and item to the
    * */
    public void addToArray(int item){

        Arrays.fill(this.set,item);
    }
    public  void removeFromArray(int item){

        //convert the primitive to a boxed type and then convert the boxed set to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(this.primitiveArrayToBoxed(this.set)));

        //delete item
        list.remove(item);

        //convert the boxed to a primitive type and the set to the original set
        this.set = this.listToPrimitiveArray(list);
    }
    public int[] updateFirst(int item){
        // convert primitive to a boxed and then change the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(this.boxedSet));
        //update the list with the data
        for(int i=0; i<list.size(); i++) {
            if(list.get(i)==item) {
                Integer val = (Integer) item;
                list.set(i,val);
                break;
            }
        }
        //convert the list to an array
        return this.set = this.listToPrimitiveArray(list);
}

    public int[] updateLast(int item){
        // convert primitive to a boxed and then change the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(this.boxedSet));
        //update the list with the data
        for(int i=list.size()-1; i>=0; i--) {
            if(list.get(i)==item) {
                Integer val = (Integer) item;
                list.set(i,val);
                break;
            }
        }
        //convert the list to an array
        return this.set = this.listToPrimitiveArray(list);

    }
    public int[] updateAll(int item){
        // convert primitive to a boxed and then change the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(this.boxedSet));
        //update the list with the data
        for(int i=0; i<list.size(); i++) {
            if(list.get(i)==item) {
                Integer val = (Integer) item;
                list.set(i,val);
            }
        }
        //convert the list to an array
        return this.set = this.listToPrimitiveArray(list);
    }


    public void findInArray(){

    }

    public void addManyToArray(int[] set){



    }
    /*
    * remove many items from a list
    * */
    public  int[] removeManyFromArray(int[] set){
        //convert the primitive array to list
        List<Integer> list = new ArrayList<>(Arrays.asList(primitiveArrayToBoxed(this.set)));
        //create a new list of filtered set
        for(int i =0; i <set.length; i++){
             int item = set[i];
             list.removeIf(val -> val ==item);
           }
         //convert the filtered list to a primitive type array
         return this.set = this.listToPrimitiveArray(list);
        }

    /*
    * convert primitive typed Array to boxed typed array
    * */
    public Integer[] primitiveArrayToBoxed(int[] set){
        Integer[] boxedSet = new Integer[this.set.length];
        for(int i=0; i<this.set.length; i++){
            boxedSet[i] = this.set[i];
        }
        return boxedSet;
    }
    /*
    *convert list to array of type primitive
    * */
    public int[] listToPrimitiveArray(List list){

        int[] newSet = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            newSet[i] = (int) list.get(i);
        }
        return newSet;
    }
}
