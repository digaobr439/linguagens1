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
public class Aula04 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo;
        Conta c1 = new Conta();
        
        Conta minhaConta = new Conta();
        
//        c1.saldo = 1000;
//        minhaConta.saldo = 1800;
//        
//        System.out.println("Saldo antes c1: " + c1.vizualizarSaldo() );
//        System.out.println("Saldo antes c1: " + minhaConta.vizualizarSaldo() );
//                
//        c1.transferirDinheiro(minhaConta, 500);
//        
//        System.out.println("Saldo depois: " +  c1.vizualizarSaldo() );
//        System.out.println("Saldo antes c1: " + minhaConta.vizualizarSaldo() );
//        c1.titular = new Cliente();
//        minhaConta.titular = new Cliente();
        
        c1.titular.cpf = "111111";
        minhaConta.titular.cpf = "222222";
        System.out.println("CPF " + c1.titular.cpf);
    }
    
}
