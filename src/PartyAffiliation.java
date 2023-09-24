import java.util.Scanner;
public class PartyAffiliation {
    //string party = ""
    //
    //		output "Please enter your party affiliation, Democrat, Republican, or Independent [D, R, I]: "
    //		input party
    //
    //		if party == "D" then
    //			output "You get a Democrat Donkey!"
    //
    //		else If party == "R" then
    //			output "You get a Republican Elephant!"
    //
    //		else
    //			output "You get an Independent Man!"
    //
    //		endIf
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Scanner in = new Scanner(System.in);

        String partyChoice = "";

        System.out.println("Chose a party from the following: (D)emocrat, (R)epublican, (I)ndependent, or (O)ther.");

        System.out.println("Enter your chosen party: [D, R, I, O: ");
        partyChoice = in.nextLine();

        if(partyChoice.equals("D") )
        {
            System.out.println("You get a Democratic Donkey!");
        }

        else if(partyChoice.equals("R"))
        {
            System.out.println("You get a Republican Elephant!");

        }

        else if (partyChoice.equals("I"))
        {
            System.out.println("You get an independent Man");
        }

        else if (partyChoice.equals("O"))
        {
            System.out.println("You get other");
        }

        else
        {
            System.out.println("You get other");
        }

        scanner.close();



    }
}
