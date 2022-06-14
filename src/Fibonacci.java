import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter a number");
            int num = scan.nextInt();
            int answer = findFib(num);
            System.out.println("The value of the "+num+"th iteration is: " + answer);
        }


    }
    public static int findFib ( int n){
        int[] seq = new int[n];
        seq[0] = 1;
        seq[1] = 1;

        for (int i = 2; i < n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2];
        }

        System.out.println(Arrays.toString(seq));

        return seq[n-1];
    }
}


/*
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number: ");
            int num = s.nextInt();
            int n = getFib(num);
            System.out.println(num + "th value in the series is: " + n);
        }
    }

    public static int getFib(int n) {
        int num1=1;
        int num2=1;
        int result=2;

        for(int i=3;i<=n;i++){
            result = num1 + num2;
            num1 =num2;
            num2 = result;
        }

        return result;

    }
 */