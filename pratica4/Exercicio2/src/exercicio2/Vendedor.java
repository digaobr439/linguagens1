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
public class Vendedor {
    private String nomeFuncionario;
    private double salarioBase;
    private static double vendasGlobal;
    static int numeroDeFuncionarios;
    private double vendasFuncionario;
    private Gerente gerente;
    
    public Vendedor(String nome, double salario, Gerente gerenteNovo){
        Vendedor.numeroDeFuncionarios ++;
        Gerente.numeroDeFuncionarios++;
        this.nomeFuncionario = nome;
        this.salarioBase = salario;
        this.gerente = gerenteNovo;
    }
    
    public Vendedor(){
        Vendedor.numeroDeFuncionarios ++;
        Gerente.numeroDeFuncionarios++;
        this.nomeFuncionario = new String();
    }
    
    public void setGerente(Gerente gerenteNovo){
        this.gerente = gerenteNovo;
    }
    
    public Gerente getGerente(){
        return this.gerente;
    }
    
    public static void setVendasGlobal(double valor){
        Vendedor.vendasGlobal += valor;
    }
    
    public static double getVendasGlobal(){
        return Vendedor.vendasGlobal;
    }
    
    public String getNomeVendedor(){
        return this.nomeFuncionario;
    }
    
    public void setNomeVendedor(String nome){
        this.nomeFuncionario = nome;
    }
    
    public void setSalarioBase(double valorSalario){
        this.salarioBase = valorSalario;
    }
    
    public double getComissao(){
        return 0.05 * vendasGlobal/Vendedor.numeroDeFuncionarios;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getSalarioDoMes(){
        return salarioBase + this.getComissao();
    }
    
    public void realizarVenda(double valorVenda){
       Vendedor.vendasGlobal += valorVenda;
       Gerente.setVendasGlobal(Vendedor.vendasGlobal);
       this.vendasFuncionario += valorVenda;
    }
    
}
