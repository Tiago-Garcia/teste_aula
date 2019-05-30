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
public class ModeloXYZ extends EmpresaTelecomunicacoes{
    private int velocidadePorta;

    public int getVelocidadePorta() {
        return velocidadePorta;
    }

    public void setVelocidadePorta(int velocidadePorta) {
        this.velocidadePorta = velocidadePorta;
    }
    
    public void velocidadePorta(){
        if(this.getVelocidadePorta()> 1000){
            System.out.println("Porta Operando em alta Velocidade");
        }else{
            System.out.println("Operando em baixa Velocidade");
        }
    }
}
