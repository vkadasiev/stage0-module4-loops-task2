package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int fromZero = 0;
        while (fromZero <= printTillInclusive) {
            if (fromZero % 2 == 0)
            System.out.println(fromZero);
            fromZero++;
        }

    }


    public static void main(String[] Args) {
        EvenNumbersPrinter printer = new EvenNumbersPrinter();
        printer.printEvenNumbers (5);
    }


}

