import java.util.Scanner;

public class GPA2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: " );
        int numStudents = scanner.nextInt();
        int totalScore = 0;
        int studentCount = 0;
        while (studentCount < numStudents){
            System.out.print("Введите оценку студента " + (studentCount + 1) + ": ");
            int score = scanner.nextInt();
            totalScore += score;
            studentCount ++;
        }
        double averageScore = (double) totalScore / numStudents;
        System.out.println("Средний бал группы: " + averageScore);
        scanner.close();
    }
}
