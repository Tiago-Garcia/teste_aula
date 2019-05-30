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
public class EmpresaTelecomunicacoes {
   private String nome;
   private String modelo;
   private float velocidadeUpload;
   private float velocidadeDownload;
   private int quantDePortas;

  
   
    public String getNome() {
        return nome;    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadeUpload() {
        return velocidadeUpload;
    }

    public void setVelocidadeUpload(float velocidadeUpload) {
        this.velocidadeUpload = velocidadeUpload;
    }
     public float getVelocidadeDownload() {
        return velocidadeDownload;
    }

    public void setVelocidadeDownload(float velocidadeDownload) {
        this.velocidadeDownload = velocidadeDownload;
    }

    public int getQuantDePortas() {
        return quantDePortas;
    }

    public void setQuantDePortas(int quantDePortas) {
        this.quantDePortas = quantDePortas;
    }
    
    public String descricaoModem(){
        return "Nome do Modem: "+nome+"\nModelo do Modem: "+modelo+"\nVelocidade de Upload do Modem :"+velocidadeUpload+"\nvelocidade de Download do Modem: "+velocidadeDownload+"\nQuantidade De Portas Do Modem: "+quantDePortas;
    }

    
}
