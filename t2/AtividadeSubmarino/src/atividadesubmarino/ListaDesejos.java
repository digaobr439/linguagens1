/**
 * Willian Rodrigues Chan 16.01095-7
 * Rodrigo Martins De Carvalho 16.03378-7
 */
package atividadesubmarino;

/**
 *
 * @author 16.03378-7
 */
public class ListaDesejos extends Lista{


    @Override
    public boolean adicionarALista(Produto prod) {
        if(this.lista.size()< 5){
            lista.add(prod);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int getRestantes() {
        return (5-lista.size());
    }

    
}
