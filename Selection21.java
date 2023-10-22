
import java.util.Scanner;
/**
 * Selection21
 */
public class Selection21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Nilai uas  : ");
        float finalExam = input21.nextFloat();
        System.out.println("Nilai uts  : ");
        float midExam = input21.nextFloat();
         System.out.println("Nilai quiz  : ");
        float quiz = input21.nextFloat();
         System.out.println("Nilai tugas  : ");
        float assignment = input21.nextFloat();
        float total = (finalExam*0.4F) + (midExam*0.3F) + (quiz*0.1F) + (assignment*0.2F);
        String message = total < 65 ? "retake":"pass";
        System.out.println("Final Grade = " + total + "and the decission is" +message);

    }
}