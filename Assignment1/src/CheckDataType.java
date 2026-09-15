import java.util.Scanner;

public class CheckDataType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Error: First value is not a double.");
            return;
        }

        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");

        if (!sc.hasNextDouble()) {
            System.out.println("Error: Second value is not a double.");
            return;
        }

        double n2 = sc.nextDouble();

        double average = (n1 + n2) / 2;

        System.out.println("Average = " + average);

        sc.close();
    }
}

