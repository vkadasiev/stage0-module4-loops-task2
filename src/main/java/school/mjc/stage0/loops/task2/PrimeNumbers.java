package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;

        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }

            number++;
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int divisor = 2;
        while (divisor * divisor <= number) {
            if (number % divisor == 0) {
                return false;
            }
            divisor++;
        }

        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(33);
    }
}
