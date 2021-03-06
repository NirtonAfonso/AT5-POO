package br.com.poo.modelo;

/**
 * @author Nirton Afonso
 * @RA 201851301411
 * @Doscente Oberdan Rocha Pinheiro
 */
public class PFisica extends Contribuinte {

    protected String cpf;

    /**
     *
     * @param n (Nome)
     * @param r (Renda Brutra)
     * @param c (CPF)
     */
    public PFisica(String n, double r, String c) {
        this.nome = n;
        this.rendaBrt = r;
        this.cpf = c;
    }

    @Override
    public double calcImposto() {
        if (rendaBrt > 0 && rendaBrt <= 1400) {
            return 0;
        } else if (rendaBrt > 1400 && rendaBrt <= 2100) {
            return (rendaBrt * 0.1) - 100;
        } else if (rendaBrt > 2100 && rendaBrt <= 2800) {
            return (rendaBrt * 0.15) - 270;
        } else if (rendaBrt > 2800 && rendaBrt <= 3600) {
            return (rendaBrt * 0.25) - 500;
        } else {
            return (rendaBrt * 0.3) - 700;
        }
    }

}
