import java.util.Scanner;

public class VerificaNumeroPrimoTernary {
    public static void main(String[] args) {
        // Inicializa o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo usando a expressão ternária
        System.out.println(ehPrimo(numero) ? numero + " é um número primo." : numero + " não é um número primo.");

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }

    // Função para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        // Um número primo é maior que 1 e é divisível apenas por 1 e por ele mesmo
        return numero > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(numero) + 1).noneMatch(i -> numero % i == 0);
    }
}
