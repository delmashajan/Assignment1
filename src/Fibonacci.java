import java.util.Scanner;

public class Fibonacci {
        static int fib(int num){
        if(num<=1){
            return num;
        }
        else {
            return fib(num-1)+fib(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci series up to n terms: ");
        for(int i=0; i<num; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
