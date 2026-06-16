
import java.util.ArrayList;

public class multiDimentionalAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        ArrayList<Integer> arr2 = new ArrayList<>();

        arr2.add(6);
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arr2.add(10);

        mainList.add(arr1);
        mainList.add(arr2);


        for(int i =0 ; i <mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0;j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");

            }
            System.out.println(" ");
        }
        System.out.println(mainList);

    }
    
}
