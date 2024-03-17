public class App {
    public static void main(String[] args) throws Exception {

        // Creating 2d array
        int[][] twoDArrays = {{1,3,4}, 
                              {4,6,7}, 
                              {8,5,4}
                             };
        System.out.println("2D ARRAY: ");
        for(int r = 0; r < twoDArrays.length; r++){ // Loops through Columns
            for(int c = 0; c < twoDArrays[0].length;c++){ // Loops through Rows
                System.out.print(twoDArrays[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of 2D array ");
        int result = 0;
        for(int c = 0; c < twoDArrays.length; c++){
            for(int r = 0; r < twoDArrays[0].length; r++){
                result += twoDArrays[c][r];
            }
        }
        System.out.println(result);

        System.out.println("Enhanced For Loops in 2D Array");
        for(int[] rows : twoDArrays){
            for(int columns : rows){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
