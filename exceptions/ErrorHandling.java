import java.io.*;
import java.util.*;

public class ErrorHandling {
    public static void main(String[] args) {
        boolean validInput = false;
        int val = -1;
        while (!validInput) {
            try {
                Scanner input = new Scanner(System.in);
		        val = input.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("The input was not an integer! Please retry with an int");
            }
        }

        System.out.println("Got " + val);
    }
}
