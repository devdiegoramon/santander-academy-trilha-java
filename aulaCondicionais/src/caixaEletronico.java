//condicional para saque (if)
public class caixaEletronico {
    public static void main (String[] args) {
        double saldo = 25;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println (saldo);
    }
}
