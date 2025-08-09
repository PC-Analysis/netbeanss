/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soluciones;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author PANTERA
 */
public class conexion {
    
    Connection con;
    
    
    
    
    public conexion(){
        
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/soluciones","root","");
            System.out.println("se ha conectado a la base de datos");
            
            
            
            
    }catch (Exception e){
        
        System.err.println("No puedo conectar a la base de datos");
        
    }
   } 
   
    public Connection getConnection(){
        return con;
        
    }    

}
  
