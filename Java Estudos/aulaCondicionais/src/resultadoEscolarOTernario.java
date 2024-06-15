public class resultadoEscolarOTernario {
    public static void main (String[] args) {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";

        System.out.println (resultado);
    }
}
