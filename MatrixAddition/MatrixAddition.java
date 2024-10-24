public class MatrixAddition {

    public static void main(String[] args) {
        
        int[][] array1 = {
            {1, 2, 3},
            {3, 4, 5},
            {6, 7, 8}
        };
        int[][] array2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] summe = new int[3][3];

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1.length; j++){
                summe[i][j] = array1[i][j] + array2[j][j];
            }
        }
        for(int i = 0; i < summe.length; i++){
            for(int j = 0; j < summe[i].length; i++){
                System.out.println(summe[i][j] + " ");
            }
        }
    }
}
