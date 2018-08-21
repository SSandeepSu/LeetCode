package leetCode;

public class DiagonalTraverse {

    public static void main(String[] args) {
        int[] diagonal = findDiagonalOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                { 7, 8, 9 }
        });

        for (int i : diagonal) {
            System.out.println(i);
        }
    }


    public static int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[0];
        }
        int row = 0, column = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[row][column];
            if((row + column) % 2 == 0){
                if( column == n -1){
                    row++;
                } else if(row == 0){
                    column++;
                } else {
                    row--;column++;
                }
            } else {
                if( row == m-1){
                    column++;
                } else if(column == 0){
                    row++;
                } else {
                    row++;
                    column--;
                }
            }
        }

        return arr;
    }

}
