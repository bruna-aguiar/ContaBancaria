import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner para capturar os valores digitados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite a sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel");
    }
}
