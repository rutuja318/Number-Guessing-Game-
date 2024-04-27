import java.util.*;
public class task1
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int LB=1;
        int UB=100;
        int numberToGuess=random.nextInt(UB-LB+1)+LB;
        int maxAttempts=5;
        int attempts=0;

        System.out.println("\n **********WELCOME TO GUESS NUMBER GAME!!**********");
        System.out.println(" \n\n You will be asked to guess a number to win the game..");
        System.out.println("    I've selected a random number between " +LB+ "&"+UB+".");
        System.out.println("    you have "+maxAttempts+"attempts to guess it..\n ");
     
         while(attempts<maxAttempts)
        {
            System.out.print(" Atempts "+(attempts+1)+":Enter Guess number between 1 to 100=");
            int playerGuess=scan.nextInt();
            attempts++;

            if(playerGuess <LB||playerGuess>UB)
            {
                System.out.println("Your guess is out of range!!Please guess between "+LB+"&"+UB+".");
            }
            else if(playerGuess==numberToGuess)
            {
                System.out.println(" OohhOO!,Your" +numberToGuess+ " is Correct. You Win the Game! \n Congratulations!!");
                break;
            }
            else 
            {
                System.out.println("Your Guess Number is "+(playerGuess<numberToGuess?"Smaller":"Greater")+ ".");
            }
         }
         if(attempts==maxAttempts)
         {
            System.out.println("\n\n  OOps Out of attempts!! \n\n The correct number was "+numberToGuess );
         }
         System.out.println("     Thank You!!!");
scan.close();
    }
}