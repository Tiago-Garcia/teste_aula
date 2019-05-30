/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2005.exercicio3;

/**
 *
 * @author tiago
 */
public class Veiculo {
    private String marca;
    private String cor;
    private String ano;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void mostraStatus(){
        System.out.println("\nMarca: " + this.getMarca() + "\nAno:" + this.getAno() +  "\nCor: " + this.getCor());
        
        
    } 
            
}
