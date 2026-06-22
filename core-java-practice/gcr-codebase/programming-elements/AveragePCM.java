import java.util.Scanner;

public class AveragePCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();

        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average PCM marks = " + average);

        input.close();
    }
}
