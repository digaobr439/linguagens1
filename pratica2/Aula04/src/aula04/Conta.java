package aula04;

public class Conta {
    String numeroConta;
    Cliente titular;
    private double saldo;
    
    public Conta(String cpf, String nConta){
        this.titular = new Cliente(cpf);
        this.saldo = 0;
        this.numeroConta = nConta;
        
    }
    
    double vizualizarSaldo(){
        return (this.saldo); 
   }
    void depositar(double deposito){
        this.saldo += deposito;
        
    }
    boolean sacar(double saque){
        boolean resp = false;
        if(this.saldo >= saque){
            this.saldo -= saque;
            resp = true;
        }
        return resp;
    }
    
    boolean transferirDinheiro(Conta conta1,  double valor){
        boolean resp = false;
         if(this.sacar(valor)){
            
            conta1.depositar(valor);
            resp = true;
        }
        return resp;
    }
    
}

