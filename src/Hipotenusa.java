import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite o valor cateto oposto de seu triângulo: ");
        int catetooposto = ler.nextInt();
        System.out.print("Digite o cateto adjacente de seu triângulo: ");
        int catetoadjacente = ler.nextInt();
        int hipotenusa = (catetooposto*catetooposto)+(catetoadjacente*catetoadjacente);

        System.out.println("A Hipotenusa do seu triângulo é igual a "+hipotenusa);
    }
}
