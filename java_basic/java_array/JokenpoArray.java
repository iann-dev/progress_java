import java.util.Random;
import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao JOKENPÔ!\nEscolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");
        int escolhaUsuario = scanner.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Escolha inválida. Encerrando o jogo.");
        } else {
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};
            String escolhaUsuarioString = opcoes[escolhaUsuario - 1];
            String escolhaComputadorString = opcoes[random.nextInt(3)];

            System.out.printf("Você escolheu: %s\nO computador escolheu: %s\n",
                    escolhaUsuarioString, escolhaComputadorString);

            int resultado = (3 + escolhaUsuario - random.nextInt(3) - 1) % 3;

            if (resultado == 0) {
                System.out.println("Empate!");
            } else if (resultado == 1) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
        }

        scanner.close();
    }
}
