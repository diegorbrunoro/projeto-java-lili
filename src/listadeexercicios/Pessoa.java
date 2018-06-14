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
public class Pessoa {
    public String nome;
    public String sobreNome;
    
    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    
    public void AlterarNome(){
        nome = getNome();
        System.out.println("Nome: "+ nome);
    }
    
    public void AlterarSobreNome(){
        sobreNome = getSobreNome();
        System.out.println("Sobrenome: "+ sobreNome);
    }
    
    public String getNomeCompleto(String nome, String sobreNome) {
        return nome + sobreNome;
    }
    
    public void SetNomeNomeCompleto(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }
}
    
