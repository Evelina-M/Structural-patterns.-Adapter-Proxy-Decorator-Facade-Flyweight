public class Main {
    public static void main(String[] args) {
        Ints calcInts = new IntsCalculator();

        System.out.println(calcInts.sum(2, 2)); // 4
        System.out.println(calcInts.sum(10, 22)); // 32
        System.out.println(calcInts.pow(2, 10)); // 1024

        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
    }
}