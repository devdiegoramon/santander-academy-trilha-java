// contador.java
import java.util.Scanner;
import Exception.ParametrosInvalidosException;

public class contador {
    public static void main (String[] args) {
        int parametroUm, parametroDois;

        Scanner terminal = new Scanner (System.in);
        System.out.println ("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt ();
        System.out.println ("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt ();

        try {
            contar (
                    parametroUm,
                    parametroDois
                   );

        } catch (ParametrosInvalidosException e) {
            System.out.println ("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar (
            int parametroUm,
            int parametroDois
                       )
            throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
        }

       for (int i = parametroUm; i <= parametroDois; i++) {
           System.out.println ("Número " + i);
       }
    }
}