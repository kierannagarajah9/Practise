import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rNum = new Random();
        int num = rNum.nextInt(50);
        System.out.println(num);

        System.out.println("Guess a number between 1 and 50");
        int guess = scan.nextInt();

        while(guess!=num){
            if(guess == num){
                break;
            }
            else if(guess>num){
                System.out.println("Guess too high!");
            }
            else{
                System.out.println("Guess too low!");
            }

            System.out.println("Guess again!");
            guess = scan.nextInt();
        }

        System.out.println("Youve got it, the number is : " +num);




    }
}
