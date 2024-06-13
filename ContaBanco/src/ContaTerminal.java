import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // Dados
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.50;

        // Mensagem inicial
        System.out.println("Seja bem vind@");

        // Nome do cliente
        System.out.print("Para criar uma conta, primeiramente digite seu nome: ");
        nomeCliente = scanner.nextLine(); // Utiliza nextLine para capturar nome completo

        // Escolha da agência
        System.out.println("Em qual agência você quer fazer sua conta: ");

        // Exibe as agências disponíveis
        for (int i = 8046; i <= 8049; i++) {
            System.out.println(i);
        }

        // Escolha da agência
        while (true) {
            System.out.print("Digite o número da agência: ");
            agencia = scanner.next();

            if (agencia.equals("8046") || agencia.equals("8047") || agencia.equals("8048") || agencia.equals("8049")) {
                break;
            } else {
                System.out.println("Essa agência não existe. Por favor, escolha uma agência válida.");
            }
        }

        // número de conta aleatório
        numeroConta = 2000 + (int) (Math.random() * 4000); // Número aleatório entre 2000 e 5999

        // informações da conta
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso Banco!\n", nomeCliente);
        System.out.printf("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo bônus é R$ " + saldo);

        // Fecha o Scanner e fim da Aplicação
        scanner.close();
    }
}
