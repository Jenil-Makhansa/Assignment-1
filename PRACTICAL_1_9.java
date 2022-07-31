// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-The problem is to check whether a given Sudoku solution is correct.
import java.util.Scanner;

public class PRACTICAL_1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[9][9];
        int f, ans = 0;
        //This for loop takes your answer of sudoku as input.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        //This for loop checks the sudoku's answer is correct or not.
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ans = ans ^ a[i][j];
            }
        }
        //This condition prints yes if answer is correct else print no.
        if (ans == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}