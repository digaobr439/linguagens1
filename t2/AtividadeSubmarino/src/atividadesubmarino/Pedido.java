/**
 * Willian Rodrigues Chan 16.01095-7
 * Rodrigo Martins De Carvalho 16.03378-7
 */
package atividadesubmarino;

/**
 *
 * @author 16.03378-7
 */
public class Pedido {
    Cliente cliente;
    Carrinho carrinho;
    public static int idPedido;
    public int idDessePedido;
    public Pedido(Cliente cli, Carrinho carrinho) {
        Pedido.idPedido++;
        this.idDessePedido = Pedido.idPedido;
        this.cliente = cli;
        this.carrinho = carrinho;
    }
    public String resumoPedido(){
        String temp = new String();
        temp += "===============================================\n";
        temp = "Senhor" +this.cliente.nome+ ", seu pedido foi gerado com suscesso.\n Numero do pedido: " + this.idDessePedido + "\nEndereco da entrega: " + this.cliente.endereco +"\n Resumo da compra.\n Voce comprou " + this.carrinho.lista.size()+" itens:\n";
        for(int i = 0; i<this.carrinho.lista.size();i++){
            temp += this.carrinho.lista.get(i).exibirInfos();
        }
        temp += "Um boleto foi enviado para o email" + this.cliente.email + ". Obrigado pela preferencia :)\n";
        temp += "===============================================\n";
        return temp;
    }
}
