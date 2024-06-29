import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scanner.nextInt();

        System.out.println("Digite um operador desejado: (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite outro número: ");
        double num2 = scanner.nextInt();
        scanner.close();

        double resultado = 0;

        switch (operador){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
    }
}
