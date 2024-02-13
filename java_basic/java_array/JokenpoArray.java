import java.util.Random;
import java.util.Scanner;

public class JokenpoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao JOKENPÔ!");
        System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");

        int escolhaUsuario = scanner.nextInt();
        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Escolha inválida. Encerrando o jogo.");
            scanner.close();
            return;
        }

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String escolhaUsuarioString = opcoes[escolhaUsuario - 1];
        String escolhaComputadorString = opcoes[random.nextInt(3)];

        System.out.println("Você escolheu: " + escolhaUsuarioString);
        System.out.println("O computador escolheu: " + escolhaComputadorString);

        if (escolhaUsuario == (random.nextInt(3) + 1)) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario - escolhaComputadorString.length() == 1) || 
                   (escolhaUsuario - escolhaComputadorString.length() == -2)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        scanner.close();
    }
}
