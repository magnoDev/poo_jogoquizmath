/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author magno
 */

import javax.swing.JOptionPane;

public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int continuar;
        
        
       continuar = JOptionPane.showConfirmDialog(null, "Vamos começar?");

        
        while (continuar == JOptionPane.YES_OPTION){
            Questao novaQuestao = new Questao();
            novaQuestao.criaPerguntaRandom();
            continuar = JOptionPane.showConfirmDialog(null, "Quer continuar?");
        }

    }
    
}
