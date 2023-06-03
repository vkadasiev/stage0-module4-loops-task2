package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int exponent = 0;
            int result = 1;

            while (exponent <= power) {
                System.out.println(result);
                result = result * 2;
                exponent++;
            }
        }
    }

    public static void main(String[] args) {
        PowerOfTwo powerCalculator = new PowerOfTwo();
        powerCalculator.printPower(4);
    }
}
  //