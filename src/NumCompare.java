import java.util.Scanner;
public class NumCompare {
    //num numOne = 0
    //		num numTwo = 0
    //
    //		output "Please enter an integer: "
    //		input numOne
    //
    //		output "Please enter another integer: "
    //		input numTwo
    //
    //		if numOne == numTwo then
    //			output numOne + " and " + numTwo " are equal"
    //
    //		else If numOne > numTwo then
    //			output numOne + " is greater than " + numTwo
    //
    //		else
    //			output numOne + " is less than " + numTwo
    //
    //		end If
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");

        if (scanner.hasNextInt())
        {
            int num1 = scanner.nextInt();

            System.out.println("Enter your second number: ");

            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();

                if (num1 == num2)
                {
                    System.out.println(num1 + " is equal to " + num2);

                }

                else if(num1< num2)
                {
                    System.out.println(num1 + " is less than " + num2);
                }

                else if(num1> num2)
                {
                    System.out.println(num1 + " is less than " + num2);
                }

                else
                {
                    System.out.println("You entered an invalid input. Please rerun the program to try again.");

                }
            }
            else
            {
                System.out.println("You entered an invalid input. Please rerun the program to try again.");
            }

        }
        else
        {
            System.out.println("You entered an invalid input. Please rerun the program to try again.");
        }

    }
}