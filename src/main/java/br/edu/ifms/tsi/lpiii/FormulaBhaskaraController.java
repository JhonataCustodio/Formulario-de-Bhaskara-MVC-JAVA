/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.tsi.lpiii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author silva
 */
public class FormulaBhaskaraController {
    private FormulaBhaskaraModel model ;
    private FormulaBhaskaraView view;
    
    FormulaBhaskaraController(FormulaBhaskaraModel model, FormulaBhaskaraView view){
        this.model = model;
        this.view = view;
        this.view.getCampoResultado().setEditable(false);
        tratarEventoDoBotaoCalcular();  
    }
    
    public void setVisible(boolean b){
        view.setVisible(b);
    }
    
    private void enviarDadosDaViewParaModel(){
        model.setEntradaA(Double.parseDouble(view.getCampoPrimeiroValor().getText()));
        model.setEntradaB(Double.parseDouble(view.getCampoSegundoValor().getText()));
        model.setEntradaC(Double.parseDouble(view.getCampoTerceiroValor().getText()));
    }
    
    private void enviarDadosDoModelParaView(){
        view.getCampoResultado().setText(model.calculoFormulaBhaskara());
        view.getCampoResultado1().setText(model.calculoFormulaBhaskara2());
    }
    
    private void tratarEventoDoBotaoCalcular(){
        view.getBotaoCalcular().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               enviarDadosDaViewParaModel();
               enviarDadosDoModelParaView();
            }
        });
    }
}
