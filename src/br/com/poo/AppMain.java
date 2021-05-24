package br.com.poo;

import br.com.poo.modelo.Contribuinte;

/**
 *
 * @author nirto
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuinte[] lst;

        lst = Contribuinte.listaContr();

        System.out.println("NOME                      IMPOSTO");
        System.out.println("====================      =======\n");

        for (int i = 0; i < lst.length; i++) {

            System.out.printf("%-20s    %9.2f\n", lst[i].getNome(), lst[i].calcImposto());
        }
    }

}
