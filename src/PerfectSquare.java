import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit: ");
        int lowNum = sc.nextInt();
        System.out.println("Enter the upper limit");
        int upNum = sc.nextInt();


        for (int i=lowNum; i<=upNum; i++){
            int sqrt = (int) Math.sqrt(i);
            if(sqrt*sqrt==i){
                System.out.println(i);
            }

        }
    }
}
