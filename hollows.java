
// public class New {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//     int A = sc.nextInt();
//     int B = sc.nextInt();
//     int C = sc.nextInt();

//     System.out.println(A+B+C/3);

//     } 
// }

// import java.util.*;

// public class area{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int side = sc.nextInt();

//         System.out.println(side*side);

//     }
// }

// import java.util.*;

// public class bill{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float eraser = sc.nextFloat();

//         float sum  = (pencil + pen + eraser);

//         float newSum = (sum + (sum*0.18f));

//         System.out.println("The bill is : "+sum);

//         System.out.println("The New bill is : "+newSum);

//     }
// }

// import java.util.*;
// public class evenOdd {

//     public static void main (String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         if(number%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }

// }

// public class fever{

//     public static void main(String[] args) {

//            double temp  = 103.5;

//            if(temp > 100){
//             System.out.println("You have fever");
//            }
//            else{
//             System.out.println("You don't have fever");
//            }
//     }
// }

// public class prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number : ");
//         int num = sc.nextInt();

//         if (num == 2) {
//             System.out.println("Number is Prime");
//         } else {
//             boolean isPrime =true;
//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                 }
//             }

//             if(isPrime == true ){
//                 System.out.println("The number is Prime : ");
//             }
//             else{
//                 System.out.println("The number is not prime : ");
//             }

//         }
//     }

// }

// public class product {
//     public static int pro (int a , int b){
//         int multi= a*b;
//         return multi;

//     }
//     public static void main(String[] args) {

//         int prod = pro(3,4);
//         System.out.println("The product is : "+prod);

//     }
// }

// public class avg {
//     public static int aot(int a, int b, int c) {
//         int ans = (a + b + c) / 3;
//         return ans;

//     }

//     public static void main(String[] args) {
//        int finale  = aot(3,5,7);

//         System.out.println("The avg of three number is : "+finale );
//     }
// }

// public class check{
//     public static boolean  isEven(int a){

//         if(a%2==0){
//             return true;
//         }
//         else{
//         return false;

//         }
// }
// public static void main(String[] args) {
//     boolean checks =  isEven(3);
//     System.out.println(checks);
// }
// }

// public class pali{
//     public static int isPali(int n){

//     }

//     public static void main(String[] args) {
//         int result = isPali(121);
//     }
// }

public class hollows {
public static void hollow(int totRow, int totCol){

    for ( int i = 1 ; i <= totRow; i++){
        for ( int j = 1 ; j <= totCol; j++){
            if(i==1||i==totRow || j ==1 || j==totCol){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            
        }
        System.out.println();

    }
}

    public static void main(String[] args) {
        hollow(4, 8);
    }
}
