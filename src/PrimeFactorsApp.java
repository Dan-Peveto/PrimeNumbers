import java.util.Scanner;

public class PrimeFactorsApp {
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        //Print input parameters
        System.out.println("Enter an integer value between 0 - 1000: ");
        //Take in next int with scanner
        int userInput = scanner.nextInt();
        //If userInput is inbounds
        if(userInput > 1000 || userInput < 0) {
            System.out.println("Input must be an integer between 0 - 1000. You input " + userInput);  
        } else {
            PrimeFactors userReturn  = new PrimeFactors();
            System.out.println(userReturn.resolve(userInput));
        }
    scanner.close();
    }
}
