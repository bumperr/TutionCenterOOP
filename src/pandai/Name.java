/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandai;

/**
 *
 * @author LENOVO
 */
public class Name {
    
    private String fname, mname, lname;

    public Name(){
        
    }

    public Name(String fname, String mname, String lname) {
        this.fname = fname;// this refer to current object 
        this.mname = mname;
        this.lname = lname;
    }

    public void setFname(String fnama) {
        this.fname = fnama;
    }

    public void setMname(String mnama) {
        this.mname = mnama;
    }

    public void setLname(String lnama) {
        this.lname = lnama;
    }
    public String getFullName(){
        String fullName=this.fname +" "+this.mname+" "+this.lname;
        return fullName;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }
    
    

}
