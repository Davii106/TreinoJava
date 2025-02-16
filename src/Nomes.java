import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.print("Digite seu nome completo: ");
        String primeiro_nome = ler.next();
        String segundo_nome = ler.next();
        String ultimo_nome = ler.next();

        System.out.println("Seu primeiro nome é "+primeiro_nome+" e seu último nome é "+ultimo_nome);
    }
}
