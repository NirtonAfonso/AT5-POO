/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.poo.modelo;

/**
 *
 * @author nirto
 */
public class PJuridica extends Contribuinte {

    protected String cnpj;

    public PJuridica(String n, double r, String c) {

    }

    @Override
    public double calcImposto() {
        return 0;
    }

}
