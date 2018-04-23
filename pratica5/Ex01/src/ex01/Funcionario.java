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
    protected String nomeFuncionario;
    protected String cpf;
    protected double salarioBase;
    protected double bonus;
    private static double vendasGlobal;
    static int numeroDeFuncionarios;
    public Funcionario(String nome, double salario){
        Funcionario.numeroDeFuncionarios ++;
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
    public static double getVendasGlobal(){
        return Funcionario.vendasGlobal;
    }
    public double getComissaoBase(){
        return (0.05* Funcionario.vendasGlobal/Funcionario.numeroDeFuncionarios);
    }
    public double getSalarioFuncionario(){
        return (this.salarioBase+this.getComissaoBase());
    }
}
