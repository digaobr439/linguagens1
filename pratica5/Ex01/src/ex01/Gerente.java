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
public class Gerente extends Funcionario{
    private double comissao;
    private double valorVendas;
    protected String senhaGerente; 
    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    
    public void realizarVenda(double valor){
        this.valorVendas += valor;
        Concessionaria.vendasDoMes += valor;
    }
    private double calcularComissao(double bonusExtra){
        this.comissao = (0.10* this.valorVendas + 0.5*this.salarioBase + bonusExtra);
        return this.comissao;
    }
    @Override
    public double getSalario(){
        return (this.salarioBase + this.calcularComissao(Gerente.calcularBonusExtra()));
    }
    @Override
    public double getComissao(){
        return this.calcularComissao(Gerente.calcularBonusExtra());
    }
}
