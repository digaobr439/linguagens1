package testeentrada;

import java.util.Scanner;

public class TesteEntrada {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        
        int a = entrada.nextInt();
        
        System.out.println("Idade Informada: " + a);
        
    }
    
}
