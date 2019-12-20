import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {
        Primes primes = new Primes();

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.print(">");
            var input = scanner.nextInt();
            if (primes.checkIfPrime(input) == true) {
                System.out.println("Yes, it is prime");
            } else {
                System.out.println("No, it is NOT prime");
            }

        }
    }
}

