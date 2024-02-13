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
            String escolhaUsuarioString = opcoes[--escolhaUsuario];
            String escolhaComputadorString = opcoes[random.nextInt(3)];

            System.out.printf("Você escolheu: %s\nO computador escolheu: %s\n",
                    escolhaUsuarioString, escolhaComputadorString);

            int diferenca = (escolhaUsuario - random.nextInt(3) + 2) % 3;

            System.out.println(diferenca == 0 ? "Empate!" : 
                               (diferenca == 1 || diferenca == 2) ? "Você venceu!" :
                               "Você perdeu!");
        }

        scanner.close();
    }
}
