/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Contador {
    
     public static void main(String[] args) {
        
       int qtd=0;
       String letra;
       
       letra = JOptionPane.showInputDialog("INFORME A LETRA: ");
       letra=(letra);
       
       qtd = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE: ", qtd));
       qtd=(qtd);
      
       for (int i = 0; i < qtd; i++){
           System.out.println(letra);
    
       
      
}
     }
}
