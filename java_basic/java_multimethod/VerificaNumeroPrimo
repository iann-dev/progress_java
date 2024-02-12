import java.util.Scanner;

public class VerificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        // Um número primo é maior que 1 e é divisível apenas por 1 e por ele mesmo
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Encontrou um divisor além de 1 e do próprio número
            }
        }

        return true; // Não foi encontrado divisor além de 1 e do próprio número
    }
}
