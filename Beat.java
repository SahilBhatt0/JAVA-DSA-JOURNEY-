public class Beat{
// public static void pairArray(int num[]){

//    for(int i = 0 ; i < num.length;i++){
//     for(int j = i+1;j<num.length;j++){
//         System.out.print("("+ (num[i]+","+num[j])+ ")");
//     }
//     System.out.println( );
//    }
// }

// public static void main(String[] args) {
//     int num[]= {2,3,4,5,6};
//     pairArray(num);
// }

public static void subArray(int num[]){

for(int i =0 ; i <num.length ; i++){
    for(int j=i ; j < num.length ; j++){
        for(int k =num[i] ; k< num[j] ; k++){
            System.out.print(k + " ");
        }
        System.out.println();
    }
    System.out.println();
}
}

public static void main(String[] args) {
    int num[]={2,3,4,5,6};
    subArray(num);
}
}