/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tsi.lpiii;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;

/**
 *
 * @author silva
 */
public class FormulaBhaskaraModel {

    private double entradaA;
    private double entradaB;
    private double entradaC;
    private double delta, r1, r2;
    String falha = "Impossivel calcular";

    public FormulaBhaskaraModel() {

    }

    public double getEntradaA() {
        return entradaA;
    }

    public void setEntradaA(double entradaA) {
        this.entradaA = entradaA;
    }

    public double getEntradaB() {
        return entradaB;
    }

    public void setEntradaB(double entradaB) {
        this.entradaB = entradaB;
    }

    public double getEntradaC() {
        return entradaC;
    }

    public void setEntradaC(double entradaC) {
        this.entradaC = entradaC;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public String calculoFormulaBhaskara() {
        DecimalFormat df = new DecimalFormat("###,0.00");

        delta = Math.pow(entradaB, 2) - (4 * entradaA * entradaC);

        if ((entradaA == 0) || (delta < 0)) {
            return falha;
        } else {

            double r1 = (((-1 * entradaB) + Math.pow(delta, 0.5)) / (2 * entradaA));
            double r2 = (((-1 * entradaB) - Math.pow(delta, 0.5)) / (2 * entradaA));

            return Double.toString(r1);
        }

    }

    public String calculoFormulaBhaskara2() {
        DecimalFormat df = new DecimalFormat("###,0.00");

        delta = Math.pow(entradaB, 2) - (4 * entradaA * entradaC);

        if ((entradaA == 0) || (delta < 0)) {
            return falha;
        } else {

            double r1 = (((-1 * entradaB) + Math.pow(delta, 0.5)) / (2 * entradaA));
            double r2 = (((-1 * entradaB) - Math.pow(delta, 0.5)) / (2 * entradaA));

            return Double.toString(r2);
        }
    }

}
