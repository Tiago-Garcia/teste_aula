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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Carros carros = new Carros();
        carros.setMarca("Fiat Uno");
        carros.setCor("Azul");
        carros.setAno("2005");
        carros.setQuantDePortas(2);

        Motos motos = new Motos();
        motos.setMarca("Factos ybr 125");
        motos.setCor("Vermelha");
        motos.setAno("2014");
        motos.setQuantidadeCilindradas(124);
        
        carros.mostraStatus();
        System.out.println("Portas: " + carros.getQuantDePortas());
               
        motos.mostraStatus();
        System.out.println("Cilindradas: " + motos.getQuantidadeCilindradas());
        
        
        
        
        
    }
    
}
