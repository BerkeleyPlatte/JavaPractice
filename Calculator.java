import java.util.Scanner;

public class Calculator {

    public Calculator() {
    
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        String number1Str, op, number2Str;
        double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number");
        number1Str = input.nextLine();
        number1 = Double.parseDouble(number1Str);

        System.out.println("Enter operation (+, -, *, or /");
        op = input.nextLine();
        char opChar = op.charAt(0);

        System.out.println("Enter second number");
        number2Str = input.nextLine();
        number2 = Double.parseDouble(number2Str);

        Calculator myCalculator = new Calculator();
        if (opChar == '+') {
            System.out.println(myCalculator.add(number1, number2));
        }
        else if (opChar == '-') {
            System.out.println(myCalculator.subtract(number1, number2));
        }
        else if (opChar == '*') {
            System.out.println(myCalculator.multiply(number1, number2));
        }
        else if (opChar == '/') {
            System.out.println(myCalculator.divide(number1, number2));
        }
      
    }
}