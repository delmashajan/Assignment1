import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){

        System.out.println("Enter your Triangle row list :");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for(int i=1; i<=limit; i++)
        {

            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
