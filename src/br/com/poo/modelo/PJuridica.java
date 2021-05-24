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

    
    //Sting n -> NOME
    //double r -> RENDA BRUTA
    //String c -> CADASTRO DE PESSOA FISICA (CPF) OU DE PESSOA JURIDICA (CNPJ)
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
