import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);

        if (secondNumber != 0) {
            double division = firstNumber / secondNumber;
            System.out.println("Division = " + division);
        } else {
            System.out.println("Division is not possible because second number is 0");
        }

        input.close();
    }
}
