import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str;
        String rev = "";

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        str = in.nextLine();

        for(int i = str.length()-1; i>=0; i--)
            rev += str.charAt(i);

        if(str.equals(rev))
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not a Palindrome");

    }
}