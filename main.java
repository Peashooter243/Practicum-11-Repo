// Practicum 11 (Largest of Three Program)
// (TO COMPLETE)
//I don't want to have to type this 50 times
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // var declarations
        double num1, num2, num3, largest;

        // prompt user for three numbers
       Scanner UserInput = new Scanner(System.in);
       System.out.print("Please type a number: ");
       num1 = UserInput.nextDouble();
       System.out.print("Please type another number: ");
       num2 = UserInput.nextDouble();
       System.out.print("Please type one more number: ");
       num3 = UserInput.nextDouble();

        // determine largest and assign to variable largest
        largest = num1;

        if(largest < num2)
        {
            largest = num2;
        }

        if(largest < num3)
        {
            largest = num3;
        }

        // display results
        System.out.println("The largest of " + num1 + ", " + num2 +
                           ", " + num3 + " is " + largest);
    }
}
