
import java.util.Scanner;

public class BirthMonth {
    //num birthMonth = 0
    //
    //		output "Please enter the corresponding number to the month you were born in (1-12): "
    //		input birthMonth
    //
    //		if birthMonth >=1 AND birthMonth <= 12 then
    //			output "Your birth month is " + birthMonth
    //
    //		else
    //			output "You entered an incorrect month value: " + birthMonth
    //		end If
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int birthMonth = 0;

    System.out.println("Enter your birth month [1-12]: ");


    if (scanner.hasNextInt()){
        birthMonth = scanner.nextInt();
        scanner.nextLine();

        if(birthMonth >= 1 && birthMonth <= 12){
            System.out.println("Your birth month is " + birthMonth);
        }

        else{
            System.out.println("You said your birth month is: " + birthMonth);
            System.out.println("But that is not in the range of [1-12]. Rerun the program to try again.");
        }

    }

    scanner.close();

    }
}
