package examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        /**
         * Representa uma opera~]ap que aceita um argumento do tipo T e não retorna nenhum resultado.
         * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream
         * sem modificar ou retornar um valor
         */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // função lambda
        Consumer<Integer> imprimirNumeroPar = numero -> {
            numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        };
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

//        sem função lambda
    /**
     * Consumer<Integer> imprimirNumeroPar = numero -> {
     *             if (numero % 2 == 0) {
     *                 System.out.print(numero + " ");
     *             }
     *         };
     *
     *         numeros.forEach(n -> {
     *             if (n % 2 == 0) {
     *                 System.out.println(n);
     *             }
     *         });
     *     }
     */

}
