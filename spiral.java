

public class spiral {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int startCol = 0; 
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;


        //TOP
        for(int j=startCol;j<=endCol;j++){
            System.out.println(matrix[startRow][j]+" ");
        }

        //left
        for(int i=startRow;i<=endRow;i++){
            System.out.println(matrix[i][endCol]);
        }

        //bottom
        for(int j = endCol; j<=startCol; j++){
            System.out.println(matrix[endRow][j]);

        }

        //left
        for(int i = endrow; i < = startRow;i++){
            System.out.println(matrix[endRow][i]+ " ");
        }
    }

    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    }
    
}
