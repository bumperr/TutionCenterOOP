/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandai;
import java.sql.*; 


/**
 *
 * @author LENOVO
 */
public class dbConnection {
   
    public static Connection connectToDB(){
         try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://db4free.net:3306/tutioncenter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
            "tutioncentermast","12345678");  
            System.out.println("Connection to database is a success");
            return con;
        
            }
         catch(Exception e){ 
             System.out.println(e);
             return null;
            }
        
    }
}