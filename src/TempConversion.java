import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Temperature :");

        float fahrenheit = sc.nextFloat();
        float celsius = ((fahrenheit-32)*5)/9;

        System.out.println("Temperature in Celsius is " +celsius);
    }
}
