/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandai;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;


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
    
    // CRUD conceptual using static methods 
   public  boolean addToDB(Connection con) throws SQLException{
     
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
public static ArrayList<Student> viewStudent(int centerID, Connection con) throws SQLException {
    String sql = "SELECT * FROM Students WHERE Centerid = ?";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1, centerID);
    ResultSet result = statement.executeQuery();

    if(!result.isBeforeFirst()){System.out.print("No result");return null;}
    //test lol
    
    
    ArrayList<Student> stdlistQ=new ArrayList<Student>();
    
    
    while (result.next()) {
        //create new student object
        //copy data to the objeck
        //add object to the list
        
         Student std=new Student();
         Name name=new Name(result.getString("Fname"),
                            result.getString("Mname"),
                            result.getString("Lname"));
         
         std.setName(name);
         std.setYear(result.getInt("Year"));
         std.setAddress(result.getString("Address"));
         std.setSchoolname(result.getString("SchoolName"));
         std.setKp(result.getString("ICNumber"));
         
         
         stdlistQ.add(std);
         


        // Print other student details as required
    }
    
    return stdlistQ;
    
}
public static void deleteStudent(String kp,Connection con) throws SQLException{
    try{
        String sql="DELETE FROM Students WHERE ICNumber=?";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, kp);
        st.execute();
    }
    catch(SQLException e){
        System.out.print("Error happened in operating the command. Please try again");
    
    }
}
public static void updateStudentInfo(String Fname,String Mname,String Lname,String address,
int year,String SchoolName,String kp,String centerID,Connection con) throws SQLException{
    
    
    
        try{
        String sql="UPDATE Students SET Fname=?,Mname=?,Lname=?,Address=?,Year=?,SchoolName=? WHERE ICNumber=? AND CenterID=?";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, Fname);
        st.setString(2, Mname);
        st.setString(3, Lname);
        st.setString(4, address);
        st.setInt(5, year);
        st.setString(6, SchoolName);
        st.setString(7, kp);
        st.setString(8, centerID);
        st.execute();
    }
    catch(SQLException e){
        System.out.print("Error happened in operating the command. Please try again");
    
    }





}

   
    
   
}