/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 16.03378-7
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Dados> mapa = new HashMap<>();
        mapa.put("aqui", new Dados(1,"Aqui"));
        mapa.put("chave2", new Dados(5,"Aqui"));
        mapa.put("aqui", new Dados(10,"Goku"));
    for(String chave: mapa.keySet()){
        
    }
    }
    
}
