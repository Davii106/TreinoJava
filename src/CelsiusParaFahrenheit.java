import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = ler.nextDouble();
        double farenheit = (celsius * 1.8)+32;

        System.out.print("A temperatura que você informou em Celsius é igual a "+farenheit+" Farenheit");
    }
}
