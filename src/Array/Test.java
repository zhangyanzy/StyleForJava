package Array;

import java.util.Scanner;

/**
 * Created by $zhanyan on 2017/10/12.
 */
public class Test {
    public static void main(String[] args) {
        studentsScore();
    }

    private static void studentsScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int StudentCount = scanner.nextInt();
        int StudentScore[] = new int[StudentCount];
        System.out.println("请输入" + StudentCount + "个学生的成绩 :");
        int maxScore = 0;
        for (int i = 0; i < StudentScore.length; i++) {
            int score = scanner.nextInt();
            StudentScore[i] = score;
            if (StudentScore[i] > maxScore) {
                maxScore = StudentScore[i];
            }
        }
        System.out.println("最高分为： " + maxScore);

        char level;
        for (int i = 0; i < StudentScore.length; i++) {
            if (StudentScore[i] >= maxScore - 10) {
                level = 'A';
            } else if (StudentScore[i] >= maxScore - 20) {
                level = 'B';
            } else if (StudentScore[i] >= maxScore - 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("Student " + i + "score is " + StudentScore[i] + " grade is " + level);
        }

    }
}
