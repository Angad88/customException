import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter your age : ");
            int userFactorial = sc.nextInt();
            int factorial = 1;
            for (int i = userFactorial; i > 0; i--) {
                factorial = factorial * i;
              }
            if (userFactorial < 0) {
                throw new NegativeException(userFactorial);
            }
            System.out.println("The Factorial of this is " + factorial);
        } catch (InputMismatchException e) {
            System.out.println("You entered an incorrect input");
        } catch (NullPointerException e) {
            System.out.println("There was a null pointer exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There was a Array out of bound exception");
        } 

    }
}
