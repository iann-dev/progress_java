import java.util.Scanner;

public class CalculoAumentoSalario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o salário
        System.out.print("Digite o salário do funcionário: ");
        // Lê o salário fornecido pelo usuário
        double salario = scanner.nextDouble();

        // Calcula o aumento com base no salário
        double aumento;
        if (salario > 1250.0) {
            aumento = salario * 0.10; // Aumento de 10% para salários superiores a R$1250,00
        } else {
            aumento = salario * 0.15; // Aumento de 15% para salários iguais ou inferiores a R$1250,00
        }

        // Calcula o novo salário após o aumento
        double novoSalario = salario + aumento;

        // Exibe o valor do aumento e o novo salário
        System.out.println("O valor do aumento é: R$" + aumento);
        System.out.println("O novo salário é: R$" + novoSalario);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
