import java.util.ArrayList;
import java.util.Collections;

public class listArray{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get element
        int Element = list.get(2);
        System.out.println(Element);

        //remove element 
        list.remove(2);
        System.out.println(list);
        
        //set element at index
        list.set(2, 10);
        System.out.println(list);

        //contain element
        System.out.println(list.contains(10));
        System.out.println(list.contains(22));

        //reversing a list 
        for(int i = list.size()-1;i >=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();


   //max element in array list

    int max =Integer.MIN_VALUE;
     
    for(int i =0;i<list.size();i++){
        if(list.get(i) > max){
            max =list.get(i);
        }
        System.out.print(max+ " ");
    } 
    System.out.println();

    //Sorting an ArrayList 
        Collections.sort(list);//Sorts in ascending order
        System.out.println(list);


        Collections.sort(list , Collections.reverseOrder());//Sorts in descending order
        System.out.println(list);
        
    }
}
