package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        int factorial = 1;

        while (number <= printToInclusive) {
            System.out.println(factorial);
            number++;
            factorial = factorial * number;
        }
    }

    public static void main(String[] Args) {
        FactorialNumbers printer = new FactorialNumbers();
        printer.printFactorialRow(7);
    }
}

