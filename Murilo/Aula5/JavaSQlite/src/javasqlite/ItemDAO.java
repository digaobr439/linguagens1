/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author murilo.carvalho
 */
public class ItemDAO {
    private final String TABELA = "estoque";
    
    public boolean CreateTable(){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
//            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB","root","");
//            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB","root","");
            
            stmt = conexao.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS "+ TABELA +"(" +
                    "id INT PRIMARY KEY NOT NULL,"
                    + "name VARCHAR(45),"
                    + "price REAL,"
                    + "count INT);";
            stmt.executeUpdate(sql);            
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean InsertItem(Item item){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
//            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB","root","");

            
            conexao.setAutoCommit(false);
            
            String sql = "INSERT INTO " + TABELA + " VALUES(?,?,?,?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, item.getId());
            ps.setString(2, item.getName());
            ps.setDouble(3, item.getPrice());
            ps.setInt(4, item.getCount());
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            return false;
        }
        return true;
    }
    
    public ArrayList<Item> GetAll(){
        ArrayList<Item> items = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
//            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB","root","");
            
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                int count = rs.getInt("count");
                double price = rs.getDouble("price");
                String name = rs.getString("name");
                items.add(new Item(id, count, name, price));
            }
            rs.close();
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return items;
    }
    
    public void AtualizaDados(Item item){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
//            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB","root","");
            
            conexao.setAutoCommit(false);
            
            String sql = "UPDATE " + TABELA + " SET name = ?,"
                    + " price = ?, count = ? WHERE id = ?;";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
           
            ps.setString(1, item.getName());
            ps.setDouble(2, item.getPrice());
            ps.setInt(3, item.getCount());
            ps.setInt(4, item.getId());
            
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());            
        }
    }
}
