import java.util.Scanner;

public class DobroTriploRaizQuadrada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numero = ler.nextFloat();
        float numero2 = numero*2;
        System.out.println("O dobro de "+numero+" é "+numero2);
        float numero3 = numero*3;
        System.out.println("O triplo de "+numero+" é "+numero3);
        double raizquadrada = Math.sqrt(numero);
        System.out.println("A raiz quadrada de seu número é "+raizquadrada);
    }
}
