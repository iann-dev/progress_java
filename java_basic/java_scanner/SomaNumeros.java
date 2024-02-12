import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o primeiro número
        System.out.print("Digite o primeiro número: ");
        // Lê o primeiro número fornecido pelo usuário
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário para digitar o segundo número
        System.out.print("Digite o segundo número: ");
        // Lê o segundo número fornecido pelo usuário
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
