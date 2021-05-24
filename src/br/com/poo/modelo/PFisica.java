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
public class PFisica extends Contribuinte {

    protected String cpf;

    public PFisica(String n, double r, String c) {

    }

    @Override
    public double calcImposto() {
        return 0;
    }

}
