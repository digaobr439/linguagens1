package aula04;

public class Conta {
    String numero;
    String tutular;
    float saldo;
    String cpf;
    
    void vizualizarSaldo(){
        System.out.println("Saldo " + this.saldo);
    }
    void depositar(float deposito){
        this.saldo += deposito;
    }
    void sacar(float saque){
        this.saldo += -saque;
    }
    void transferirDinheiro(Conta conta1, Conta conta2, float valor){
        this.saldo += -valor;
        conta1.saldo += valor;
    }
    
}

