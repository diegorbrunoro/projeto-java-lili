/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author diego_000
 */
public class Conta {
    public Integer numero;
    public Double limite=0.0;
    public Double saldo=0.0;
    public Double deposito=0.0;
    public Double saque=0.0;
    public Double totalDepositado=0.0;
    
    
    public Conta(){}

    public Double getTotalDepositado() {
        return totalDepositado;
    }

    public void setTotalDepositado(Double totalDepositado) {
        this.totalDepositado = totalDepositado;
    }
    
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }
   
     public void Depositar(){ 
        deposito = getDeposito();  
        setSaldo(saldo+deposito);
        setTotalDepositado(totalDepositado+deposito);
        System.out.println("VALOR DEPOSITADO: "+deposito);        
    }
    
   public void TotalDepositado(){ 
       totalDepositado=getTotalDepositado();
    }
    
    public void Sacar(){
        saque = getSaque();
        setSaldo(saldo-saque);
        System.out.println("VALOR SACADO: "+ saque);
    }
    
 
    public void AlterarLimite(){
        limite = getLimite();
        setSaldo(saldo+limite);
        System.out.println("LIMITE: "+ limite);
    }
    
    
    
}
