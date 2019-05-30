/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2005.exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author tiago
 */
public class Parker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ModeloABC ABC = new ModeloABC();
        ABC.setNome(JOptionPane.showInputDialog(null, "digite o nome do Modem:"));
        ABC.setModelo(JOptionPane.showInputDialog(null, "digite o Modelo do Modem:"));
        ABC.setTipoCabo(JOptionPane.showInputDialog(null, "digite tipo de Cabo:"));
        float valorfloat = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a velocidade de Upload:"));
        ABC.setVelocidadeUpload(valorfloat);
        float valorfloat2 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a velocidade de Download:"));
        ABC.setVelocidadeDownload(valorfloat2);
        int valorInt = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a quantidade de portas do Modem:"));
        ABC.setQuantDePortas(valorInt);
        JOptionPane.showMessageDialog(null, "Descrição do modem ABC\n" + ABC.descricaoModem());
        ABC.expessuraDoCabo();
        
            
        
        
       
        
    
       
       ModeloXYZ XYZ = new ModeloXYZ();
       XYZ.setNome(JOptionPane.showInputDialog(null, "digite o nome do Modem:"));
        XYZ.setModelo(JOptionPane.showInputDialog(null, "digite o Modelo do Modem:"));
        int porta =Integer.parseInt(JOptionPane.showInputDialog(null, "digite a velocidade da Porta"));
        XYZ.setVelocidadePorta(porta);
        float valorfloat1 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a velocidade de Upload:"));
        XYZ.setVelocidadeUpload(valorfloat1);
        float valorfloat3 = Float.parseFloat(JOptionPane.showInputDialog(null, "digite a velocidade de Download:"));
        XYZ.setVelocidadeDownload(valorfloat3);
        int valorInt1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a quantidade de portas do Modem:"));
        XYZ.setQuantDePortas(valorInt1);
        JOptionPane.showMessageDialog(null, "Descrição do modem XYZ\n" + XYZ.descricaoModem());
        XYZ.velocidadePorta();
     
   
       
       
       
    }
    
}
