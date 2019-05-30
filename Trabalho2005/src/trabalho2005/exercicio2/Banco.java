/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2005.exercicio2;

/**
 *
 * @author tiago.garcia
 */
public class Banco {
    private String conta;
    private float saldo;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(float sacar){
       
        if(sacar > saldo) {
            System.out.println("Saldo insuficiente");
        }else
                {
            saldo = saldo - sacar;{
                            System.out.println("Saque realizado com sucesso");
                }
        }
            
            
        }
    
}
