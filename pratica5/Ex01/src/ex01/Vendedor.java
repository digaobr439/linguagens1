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
public class Vendedor extends Funcionario{
    private double comissao;
    private double valorVendas;
    public Vendedor(String nome, double salario){
        super(nome, salario);
    }
    public void realizarVenda(double valor){
        this.valorVendas += valor;
        Concessionaria.vendasDoMes += valor;
    }
    public double calcularComissao(double bonusExtra){
        this.comissao = (0.02* this.valorVendas + bonusExtra);
        return this.comissao;
    }
    @Override
    public double getSalario(){
        return (this.salarioBase+ this.calcularComissao(Funcionario.calcularBonusExtra()));
    }
    @Override
    public double getComissao(){
        return this.calcularComissao(Gerente.calcularBonusExtra());
    }
}
