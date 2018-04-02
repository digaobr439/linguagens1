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
public class Gerente {
    private String nomeGerente;
    private double salarioBase;
    private static double vendasGlobal;

    private double vendasGerente;
    private Gerente gerente;
    
    
    public static void setVendasGlobal(double valor){
        Gerente.vendasGlobal += valor;
    }
    
    public static double getVendasGlobal(){
        return Gerente.vendasGlobal;
    }
    public String getNomeGerente(){
        return this.nomeGerente;
    }
    
    public void setNomeGerente(String nome){
        this.nomeGerente = nome;
    }
    
    public void setSalarioBase(double valorSalario){
        this.salarioBase = valorSalario;
    }
    
    public double getComissao(){
        return 0.1 * vendasGerente + 0.5 * this.salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getSalarioDoMes(){
        return salarioBase + this.getComissao();
    }
    
    public void realizarVenda(double valorVenda){
       Funcionário.setVendasGlobal(valorVenda);
       Gerente.setVendasGlobal(Funcionário.getVendasGlobal());
       this.vendasGerente += valorVenda;
    }
    
}
