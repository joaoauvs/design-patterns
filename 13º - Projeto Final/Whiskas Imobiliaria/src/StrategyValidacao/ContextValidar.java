/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyValidacao;

/**
 *
 * @author Beatr
 */
public class ContextValidar {
    protected IStrategy strategy = null;
         
   public boolean cPF(String validar){
        strategy = new ValidarCPF();
        //strategy.validar(validar);
        return strategy.validar(validar);
    }
    public boolean eMail(String validar){
        strategy = new ValidarEmail();
        //strategy.validar(validar);
        return strategy.validar(validar);
    }
    public boolean telefone(String validar){
        strategy = new ValidarTelefone();
        //strategy.validar(validar);
        return strategy.validar(validar);
    }
    
} 
