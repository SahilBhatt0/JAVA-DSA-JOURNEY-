import java.util.*;

public class cwmw {

    public static int storeWater(ArrayList<Integer> height){
    //    int maxWater = Integer.MIN_VALUE;

    //    for(int i = 0; i<height.size();i++){
    //     for(int j =i+1;j<height.size();j++){
    //         int hgt = Math.min(height.get(i),height.get(j));
    //         int width = j-i;
    //         int water = hgt*width;
    //         maxWater = Math.max(maxWater,water);
        
    //     }
    // }
    //     return maxWater;
    // }

//2 Pointer Approach
    
    int LP = 0;
    int RP = height.size()-1;
    int maxWater = 0;
    
    while(LP<RP){
    int hgt =  Math.min(height.get(LP),height.get(RP));
    int width = RP - LP;
    int water = hgt*width;
    maxWater = Math.max(water,maxWater);
    if(height.get(LP) < height.get(RP)){
        LP++;
    }
else{
        RP--;
    }
}
return maxWater;
}
public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

    System.out.println(storeWater(height));
    
    }
}
