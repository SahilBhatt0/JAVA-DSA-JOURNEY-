


public class Strings {


    //string palindrome ;
    public static boolean paliString(String str) {
        // String half = String/2;

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    //Shortest path finder for given direction
    public static float shortPath(String path){
        int x = 0 , y=0;

        for(int i=0; i<path.length();i++){

            char dir = path.charAt(i);

            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 =x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    //substring printing in java
    public static String SubString(String str,int si,int ei){
    String subs ="";
        for(int i = si;i<ei;i++){
            subs += str.charAt(i);
        }
        return subs;
    }


    public static void main(String[] args) {
        String str = "Jasontheween";
        System.out.println(str.substring(0,5));//this is a inbuilt function i n java to print the substring 
        // System.out.println(SubString(str, 0, 5));

        // String path = "WNEENESENNN";
        // shortPath(path);
        // System.out.println(shortPath(path));

        // String str = "abcd";
        // String str2 = new String("abcd");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());
        // String str = "racecar";
        // paliString(str);
        
        // System.out.println(paliString(str));
    //     if (paliString(str)) {
    //         System.out.println("is a palindrome");
    //     } else {
    //         System.out.println("not a palindrome");
    //     }
     

      String fruits[] = { "Apple","Banana","Mango" };  

      String largest = fruits[0];
      for(int i =0; i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest =fruits[i];
        }
      }
      System.out.println(largest);
    
}



}
     


