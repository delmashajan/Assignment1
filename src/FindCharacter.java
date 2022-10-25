import java.util.Scanner;

public class FindCharacter {
    static void findVowel(char inputChar){
        switch(inputChar){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(inputChar + "is Vowel");
            default -> System.out.println(inputChar + " is Consonant");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char inputChar = sc.next().charAt(0);

        findVowel(inputChar);
    }

}
