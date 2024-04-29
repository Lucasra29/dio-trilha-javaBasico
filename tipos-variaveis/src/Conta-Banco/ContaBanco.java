import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite seu nome: ");
        String nomecliente = scanner.nextLine();

        System.out.println("Por favor,digite o numéro da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor,digite o numero da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Por favor,digite o valor a ser depositado: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco,sua agência é: "
                + agencia + ", sua conta é: " + conta + " seu saldo é: " + saldo + ", saldo já disponivél para saque !");

    }

}
