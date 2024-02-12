import java.util.Scanner;

public class ProgressaoAritmeticaWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro termo da PA
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        // Solicita ao usuário que insira a razão da PA
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        // Exibe mensagem inicial
        System.out.println("Os 10 primeiros termos da PA são:");

        // Inicializa o contador
        int i = 0;

        // Usa a estrutura while para calcular e exibir os 10 primeiros termos da PA
        while (i < 10) {
            // Cálculo do termo usando a fórmula da PA
            int termo = primeiroTermo + i * razao;

            // Exibe o termo atual na sequência
            System.out.print(termo + " ");

            // Incrementa o contador
            i++;
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
