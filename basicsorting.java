import java.util.Arrays;
import java.util.Collections;
public class basicsorting {
    public static void  selectionSort(int num[]){
        for(int i = 0 ; i <num.length-1;i++){
            int minPos = i;
            for( int j = i+1 ; j < num.length;j++){
                 if(num[minPos]>num[j]){
                    minPos= j;
                 }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }
    public static void bubbbleSort(int num[]) {

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                int temp = 0;
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static void inseSort(int num[]){
        for(int i = 1; i<num.length;i++){
            int curr = num[i];
            int prev = i-1;
            while(prev >= 0 && num[prev] > curr){
                num[prev+1] =num[prev] ;
                prev--;
            }
            num[prev+1] = curr;
        }
    }

    public static void countSort(int num[]){
        int maxNum = Integer.MAX_VALUE;






    }




    public static void printSort(Integer num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer num[] = { 4, 3, 5, 2, 1 };
        // inseSort(num);
        Arrays.sort(num , Collections.reverseOrder());
        printSort(num);
    }
}
