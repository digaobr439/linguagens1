/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 16.03378-7
 */
public class Botas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String lado;
        Map<String, Dados> mapa = new HashMap<String, Dados>();
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            String chave = Integer.toString(sc.nextInt());
            lado = sc.next();
            if(mapa.containsKey(chave)){
                if(lado.equals("E")){
                    mapa.put(chave,new Dados(mapa.get(chave).getDireita(), mapa.get(chave).getEsquerda()+1));
                }
                else{
                    mapa.put(chave, new Dados(mapa.get(chave).getDireita()+1, mapa.get(chave).getEsquerda()));
                }
            }
            else{
                if(lado.equals("E")){
                    mapa.put(chave, new Dados(0,1));
                }
                else{
                    mapa.put(chave, new Dados(1,0));
                }
            }
        }
        System.out.println(mapa);
        int nPares=0;
        for(String chave : mapa.keySet()){
            if(mapa.get(chave).getDireita() <= mapa.get(chave).getEsquerda())
                nPares+= mapa.get(chave).getDireita();
            else
                nPares += mapa.get(chave).getEsquerda();
        }
            
        System.out.println(nPares);
        
    }
    
}
