public class Program {
    public static void main(String[] args) {
       Calculator calculator = new Calculator();
        int addition = calculator.addition(6, 45);
        int subtraction = calculator.subtraction(9, 55);
        System.out.println("Addition "+addition);
        System.out.println("Substraction "+subtraction);
    }
}
