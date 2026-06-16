

public class kadane {

    public static void maxSumKadane(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<num.length;i++){
            currSum = currSum+num[i];
            if(currSum < 0 ){
                currSum =0; 
            }
             maxSum = Math.max(currSum,maxSum);
        }
       
        System.out.println("the max is  : " + maxSum);
    }

public static void minSum(int arr[]) {
    int currSum = 0;
    int minSum = Integer.MAX_VALUE;

    for(int i = 0; i < arr.length; i++) {
        currSum += arr[i];

        minSum = Math.min(minSum, currSum);

        if(currSum > 0) {
            currSum = 0;
        }
    }

    System.out.println("Minimum subarray sum: " + minSum);
}

    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[]= {-2,-4,-5,-6};
        
        maxSumKadane(num);
        minSum(arr);

        }
    }
    
