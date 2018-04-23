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
        Concessionaria.vendasTotal += valor;
    }

}
