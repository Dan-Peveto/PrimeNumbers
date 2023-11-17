import java.util.Scanner;

/**
 * PrimeFactorUserCompute
 */
public class PrimeFactorUserCompute {

    public void UserFactor() {
        boolean quit = false;
        Scanner intScanner = new Scanner(System.in);
        
        while(!quit) {
            //Initialize Scanner
            //Print input parameters
            System.out.print("Enter an integer value between 0 - 1000: ");
            //Take in next int with scanner
            int userInput = intScanner.nextInt();
            //If userInput is inbounds
            if(userInput > 1000 || userInput < 0) {
                System.out.println("Input must be an integer between 0 - 1000. You input " + userInput);
                System.out.println("Do you want to try again following the rules this time Y/n");
                quit = toQuit("Fine quit then");
            } else {
                seeClear();
                System.out.println("The Prime Factors for " + userInput + " are: " );
                PrimeFactors userReturn  = new PrimeFactors();
                System.out.println(userReturn.resolve(userInput));
                System.out.println("Do you have another number to try Yes/no");
                quit = toQuit("Come back when you need me");
            }
        }
        intScanner.close();
    }   
    public void seeClear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public boolean toQuit(String quitMessage) {
        Scanner strScanner = new Scanner(System.in);
        String userChoice = strScanner.nextLine();
        if(userChoice.charAt(0) == 'y' || userChoice.charAt(0) == 'Y') {
            seeClear();
            return false;
        } else {
            System.out.println(userChoice);
            System.out.println(quitMessage);
            return true;
        }  
    }
}
