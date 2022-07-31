// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-Display numbers in a pyramid pattern.
//                 1
//               1 2 1
//             1 2 4 2 1
//           1 2 4 8 4 2 1
//         1 2 4 8 16 8 4 2 1
//      1 2 4 8 16 32 16 8 4 2 1
//   1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
import java.util.Scanner;

public class PRACTICAL_1_7 {
    private static final String string = " ";
        public static void main(String[] args)
        {
            int number = 0;
            //This for represents 7 rows in pattern.
            for (int row = 0; row <= 7; row++) {
                //This for loop is represent spaces in pattern.
                for (int column = 1; column <= 7 - row; column++) {
                    System.out.printf("%4s", string);
                }
                //This for loop is represent left part from middle column.
                for (int column = 0; column <= row; column++) {
                    number = (int) Math.pow(2, column);

                    System.out.printf("%4d", number);
                }
                //This for loop is represent right part from middle column.
                for (int column = row - 1; column >= 0; column--) {
                    number = (int) Math.pow(2, column);

                    System.out.printf("%4d", number);
                }
                System.out.println();
            }
        }
}

