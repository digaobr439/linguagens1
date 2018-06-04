/**
 * Willian Rodrigues Chan 16.01095-7
 * Rodrigo Martins De Carvalho 16.03378-7
 */
package atividadesubmarino;

/**
 *
 * @author 16.03378-7
 */
public class Cliente {
    String cpf;
    String nome;
    String endereco;
    String cep;
    String email;
    public Cliente(String cpf,String nome,String endereco,String cep,String email) {
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
    }
    
}
