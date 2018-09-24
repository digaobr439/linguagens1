/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author murilo.carvalho
 */
public class JavaSQlite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAO();
        if(itemDAO.CreateTable()) System.out.println("Tabela Criada!");
        else System.out.println("Algo de errado aconteceu!");
        
        ArrayList<Item> items = itemDAO.GetAll();
        System.out.println("Antes da modificação:");
        System.out.println(items);
        Item item = new Item(1,3,"Max Elixir", 300);
        itemDAO.AtualizaDados(item);
        items = itemDAO.GetAll();
        System.out.println("Depois da modificação:");
        System.out.println(items);
        
    }
    
}
