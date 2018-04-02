/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;



/**
 *
 * @author 16.03378-7
 */
public class Funcionário {
    private String nomeFuncionario;
    private double salarioBase;
    private static double vendasGlobal;
    private static int numeroDeFuncionarios;
    private double vendasFuncionario;
    
    public Funcionário(String nome, double salario){
        Funcionário.numeroDeFuncionarios ++;
        this.nomeFuncionario = nome;
        this.salarioBase = salario;
    }
    
    public Funcionário(){
            Funcionário.numeroDeFuncionarios ++;
        this.nomeFuncionario = new String();
    }
    
    public String getNomeFuncionario(){
        return this.nomeFuncionario;
    }
    
    public void setNomeFuncionario(String nome){
        this.nomeFuncionario = nome;
    }
    
    public void setSalarioBase(double valorSalario){
        this.salarioBase = valorSalario;
    }
    
    public double getComissao(){
        return 0.05 * vendasGlobal/Funcionário.numeroDeFuncionarios;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getSalarioDoMes(){
        return salarioBase + this.getComissao();
    }
    
    public void realizarVenda(double valorVenda){
       Funcionário.vendasGlobal += valorVenda;
       this.vendasFuncionario += valorVenda;
    }
    
}
