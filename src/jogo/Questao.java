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
    private int operador1;
    private int operador2;

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }
    
    
    
    public Questao(){
    
    }
    public void criaPerguntaRandom(){
        int tipoPergunta = ThreadLocalRandom.current().nextInt(1, 3);
        
        switch (tipoPergunta){
            case 1:
                criaPerguntaSoma();
                break;
            case 2:
                criaPerguntaMultiplicacao();
                break;
            case 3:
                criaPerguntaSubtracao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
        }
        
    }
    
    public void criaPerguntaSoma(){
        setOperador1(ThreadLocalRandom.current().nextInt(0, 100));
        setOperador2(ThreadLocalRandom.current().nextInt(0, 20));
        
        String resposta = JOptionPane.showInputDialog("Quanto é "+getOperador1()+"+"+getOperador2()+"?", JOptionPane.QUESTION_MESSAGE);
        
        int respotaEmInteiro = Integer.parseInt(resposta);
        
        if((getOperador1()+getOperador2()) == respotaEmInteiro){
            JOptionPane.showMessageDialog(null, "Sua resposta está... Correta! =)");
        }else{
            JOptionPane.showMessageDialog(null, "Sua resposta está... Errada! =(");
        }
        
    }
    
    public void criaPerguntaMultiplicacao(){
        setOperador1(ThreadLocalRandom.current().nextInt(0, 10));
        setOperador2(ThreadLocalRandom.current().nextInt(0, 10));
        
        String resposta = JOptionPane.showInputDialog("Quanto é "+getOperador1()+"*"+getOperador2()+"?", JOptionPane.QUESTION_MESSAGE);
        
        int respotaEmInteiro = Integer.parseInt(resposta);
        
        if((getOperador1()*getOperador2()) == respotaEmInteiro){
            JOptionPane.showMessageDialog(null, "Sua resposta está... Correta! =)");
        }else{
            JOptionPane.showMessageDialog(null, "Sua resposta está... Errada! =(");
        }
        
    }
        
    public void criaPerguntaSubtracao(){
        setOperador1(ThreadLocalRandom.current().nextInt(0, 100));
        setOperador2(ThreadLocalRandom.current().nextInt(0, 20));
        
        String resposta = JOptionPane.showInputDialog("Quanto é "+getOperador1()+"-"+getOperador2()+"?", JOptionPane.QUESTION_MESSAGE);
        
        int respotaEmInteiro = Integer.parseInt(resposta);
        
        if((getOperador1()-getOperador2()) == respotaEmInteiro){
            JOptionPane.showMessageDialog(null, "Sua resposta está... Correta! =)");
        }else{
            JOptionPane.showMessageDialog(null, "Sua resposta está... Errada! =(");
        }
        
    }
}
