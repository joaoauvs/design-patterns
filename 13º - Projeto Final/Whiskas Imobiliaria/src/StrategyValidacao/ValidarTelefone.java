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

public class ValidarTelefone implements IStrategy{

    /**
     *
     * @param telefone
     * @return
     */
    @Override
    public boolean validar(String telefone){
        return telefone.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
               telefone.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");
    }
}
