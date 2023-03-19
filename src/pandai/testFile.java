/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
        Database: tutioncenter
        Username: tutioncentermast
        Email: aliazeem870@gmail.com
 */
package pandai;
  import java.io.File; 
import java.io.IOException ;// Import the File class
import java.io.FileNotFoundException ;//ception class to handle errors
import java.io.FileWriter;
import java.util.Scanner;

import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class testFile {
  


  
  
  public void createFile(){
    try {
       File myObj = new File("data.txt");
       if (myObj.createNewFile()) {
         System.out.println("File created: " + myObj.getName());
       } else {
         System.out.println("File already exists." +myObj.getAbsolutePath());
       }
     } catch (IOException e) {
       System.out.println("An error occurred.");
       e.printStackTrace();
     }
  }
  
  public void writeToFile(String x) throws IOException{
      try{
        FileWriter file1=new FileWriter("data.txt");
        file1.write(x);
        file1.close();
      }
      catch(IOException e){
      e.printStackTrace();
      }
  
  }
  
  public static void readToFile(){
   
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      
      //Store every line of data in the array
        ArrayList<String> arr_line=new ArrayList<String>();
        
        
        
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        arr_line.add(data);
        
      }
      
      //Test every array list output
        for(String m : arr_line){
            System.out.println(m);
    }
      
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  

  
  }
  
  
  public static void main(String[] args) {
        readToFile();
  }
}

