import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = 1;
        int num;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = in.nextInt();

        for(int i=1; i<=num; i++){
            result *= i;
        }

        System.out.println("Factorial of " + num + " is " + result);
    }
}