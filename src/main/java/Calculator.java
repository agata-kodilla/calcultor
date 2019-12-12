public class Calculator {
    private double result;

    public Calculator() {
        this.result = 0;
    }

    public double addNumber(int num){
        return result+num;
    }

    public double substractNumber(int num){
        return result-num;
    }
}
