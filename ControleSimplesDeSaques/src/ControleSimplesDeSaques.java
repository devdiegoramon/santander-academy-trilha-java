import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        double limiteDiario = scanner.nextDouble ();

        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble ();

            limiteDiario -= valorSaque;

            if (valorSaque == 0) {
                System.out.println ("Transacoes encerradas.");
                break;
            }
            else if (valorSaque > limiteDiario) { // pegou
                System.out.println ("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
            else {
//
                System.out.println ("Saque realizado. Limite restante: " + limiteDiario);
                System.out.print ("Transacoes encerradas.");
                break;
            }
        }
        scanner.close ();
    }
}