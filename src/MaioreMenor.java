import java.util.Scanner;

public class MaioreMenor {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o primeiro número: ");
        double numero = ler.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = ler.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double numero3 = ler.nextDouble();

        double maior = Math.max(numero, Math.max(numero2, numero3));
        double menor = Math.min(numero, Math.min(numero2, numero3));

        System.out.println("O maior número é "+maior);
        System.out.println("O menor número é "+menor);
    }
}
