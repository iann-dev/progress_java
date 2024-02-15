import java.util.Random;
import java.util.Scanner;

public class JokenpoCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao JOKENPÔ!");
        System.out.println("Escolha: 1 - Pedra, 2 - Papel, 3 - Tesoura");

        // Leitura da escolha do usuário
        int escolhaUsuario = scanner.nextInt();

        // Verifica se a escolha do usuário é válida
        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Escolha inválida. Encerrando o jogo.");
            scanner.close();
            return;
        }

        // Converte a escolha do usuário para Pedra, Papel ou Tesoura
        String escolhaUsuarioString;
        switch (escolhaUsuario) {
            case 1:
                escolhaUsuarioString = "Pedra";
                break;
            case 2:
                escolhaUsuarioString = "Papel";
                break;
            case 3:
                escolhaUsuarioString = "Tesoura";
                break;
            default:
                escolhaUsuarioString = "Escolha inválida";
                break;
        }

        // Gera a escolha aleatória do computador
        int escolhaComputador = random.nextInt(3) + 1;
        String escolhaComputadorString;
        switch (escolhaComputador) {
            case 1:
                escolhaComputadorString = "Pedra";
                break;
            case 2:
                escolhaComputadorString = "Papel";
                break;
            case 3:
                escolhaComputadorString = "Tesoura";
                break;
            default:
                escolhaComputadorString = "Escolha inválida";
                break;
        }

        // Exibe as escolhas do usuário e do computador
        System.out.println("Você escolheu: " + escolhaUsuarioString);
        System.out.println("O computador escolheu: " + escolhaComputadorString);

        // Determina o vencedor
        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                   (escolhaUsuario == 2 && escolhaComputador == 1) ||
                   (escolhaUsuario == 3 && escolhaComputador == 2)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
