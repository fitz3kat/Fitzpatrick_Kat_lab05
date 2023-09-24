import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a wristband!");

        }
        scanner.close();

    }
}
