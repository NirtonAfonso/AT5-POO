package br.com.poo.modelo;

/**
 * @author Nirton Afonso
 * @RA 201851301411
 * @Doscente Oberdan Rocha Pinheiro
 */
public class PJuridica extends Contribuinte {

    protected String cnpj;

    /**
     *
     * @param n (Nome)
     * @param r (Renda Brutra)
     * @param c (CNPJ)
     */
    public PJuridica(String n, double r, String c) {
        this.nome = n;
        this.rendaBrt = r;
        this.cnpj = c;

    }

    @Override
    public double calcImposto() {
        return rendaBrt * 0.1;
    }

}
