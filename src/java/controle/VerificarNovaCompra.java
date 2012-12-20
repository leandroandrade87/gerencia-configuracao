/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entity.Customer;

/**
 *
 * @author Leandro
 */
public class VerificarNovaCompra {
    
    private Customer customer;
    
    public boolean verificarLimiteDisponivel(Integer limiteCredito){
        boolean limiteDisponivel = true;
        if( customer.getCreditLimit() < limiteCredito ){
            limiteDisponivel = false;
        }
        return limiteDisponivel;
    }
    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer( Customer customer ) {
        this.customer = customer;
    }
    
    
    
    
}
