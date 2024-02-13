import java.util.Scanner;

public class VerificaNumeroPrimoTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println(ehPrimo(numero) ? numero + " é um número primo." : numero + " não é um número primo.");

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        return numero > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(numero) + 1).noneMatch(i -> numero % i == 0);
    }
}
