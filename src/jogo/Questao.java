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
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Questao {
    public Questao(){
    
    }
    public void criaPergunta(){
        int operador1 = ThreadLocalRandom.current().nextInt(0, 100);
        int operador2 = ThreadLocalRandom.current().nextInt(0, 20);
        
        String resposta = JOptionPane.showInputDialog("Quanto é "+operador1+"+"+operador2+"?", JOptionPane.QUESTION_MESSAGE);
        
        int respotaEmInteiro = Integer.parseInt(resposta);
        
        if((operador1+operador2) == respotaEmInteiro){
            JOptionPane.showMessageDialog(null, "Sua resposta está... Correta! =)");
        }else{
            JOptionPane.showMessageDialog(null, "Sua resposta está... Errada! =(");
        }
        
    }
}
