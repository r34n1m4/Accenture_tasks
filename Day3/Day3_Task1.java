package accenture;

/*1) Write a program which creates two dimensional
// array and stores a multiplication table (from 1 - 10) in it.

    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100

    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
 */

public class Day3_Task1 {

    public static void main(String[] args) {

        int Table[][] = new int[10][10];
        int row = 1, column = 1;

        for (int i = 0; i < Table.length; i++) {
            for (int j = 0; j < Table[i].length; j++) {
                Table[i][j] = row * column;
              column += 1;
            }
            row += 1;
            column = 1;
        }

        for (int i = 0; i < Table.length; i++) {
            for (int j = 0; j < Table[i].length; j++) {
                System.out.println((j + 1) + " * " + (i + 1) + " = " + Table[i][j]);
            }
            System.out.print("\n");
        }
    }
}


