import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // declare variables
        int favNumberOne = 0;
        double favNumberTwo = 0;
        favNumberOne = SafeInput.getInt(in, "What is your favorite integer?");
        favNumberTwo = SafeInput.getDouble(in, "What is your favorite number?");
// outputs favorite numbers
        System.out.println("Your favorite integer is: " + favNumberOne + " your favorite number is: " + favNumberTwo);




    }
}
