import java.util.Scanner;

/**
 * Selection1
 */
public class Selection1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        System.out.println("Input a number = ");
        int number = input21.nextInt();
        if (number%2 == 0) {
            System.out.println(number+" is an even number! ");
        } else {
            System.out.println(number+" is an odd number! ");
        }
  
        
    }
}