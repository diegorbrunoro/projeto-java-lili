
package listadeexercicios;
import javax.swing.JOptionPane;


/**
 *
 * @author diego_000
 */
public class TestaConta {

    

    public static void main(String[] args) {
        String acessar;
        int num=1;
        
        Conta Conta = new Conta();

       while(num != 0){ 
           acessar = JOptionPane.showInputDialog("1- SACAR "+"\n"
                   +"2- DEPOSITAR "+"\n"
                   +"3- EXTRATO "+"\n"
                   +"4- LIMITE "+"\n"
                   +"0- SAIR ");
          num = Integer.parseInt(acessar);

        
        if(num ==1){
            Conta.setSaque(Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO SAQUE: ")));
        Conta.Sacar();
        }
        
        if(num ==2){
             Conta.setDeposito (Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR DO DEPOSITO: " )));
        Conta.Depositar();
            
        } 
        if(num ==3){
           JOptionPane.showMessageDialog(null,"TOTAL DEPOSITADO: "+ Conta.getTotalDepositado()
                                +"\n"+"TOTAL SACADO: "+ Conta.getSaque()
                                +"\n"+ "LIMITE DA CONTA: "+ Conta.getLimite()
                                +"\n"+ "SALDO COM LIMITE: "+ Conta.getSaldo() );        
       }     
        if(num ==4){
              Conta.setLimite(Double.parseDouble(JOptionPane.showInputDialog("INFORME O LIMITE DESEJADO: " )));
        Conta.AlterarLimite();
       }     
        
       

        
       }
        
    }
    
    
   
    
    
    

    
    
        
   
    
    
    
}
