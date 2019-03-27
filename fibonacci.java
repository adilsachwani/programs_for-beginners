import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        int prevNum = 0;
        int currNum = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter total numbers: ");
        num = in.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println(currNum);
            currNum = currNum + prevNum;
            prevNum = currNum - prevNum;
        }
    }
}