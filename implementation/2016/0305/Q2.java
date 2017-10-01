import java.util.*;

class Q2 {

    public static void main(String []args) {

        int matrix[][];
        int newMatrix[][];
        int row;
        int column;
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        column = input.nextInt();
        int runCount = input.nextInt();
        matrix = new int[row][column];

        for(int indexRow=0;indexRow<row;indexRow++) {
            for(int indexCol=0;indexCol<column;indexCol++) {
                int num = input.nextInt();
                matrix[indexRow][indexCol] = num;
            }
        }

        for(int index=1;index<=runCount;index++) {
            int currCount = input.nextInt();
            if(currCount == 0) {
                // 矩陣旋轉
                newMatrix = new int[column][row];
                for(int indexCol=0;indexCol<column;indexCol++) {
                    for(int indexRow=row-1;indexRow>=0;indexRow--) {
                        newMatrix[indexCol][row-indexRow-1] = matrix[indexRow][indexCol];
                    }
                }
                int temp = row;
                row = column;
                column = temp;
                matrix = newMatrix;
            } else {
                // 矩陣翻轉
                for(int indexCol=0;indexCol<column;indexCol++) {
                    for(int indexRow=0;indexRow<row/2;indexRow++) {
                        int tempValue = matrix[indexRow][indexCol];
                        matrix[indexRow][indexCol] = matrix[row-indexRow-1][indexCol];
                        matrix[row-indexRow-1][indexCol] = tempValue;
                    }
                }
            }
        }

        // output the matrix result
        System.out.println(row + " " + column);
        String str = "";
        for(int indexRow=0;indexRow<row;indexRow++) {
            for(int indexCol=0;indexCol<column;indexCol++) {
                if(indexCol != column-1) {
                    str += matrix[indexRow][indexCol] + " ";
                } else {
                    str += matrix[indexRow][indexCol];
                }
            }
            System.out.println(str);
            str = "";
        }
    }
}
