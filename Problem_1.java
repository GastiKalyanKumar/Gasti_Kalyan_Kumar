import java.util.Scanner;
class Calculator {
    double a, b;
    String operation;
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    void calculate() {
        if (operation.equalsIgnoreCase("add")) {
            System.out.println("Result: " + (a + b));
        } else if (operation.equalsIgnoreCase("sub")) {
            System.out.println("Result: " + (a - b));
        } else if (operation.equalsIgnoreCase("mul")) {
            System.out.println("Result: " + (a * b));
        } else if (operation.equalsIgnoreCase("div")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation. Please enter add, sub, mul, or div.");
        }
    }
}
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        sc.nextLine();  // Consume the newline left by nextDouble()
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();
       
    }
}
