import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor,digite o numéro da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor,digite o numero da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

    }

}
