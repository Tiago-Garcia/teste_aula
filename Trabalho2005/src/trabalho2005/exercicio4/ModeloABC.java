/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2005.exercicio4;

/**
 *
 * @author tiago
 */
public class ModeloABC extends EmpresaTelecomunicacoes {
       private int velocidadePorta;
       private  String tipoCabo;

          
       
       
    public int getVelocidadePorta() {
        return velocidadePorta;
    }

    public void setVelocidadePorta(int velocidadePorta) {
        this.velocidadePorta = velocidadePorta;
    }

    public String getTipoCabo() {
        return tipoCabo;
    }

    public void setTipoCabo(String tipoCabo) {
        this.tipoCabo = tipoCabo;
    }
    
    public void expessuraDoCabo(){
       if ("10base2".equals(this.getTipoCabo())){
        System.out.println("Cabo Fino");
    }else {
            System.out.println("Cabo grosso");
            }
       
    
    }
    
       
}


