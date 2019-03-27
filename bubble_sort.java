public class Main {
    public static void main(String[] args) {

        int num[] = {4,1,12,3,2,10};
        int temp;

        for(int i=0; i<num.length; i++) {
            for(int j=1; j<num.length-i; j++){

                if(num[j-1]<num[j]){
                    temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        
        }

        for(int n : num)
            System.out.print(n + "    ");
    }
}