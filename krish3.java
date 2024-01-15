import java.util.Scanner;

public class krish3 {
    public static void main(String[] pargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check if the number is divisible by any integer from 2 to the square root of
        // the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If it is divisible, then it is not a prime number
            }
        }

        return true; // If no divisors were found, it is a prime number
    }
}
