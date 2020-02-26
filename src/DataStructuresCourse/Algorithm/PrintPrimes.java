// Sieve of Eratosthenes. An effective way to find Primes.
// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

package DataStructuresCourse.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintPrimes {
    public static void main(String[] args) throws Exception {

        BufferedReader keyboard;
        String inputLine;

        keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter a number from keyboard: ");
        System.out.flush();        /* Make sure the line is printed immediately. */
        inputLine = keyboard.readLine();
        int inputNumber = Integer.parseInt(inputLine);

        printPrimes(inputNumber);

    }

    private static void printPrimes(int n) {

        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (prime[divisor]) {
                for (int i = 2 * divisor; i <= n; i = i + divisor) {
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(" " + i);
            }
        }
        System.out.print("\n");

    }

}
