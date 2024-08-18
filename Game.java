import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalAttempts = 5;
        boolean playAgain = true;
        System.out.println("Guess Number Between 1 - 100 ");
        System.out.println("You Have "+totalAttempts+" Chances");

        Random random = new Random();


        while (playAgain) {
            int rand  = random.nextInt(1,100);
            boolean guess = false;

            for(int i = 1;i<=totalAttempts;i++)
            {
                if(i==1)
                {
                    System.out.print("Enter Your First Guess :");
                }
                if(i==2)
                {
                    System.out.print("Enter Your Second Guess :");
                }
                
                if(i==3)
                {
                    System.out.print("Enter Your Third Guess :");
                }
                
                if(i==4)
                {
                    System.out.print("Enter Your Fourth Guess :");
                }
                
                if(i==5)
                {
                    System.out.print("Enter Your Last Guess :");
                }

                int userGuess = (int)input.nextDouble();
                if(userGuess>100)
                {
                    System.out.println("\nEnter Number between 1 - 100\n");
                    i = i-1;
                }
                else if(userGuess==rand)
                {
                    guess = true;
                    System.out.println("Hurray You Won The Game!!\n");
                    
                    System.out.println("1 - Play Again");
                    System.out.println("2 - Exit");

                    char ch = input.next().trim().charAt(0);
                    if(ch=='2')
                    {
                        System.out.println("Exited");
                        playAgain = false;
                    }
                    else
                    {
                        playAgain = true;
                    }
                    
                    break;

                }
                else if(userGuess>rand)
                {
                    System.out.println("Oops Guessed Number Is Higher Than Generated\n");
                }
                else
                {
                    System.out.println("Oops Guessed Number Is Lower Than Generated\n");
                }
            }
            if(guess==false)
            {
                System.out.println("Correct Answer Is : "+rand+" You Lost It");
                System.out.println("Better Luck Next Time");
                break;
            }
        }
    }
}