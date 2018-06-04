/**
 * Willian Rodrigues Chan 16.01095-7
 * Rodrigo Martins De Carvalho 16.03378-7
 */
package atividadesubmarino;

/**
 *
 * @author 16.03378-7
 */
public class Carrinho extends Lista implements Compravel{
    @Override
    public boolean adicionarALista(Produto prod) {
        if(this.lista.size()< 12){
            lista.add(prod);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getRestantes() {
        return (12-lista.size());
    }

    @Override
    public void fecharCompra() {
        AtividadeSubmarino.finalizarPedido();
    }

}
