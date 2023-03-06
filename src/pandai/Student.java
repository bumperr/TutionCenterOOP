/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandai;

import java.sql.Connection;
import java.sql.*;


/**
 *
 * @author LENOVO
 */


public class Student {
    
    private Name name;
    private String kp;
    private String address;
    private String schoolname;
    private int year;
    private float marks[];

    public Student(int k){
        marks=new float[k];
    }
    public Student(){
    }
    
    
    public Student(Name name, String kp, String address, String schoolname, float[] marks) {
        this.name = name;
        this.kp = kp;
        this.address = address;
        this.schoolname = schoolname;
        this.marks=new float[marks.length];
        this.marks = marks;
    }

    void displayMarks(){
        //print every value 
        for(int i=0;i<marks.length;i++){
            System.out.println("Mark"+(i+1)+": "+ marks[i]);
        }
    
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
 
    public Name getName() {
        return name;
    }
    public void setName(Name name) {
        this.name = name;
    }
    public String getKp() {
        return kp;
    }
    public void setKp(String kp) {
        this.kp = kp;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    public void setMarks (float mark, int ind) throws Exception{
        
     if(mark<0 || mark>100){
         throw new Exception("Mark out of range");
        
     }
     if(ind<0 || ind > (marks.length -1)){
         throw new Exception("Out of range la index you");
     }
     
        this.marks[ind] = mark;
    }
    
    // CRUD conceptual 
   public boolean addToDB(Connection con) throws SQLException{
     
        //Insert
         String sql = "INSERT INTO Students (Fname,Mname,Lname,ICNumber,Address,Year,SchoolName)"
                 + "VALUES "
                 + "(?,?,?,?,?,?,?)";
 
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,this.name.getFname());
        statement.setString(2,this.name.getMname());
        statement.setString(3,this.name.getLname());
        statement.setString(4,this.kp);
        statement.setString(5,this.address);
        statement.setString(6,Integer.toString(this.getYear()));
        statement.setString(7,this.schoolname);
        
 

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new student was inserted successfully!");
            return true;
        }
        else {return false;}
   
   }
   
   //view all student from database filtered by centers
public static void viewStudent(int centerID, Connection con) throws SQLException {
    String sql = "SELECT * FROM Students WHERE Centerid = ?";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1, centerID);
    ResultSet result = statement.executeQuery();

    if(!result.isBeforeFirst()){System.out.print("No result");return;}
    while (result.next()) {
        System.out.print(result.getString("Fname")+"|");
        System.out.print(result.getString("StudentID"));
        // Print other student details as required
    }
    
}

   
    
   
}