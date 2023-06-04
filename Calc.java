import java.util.Scanner;

interface Arithmetic {
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(float a, float b);
    public void mod(int a, int b);
}

class Calculator implements Arithmetic {
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    public void sub(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    public void mul(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    public void div(float a, float b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return;
        }
        System.out.println(a + " / " + b + " = " + (a/b));
    }

    public void mod(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        calc.add(num1, num2);
        calc.sub(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
        calc.mod(num1, num2);
    }
}
