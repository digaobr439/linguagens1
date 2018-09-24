/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemdados;

import java.util.Comparator;

/**
 *
 * @author 16.03378-7
 */
public class Dados implements Comparable  {
    private int id;
    private String nome;

    public Dados(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "ID:" + this.getId() +"Nome: " + this.getNome();
    }
    
//    @Override
    public int compare(Object o1, Object o2) {
        Dados d1 = (Dados) o1;
        Dados d2 = (Dados) o2;
        if(d1.getId() > d2.getId())
            return 1;
        else if(d1.getId() == d2.getId()){
            return 0;
        }
        else{
            return -1;
        }
        
    }
    
    @Override
    public int compareTo(Object outra) {
            return compare(this,outra);
        }

}
