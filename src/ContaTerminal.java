import java.util.Scanner; // Importação necessária para usar o Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numConta;
        String numAgencia;
        String nomeCliente;
        double saldo;

        // Solicitando e lendo os dados do usuário
        System.out.println("Qual o seu nome: ");
        nomeCliente = scanner.nextLine(); // Lê o nome completo

        System.out.println("Digite o número da agência: ");
        numAgencia = scanner.nextLine(); // Lê a agência (pode conter caracteres como '-')

        System.out.println("Digite o Número da conta: ");
        numConta = scanner.nextInt();

        System.out.println("Quanto é o valor do depósito? ");
        saldo = scanner.nextDouble();


        System.out.println("\nOlá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}