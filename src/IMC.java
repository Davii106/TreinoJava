import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite seu peso: ");
        double peso = ler.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = ler.nextDouble();
        double imc = (peso/(altura*altura));

        System.out.println("Seu IMC é igual a "+imc);
    }
}
