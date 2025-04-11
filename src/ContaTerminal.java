import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numConta;
        String numAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Qual o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        numAgencia = scanner.nextLine();

        System.out.println("Digite o Número da conta: ");
        numConta = scanner.nextInt();

        System.out.println("Quanto é o valor do depósito? ");
        saldo = scanner.nextDouble();


        System.out.println("\nOlá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}