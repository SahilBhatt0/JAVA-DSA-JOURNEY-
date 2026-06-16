
public class Array {

  // public static void rryFun(int marks[]) {
  // for( int i = 0; i < marks.length;i++){
  // marks[i]=marks[i]+5;
  // }
  // }
  // public static void main(String[] args) {

  // int marks[] = {34,55,36,66};
  // rryFun(marks);
  // for(int i = 0 ; i < marks.length;i++){
  // System.out.println(marks[i]);
  // }
  // }

  // public static int linearSearch(int Array[],int key){

  // for( int i = 0; i < Array.length;i++){
  // if(Array[i]==key){
  // return i;
  // }
  // }
  // return -1;
  // }
  // public static void main(String[] args) {
  // int Array []= {3,5,1,6,7};

  // int key = 1;

  // int index = linearSearch(Array, key);

  // if(index == -1){
  // System.out.print("Not Found");
  // }
  // else{
  // System.out.print("The Index is : "+ index);
  // }
  // }

  // public static int largestIn(int Numbers[]){
  // // we can use int Largest = integer.MIN_VALUE;
  // // if ( number>largest ){number[i]=largest }

  // int max = Numbers[0];
  // for( int i =0;i<Numbers.length;i++){
  // if(Numbers[i] > max){
  // max = Numbers[i];

  // }
  // }
  // return max;
  // }
  // public static void main(String[] args) {
  // int Numbers[]= {4,5,2,8,9};

  // int result = largestIn(Numbers);

  // System.out.println("The Largest Number Is : " + result);
  // }

  public static void reverseArray(int number[]) {
    int start = 0;
    int end = number.length - 1;

    while (start < end) {

      int temp = number[start];
      number[start] = number[end];
      number[end] = temp;

      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int number[]={10,9,8,7,6,5};

    reverseArray(number);

    for (int i = 0; i <  number.length; i++) {
      System.out.print(number[i]+ "  ");
        
    }
  }
}
