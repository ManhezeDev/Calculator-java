import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora Simples!");
        
        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Escolha a operação (+, -, *, /) ou 'sair' para encerrar: ");
            String operation = scanner.next();
            
            if (operation.equals("sair")) {
                System.out.println("Encerrando a calculadora. Até logo!");
                break;
            }

            double result;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, result);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
        
        scanner.close();
    }
}