import java.util.ArrayList;

public class pairSum {

    public static boolean sumPair(ArrayList<Integer> pairList, int key) {

    //     for (int i = 0; i < pairList.size(); i++) {
    //         for (int j = i + 1; j < pairList.size(); j++) {
    //             if (pairList.get(i) + pairList.get(j) == key) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //two pointer approach

    int lp = 0;
    int rp = pairList.size()-1;

    while(lp < rp){
        if(pairList.get(lp)+pairList.get(rp)==key){
            return true;
        }
        else if(pairList.get(lp)+pairList.get(rp) < key){
            lp++;
        }
        else if(pairList.get(lp)+pairList.get(rp) > key){
            rp--;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> pairList = new ArrayList<>();
        pairList.add(1);
        pairList.add(2);
        pairList.add(3);
        pairList.add(4);
        pairList.add(5);
        int key = 5;

        System.out.println(sumPair(pairList, key));

    }
}

