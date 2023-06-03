package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int fromZero = 0;
        while (fromZero <= Math.abs(multiplyByAndToInclusive)) {
            int result = fromZero * multiplyByAndToInclusive;
            System.out.println(result);
            fromZero++;
        }
    }
    public static void main(String[] args) {
        Multiplication printer = new Multiplication();
        printer.printMultiplied(0);
    }
}

