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
public class TestaFuncionario {
    
    
    public static void main(String[] args) {
        
        
        String acessar;
        int num=1;
               
        Funcionario Funcionario = new Funcionario();
        
        while(num != 0){ 
            
        acessar = JOptionPane.showInputDialog("1- FUNCIONARIO "
                +"\n"+"2- MOSTRAR DADOS"
                +"\n"+"0- SAIR");
        num = Integer.parseInt(acessar);
        
          if(num ==1){
            Funcionario.setNome(JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONARIO: "));
        Funcionario.AlterarNome();
        }
          if(num ==2){
                    JOptionPane.showMessageDialog(null,"NOME DO FUNCIONARIO: "+ Funcionario.getNome()
                                                    +"\n"+"SALARIO FUNCIONARIO: "+ Funcionario.getSalario());
        }
         
        }
        
    }
    
}
