package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int fromZero = 0;
        while (fromZero <= lastPrinted) {
            System.out.println(fromZero);
            fromZero++;
        }


    }


    public static void main(String[] Args) {
        NaturalNumbers printer = new NaturalNumbers();
        printer.naturalNumbersPrinter(5);
    }


}
