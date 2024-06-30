public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta corrente= new ContaCorrente(venilton);
        Conta poupanca= new ContaPoupanca(venilton);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}