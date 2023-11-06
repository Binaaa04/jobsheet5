import java.util.Scanner;

/**
 * Selection321
 */
public class Selection321 {

    public static void main(String[] args) {
         Scanner input21 = new Scanner(System.in);
        double operand1, operand2, result;
        char operator;

        System.out.println("Input operand 1 : ");
        operand1 = input21.nextDouble();
         System.out.println("Input operand 2 : ");
        operand2 = input21.nextDouble();
         System.out.println("Input operator ( + - * / ) = ");
        operator = input21.next().charAt(0);

        switch (operator) {
            case '+':
             result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + " = " + result);
            
            case '-':
             result = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
             result = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;
            case '/':
             result = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;
        }
    }
}