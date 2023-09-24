import java.util.Scanner;
public class TheaterKiosk {
    //num age = 0
    //
    //	output "Please enter your age: "
    //	input age
    //
    //	if age >= 21 then
    //		output "You get a wristband!"
    //	endIF
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
