package br.com.poo;

import br.com.poo.modelo.Contribuinte;

/**
 * @author Nirton Afonso
 * @RA 201851301411
 * @Doscente Oberdan Rocha Pinheiro
 */
public class AppMain {

    public static void main(String[] args) {
        Contribuinte[] lst;

        lst = Contribuinte.listaContr();

        System.out.println("NOME DA PESSOA\nOU DA EMPRESA             IMPOSTO A SER PAGO  ");
        System.out.println("=================         ===============\n");

        for (int i = 0; i < lst.length; i++) {

            System.out.printf("%-23s    %.2f\n", lst[i].getNome(), lst[i].calcImposto());
        }
    }

}
