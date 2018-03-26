/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author 16.03378-7
 */
public class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
    private String sobrenome;
    private String cpf;
    private int idade; 
    
    public Cliente(String cpf, String nome, String sobrenome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }
    
    public boolean mudarCPF(String cpf){
        boolean retorno = false;
        if(validarCPF(cpf)){
            this.cpf = cpf;
            retorno = true;
        }
        return retorno;
            
    }
    private boolean validarCPF(String cpf){
    return true;
    }
}
