import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        boolean flag = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = in.nextInt();

        if(num!=0 && num!=1){
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }
        } else
            System.out.println("Not a Prime Number");
            
        
        if(flag)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

    }
}