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
public class Santander {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        contaCorrente Ccorrente = new contaCorrente();
       Ccorrente.setConta("13452");
       Ccorrente.setSaldo(500.00f);
       Ccorrente.setTaxaDeAdmnistracao(0.5f);
       Ccorrente.sacar(600.00f);
       
        contaPoupanca Poupanca = new contaPoupanca();
        
        Poupanca.setConta("13452");
        Poupanca.setSaldo(1.000f);
        Poupanca.setDiaDeVencimento("23/05/2019");
  
        
        
        System.out.println("Conta: " + Ccorrente.getConta() + "\nSaldo:" + Ccorrente.getSaldo()  + "\nTaxa de Administração: " + Ccorrente.getTaxaDeAdmnistracao() );
        System.out.println("\nConta: " + Poupanca.getConta() + "\nSaldo:" + Poupanca.getSaldo()  + "\nDia de vencimento: " + Poupanca.getDiaDeVencimento());
    }
    
}
