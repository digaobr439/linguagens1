package aula04;

public class Conta {
    String numero;
    Cliente titular;
    double saldo;
    public Conta(){
        titular = new Cliente();
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

