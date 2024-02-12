import java.util.Scanner;

public class MelhoriaExercicio061 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro termo da PA
        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = scanner.nextInt();

        // Solicita ao usuário que insira a razão da PA
        System.out.print("Digite a razão da PA: ");
        int razao = scanner.nextInt();

        // Exibe mensagem inicial
        System.out.println("Os termos da PA são:");

        int i = 0;
        int quantidadeTermos;

        do {
            // Solicita ao usuário a quantidade de termos desejada
            System.out.print("Quantos termos você deseja mostrar? (Digite 0 para encerrar): ");
            quantidadeTermos = scanner.nextInt();

            // Exibe os termos da PA de acordo com a quantidade informada
            while (i < quantidadeTermos) {
                int termo = primeiroTermo + i * razao;
                System.out.print(termo + " ");
                i++;
            }

            // Reinicia o contador para a próxima iteração
            i = 0;

            // Pula uma linha para melhorar a legibilidade
            System.out.println();

        } while (quantidadeTermos != 0);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

