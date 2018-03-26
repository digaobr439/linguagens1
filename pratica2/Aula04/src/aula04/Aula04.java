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
        //Conta(String cpf, String nConta, String nome, String sobrenome, int idade)
        Conta c1 = new Conta("138.368.848-99", "2884","Glauber", "Silva", 69);
        
        Conta minhaConta = new Conta("238.368.848-99", "3884","Glauber", "Silva", 69);
        
        c1.depositar(1000);
        minhaConta.depositar(1800);
        
        System.out.println("Saldo antes c1: " + c1.vizualizarSaldo() );
        System.out.println("Saldo antes c1: " + minhaConta.vizualizarSaldo() );
                
        c1.transferirDinheiro(minhaConta, 500);
        
        System.out.println("Saldo depois: " +  c1.vizualizarSaldo() );
        System.out.println("Saldo antes c1: " + minhaConta.vizualizarSaldo() );

        
//                System.out.println("CPF " + c1.titular.cpf);
    }
    
}
