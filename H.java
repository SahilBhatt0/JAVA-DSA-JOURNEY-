// import java.util.*;
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

// public class loop{
//     public static void main(String[] args) {

//         int count = 0;

//         while(count < 10)
//         {
//             System.out.println("Hello World");
//             count++;
//         }
//     }
// }

//  import java.util.*;

// public class sum{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Number : ");
//         int num = sc.nextInt();

//         int i=1;
//         int sum = 0;

//         while(i<=num){
//             sum+=i;
//             i++;
//         }
//         System.out.println("The sum of first N natural number is : " + sum);
//     }
// }

// public class pattern{
//     public static void main(String[] args) {

//         for (int i =1; i<=4;i++) {
//             System.out.println("****");
//         }
//     }
// }

// public class reverse{
//     public static void main(String[] args) {

//         int n = 23413;

//         while ( n > 0 ){
//             int newDigit = n % 10;
//             System.out.print(newDigit);
//             n= n/10;
//         }
//     }
// }

// public class reverse{
//     public static void main(String[] args) {

//         int n = 78931;

//         int rev = 0;

//         while (n > 0){
//             int lastDigit = n %10;
//             rev = (rev*10)+lastDigit;
//             n = n/10;

//             System.out.print(rev);
//         }

//     }

// }

// public class star {
//     public static void main(String[] args) {

//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {

//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class num {
//     public static void main(String[] args) {
//         int n = 5;
//         char ch = 'A';

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }

//     }
// }

public class H {
    // public static void hollow(int totRow, int totCol){

    // for ( int i = 1 ; i <= totRow; i++){
    // for ( int j = 1 ; j <= totCol; j++){
    // if(i==1||i==totRow || j ==1 || j==totCol){
    // System.out.print("*");
    // }else{
    // System.out.print(" ");
    // }
    // }
    // System.out.println();

    // }
    // }

    // public static void main(String[] args) {
    // hollow(4, 8);
    // }

    // public static void Cutie (int n){
    // int counter = 1;
    // for(int i =1 ; i<=n;i++){
    // for(int j = 1 ; j<=i;j++){
    // System.out.print(counter+" ");
    // counter++;
    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // Cutie(5);
    // }

    // public static void bb(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {

    // if ((i + j) % 2 == 0) {
    // System.out.print('1');
    // } else {
    // System.out.print('0');
    // }

    // }
    // System.out.println();
    // }

    // }

    // public static void main(String[] args) {
    // bb(5);
    // }

    public static void butterfly(int n) {

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
       

    }

    public static void main(String[] args) {
        butterfly(4);
    }

}
