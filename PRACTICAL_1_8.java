// Name :- Makhansa Jenil
// Roll-no :-21ce065
// Aim :-The problem is to write a program that will grade multiple-choice tests. Assume
// there are eight students and ten questions, and the answers are stored in a two dimensional array. Each row records a student’s answers to the questions, as
// shown in the following array.
// Students’ Answers to the Questions:
// 0 1 2 3 4 5 6 7 8 9
// Student 0 A B A C C D E E A D
// Student 1 D B A B C A E E A D
// Student 2 E D D A C B E E A D
// Student 3 C B A E D C E E A D
// Student 4 A B D C C D E E A D
// Student 5 B B E C C D E E A D
// Student 6 B B A C C D E E A D
// Student 7 E B E C C D E E A D
// The key is stored in a one-dimensional array:
// Key to the Questions:
// 0 1 2 3 4 5 6 7 8 9
// Key D B D C C D A E A D
// Your program grades the test and displays the result. It compares each student’s
// answers with the key, counts the number of correct answers, and displays it.
import java.util.Scanner;

public class PRACTICAL_1_8 {
    public static void main(String[] args) {
        PRACTICAL_1_8 a = new PRACTICAL_1_8();
        a.getdata();
        a.check();
    }

    String key[] = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
    String mcq[][] = new String[8][10];
    String store[] = new String[10];
    int marks[] = new int[8];
    //This getdata function takes input of student's answer.
    void getdata() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Answers of Student Number " + (i + 1) + ": ");
            store[i] = sc.nextLine();
            mcq[i] = store[i].split(" ");
        }
    }

    void check() {
        //This for loop initialize 0 value for all student's mark.
        for (int i = 0; i < 8; i++) {
            marks[i] = 0;
        }
        //This for loop checks if answer is correct or not.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                if (mcq[i][j].compareTo(key[j]) == 0) {
                    marks[i]++;
                }
            }
        }
        //This for loop prints marks of students.
        for (int i = 0; i < 8; i++) {
            System.out.println("Student Number " + (i + 1) + " has gained " + marks[i] + " marks");
        }
    }
}