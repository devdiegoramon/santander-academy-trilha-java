public class FormatadorCepException {
    public static void main (String[] args) {
        try {
            String cepFormatado = formatarCep ("45784914");
            System.out.println (cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println ("O CEP está incorreto");
        }
    }

    static String formatarCep(String cep)
            throws CepInvalidoException {
        if (cep.length () != 8)
            throw new CepInvalidoException ();

        // SIMULAÇÃO
        return "45.784-914";
    }
}

