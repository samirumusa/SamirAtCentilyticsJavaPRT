package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCRUD {
    private int[] set;
    private Integer[] boxedSet;
    private List<Integer> list = new ArrayList<>();

    /*
    *Get the set of data from the constructor
    * */
    public ArrayCRUD(int[] arr){
        this.set = arr;
        this.boxedSet = this.primitiveArrayToBoxed(this.set);
        this.list = new ArrayList<>(Arrays.asList(this.boxedSet));
    }

    /*
    * Add and item to the
    * */
    public void addToArray(int item){

        // convert primitive to a boxed and then change the array to a list
        //List<Integer> list = new ArrayList<>(Arrays.asList(this.boxedSet));
        this.list.add(item);
        this.set = this.listToPrimitiveArray(this.list);
    }
    public void addManyToArray(int[] set){
        // convert primitive to a boxed and then change the array to a list
        //List<Integer> list = new ArrayList<>(Arrays.asList(this.boxedSet));
        //List<Integer> list2 = new ArrayList<>(Arrays.asList(this.primitiveArrayToBoxed(set)));
        //list.addAll(list2);
        //Arrays.stream(set).map(item->list.add(item));
        for(int item:set){
            this.list.add(item);
        }
        this.set = this.listToPrimitiveArray(this.list);
    }
    public  void removeFromArray(int index){

        //convert the primitive to a boxed type and then convert the boxed set to a list
        //delete item
        this.list.remove(index);

        //convert the boxed to a primitive type and the set to the original set
        this.set = this.listToPrimitiveArray(this.list);
    }
    public void updateFirst(int item, int target){
        // convert primitive to a boxed and then change the array to a list
        //update the list with the data
        for(int i=0; i<this.list.size(); i++) {
            if(list.get(i)==item) {
                Integer val = (Integer) target;
                list.set(i,val);
                break;
            }
        }
        //convert the list to an array
        this.set = this.listToPrimitiveArray(this.list);
}

    public int[] updateLast(int item, int target){
        // convert primitive to a boxed and then change the array to a list
        //update the list with the data
        for(int i=this.list.size()-1; i>=0; i--) {
            if(this.list.get(i)==item) {
                Integer val = (Integer) target;
                this.list.set(i,val);
                break;
            }
        }
        //convert the list to an array
        return this.set = this.listToPrimitiveArray(this.list);

    }
    public int[] updateAll(int item,int target){
        // convert primitive to a boxed and then change the array to a list

        //update the list with the data
        for(int i=0; i<this.list.size(); i++) {
            if(this.list.get(i)==item) {
                Integer val = (Integer) target;
                this.list.set(i,val);
            }
        }
        //convert the list to an array
        return this.set = this.listToPrimitiveArray(this.list);
    }

    /*
    * use binary search in sorted array
    * */
    public int findInSortedArray(int item){
        int isPresent = Arrays.binarySearch(this.set,item);
        if(isPresent < 1){
            return -1;
        }
        return isPresent;
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
             this.list.removeIf(val -> val ==item);
           }
         //convert the filtered list to a primitive type array
         return this.set = this.listToPrimitiveArray(this.list);
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
    public String arrToString(){
        return  Arrays.toString(this.set);
    }

    /*
    *
    * issues:
    * 1. addToArray not adding more than one item per instance
    * */
}
