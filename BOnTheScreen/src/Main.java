/*
* * * *
*       *
*     * *
* * *
*     * *
*       *
* * * *
*/
public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 6) {
                    if(j==4){
                        letter[i][j] = "   ";
                    } else {
                        letter[i][j] = " * ";
                    }
                } else if (j == 0) {
                    letter[i][j] = " * ";
                } else if (i == 1 && j == 4) {
                    letter[i][j] = " * ";
                } else if (i == 5 && j == 4) {
                    letter[i][j] = " * ";
                } else if (i == 2 && j >= 3) {
                    letter[i][j] = " * ";
                } else if (i == 4 && j >= 3) {
                    letter[i][j] = " * ";
                } else if (i == 3 && j <= 2) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
