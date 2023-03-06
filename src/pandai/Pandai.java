/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pandai;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import java.util.HashSet;
import java.util.Scanner;
public class Pandai {
    
    /**
     * @param args the command line arguments
     */
    public static int displayMenu(){
        System.out.println("============Pandai sdn bhd management system============");
        System.out.print("[1]View\n[2]Add\n[3]Update\n[4]Generate report\n[0]Exit\n");
        System.out.print("Enter option:");
        Scanner input=new Scanner(System.in);
        int opt=input.nextInt();
        //error checking  heree 
        
        return opt;
    }
    public static void menu1 (Connection con) throws SQLException {
        System.out.println("Please choose the tution centers");
        
        //Retrieve centers from the db and display 
         Statement statement1 = con.createStatement();
        ResultSet resultSet = statement1.executeQuery("SELECT * FROM Tution");
        while (resultSet.next()) {
            int x = resultSet.getInt("QualificationID");
            String y = resultSet.getString("QualificationName");
            // process the data
            System.out.println("ID:" + x +"\n qualification:"+y);
}
        
    
    }
    public static void main(String[] args) throws SQLException {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        Connection con=dbConnection.connectToDB();
        /*
        int option=displayMenu();
        Student ali=new Student();
        Name ali1=new Name("Muhammad ","Ali","Azeem");
        ali.setName(ali1);
        ali.setKp("030730090165");
        ali.setAddress("batu 5 jalan kaki bukit perlis");
        ali.setYear(2020);
        ali.setSchoolname("Smk derma");
        if(ali.addToDB(con)){System.out.print("Added ali");}
        */
        Student.viewStudent(2, con);
        
   

        
       

        
    }
    

}
