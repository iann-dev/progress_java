import java.util.Scanner;

public class ProgressaoAritmetica {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro termo da PA
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        // Solicita ao usuário que insira a razão da PA
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        // Exibe mensagem inicial
        System.out.println("Os 10 primeiros termos da PA são:");

        // Loop para calcular e exibir os 10 primeiros termos da PA
        for (int i = 0; i < 10; i++) {
            // Cálculo do termo usando a fórmula da PA
            int termo = primeiroTermo + i * razao;

            // Exibe o termo atual na sequência
            System.out.print(termo + " ");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
