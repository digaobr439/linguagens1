/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estudo.erros;

/**
 *
 * @author 16.03378-7
 */
public class EstudoErros {

    public static void main(String[] args) {
        System.out.println("Chamada na Main:");
        metodo1();
        System.out.println("Fim da Main");
    }
    
    static void metodo1(){
        System.out.println("Chamada na Metodo 1:");
//        try{
            metodo2();
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Falou aqui");
//            System.out.println(""+e);
//        }
        System.out.println("Fim da Metodo 1");
    }

    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Chamada na Metodo 2:");
        int [] array = new int[10];
        try{    
            for (int i = 0 ; i < 15; i++){
                array[i] = i;
                System.out.println(""+i);
            }
        }
        catch(Exception e){
            System.out.println("Deu ruim");
            System.out.println(e.toString());
            throw (e);
        }
        System.out.println("Fim da Metodo 2");
    }
}
