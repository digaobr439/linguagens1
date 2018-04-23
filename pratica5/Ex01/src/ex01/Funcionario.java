/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author 16.03378-7
 */
public class Funcionario {
    private String nomeFuncionario;
    private String cpf;
    protected double salarioBase;
    private static double bonusExtra;
    
    
    
    public Funcionario(String nome, double salario){
        Concessionaria.numeroFuncionarios ++;
        this.nomeFuncionario = nome;
        this.salarioBase = salario;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String getNomeVendedor(){
        return this.nomeFuncionario;
    }
    
    public void setNomeVendedor(String nome){
        this.nomeFuncionario = nome;
    }
    public static double calcularBonusExtra(double vendasTotais, int numeroFuncionarios){
        Funcionario.bonusExtra = (0.05* vendasTotais/numeroFuncionarios);
        return Funcionario.bonusExtra;
    }
    public double getSalarioFuncionario(){
        return (this.salarioBase+ Funcionario.bonusExtra);
    }
}
