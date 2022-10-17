import arrays.ArrayCRUD;

public class Main {
    public static void main(String[] args) {
        int[] set = new int[]{1,3,4,5,6,3,7};
        int[] set2 = new int[]{8,9,3,10,11};
        int[] set3 = new int[]{3,5,10};
        ArrayCRUD arrC = new ArrayCRUD(set);
        arrC.addManyToArray(set2);
            arrC.removeManyFromArray(set3);


        System.out.println(arrC.arrToString());
    }
}