/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tsi.lpiii;

/**
 *
 * @author silva
 */
public class Main {
    public static void main(String[] args) {
        FormulaBhaskaraModel model = new FormulaBhaskaraModel();
        FormulaBhaskaraView view = new FormulaBhaskaraView();
        FormulaBhaskaraController controller = new FormulaBhaskaraController(model, view);
        controller.setVisible(true);
    }
}
