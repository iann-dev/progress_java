import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada do usuário e o gerador de números aleatórios
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Exibe as opções para o usuário
        System.out.println("Bem-vindo ao JOKENPÔ!\nEscolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        int escolhaUsuario = scanner.nextInt();

        // Verifica se a escolha do usuário é válida
        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Escolha inválida. Encerrando o jogo.");
        } else {
            // Array com as opções possíveis
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            // Obtém as escolhas do usuário e do computador
            String escolhaUsuarioString = opcoes[--escolhaUsuario];
            String escolhaComputadorString = opcoes[random.nextInt(3)];

            // Exibe as escolhas feitas
            System.out.printf("Você escolheu: %s\nO computador escolheu: %s\n",
                    escolhaUsuarioString, escolhaComputadorString);

            // Calcula a diferença para determinar o resultado
            int diferenca = (escolhaUsuario - random.nextInt(3) + 3) % 3;

            // Exibe o resultado com base na diferença calculada
            System.out.println(diferenca == 0 ? "Empate!" :
                               (diferenca == 1) ? "Você perdeu!" :
                               "Você venceu!");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
