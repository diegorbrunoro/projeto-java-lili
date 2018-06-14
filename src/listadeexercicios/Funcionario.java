/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios;

/**
 *
 * @author diego
 */
public class Funcionario {
    public String nome;
    public Double salario =200.00;
    
    public Funcionario(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void AlterarNome(){
        nome = getNome();
        System.out.println("Nome: "+ nome);
    }
    
    public void AlterarSalario(){
        salario = getSalario();
        System.out.println("Salario: "+ salario);
    }
    
    
    
}
