public class sum{


public static void maxSubSum(int num[]){
    int currSum = 0;
    int maxSum =Integer.MIN_VALUE;

    for (int i =0;i<num.length;i++){
        // int start = i;
        for(int j = i ; j < num.length;j++){
            // int end = j ;
            currSum=0;
            for( int k =i;k<=j;k++){
                currSum+=num[k];
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        
    }
    System.out.println( "Max sum is :"+maxSum);

}

public static void main(String[] args) {
    int num[] = {2,1,-4,3,-1};
    maxSubSum(num);
}
}