/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2005.exercicio1;

/**
 *
 * @author tiago.garcia
 */
public class Trabalho2005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Eletrodomestico eletro = new Eletrodomestico();
        Tv tv = new Tv();
        tv.setNome("tv200");
        tv.setMarca("Samsung");
        tv.setPreco(1.500f);
        tv.setTamanho(43);
        tv.setLcdOuPlasma("plasma");
        
        Radio radio = new Radio();
        radio.setNome("radio2019");
        radio.setMarca("lg");
        radio.setPreco(500f);
        radio.setPotenciaRms(2000);
        
        VideoGame Game = new VideoGame();
        Game.setNome("Video300");
        Game.setMarca("sony");
        Game.setPreco(3.000f);
        Game.setControlesSuportados(2);
        
        
        System.out.println("Nome Tv: " + tv.getNome() + "\n Marca: " + tv.getMarca() + "\n Preco: R$ " + tv.getPreco() + "\n Tamanho: " + tv.getTamanho() + "\n TV LCD OU PLASMA: " + tv.getLcdOuPlasma()+"\n" );
        System.out.println("Nome Radio: " + radio.getNome() + "\n Marca: " + radio.getMarca() + "\n Preco: R$ " + radio.getPreco() + "\n Potencia: " + radio.getPotenciaRms() + "\n" );
        System.out.println("Nome VideoGame: " + Game.getNome() + "\n Marca: " + Game.getMarca() + "\n Preco: R$ " + Game.getPreco() + "\n Controles Aceitos: " + Game.getControlesSuportados());
        
    }
    
}
