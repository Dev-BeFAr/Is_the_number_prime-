import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.println("The number you want to check?");
        int number = input.nextInt();

        Boolean isPrime = true;

        for (int i = 2 ; i < number ; i++ ){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(number + " is prime");
        }
        else {
            System.out.println(number + " not is prime");
        }

    }
}