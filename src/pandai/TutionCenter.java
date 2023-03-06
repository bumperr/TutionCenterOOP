package pandai;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class TutionCenter {
    private Headmaster hm;
    private ArrayList<Tutor> tutor_list = new ArrayList<Tutor>();
    private ArrayList<StudentBatch> studentBatch_list=new ArrayList<StudentBatch>();
    //-----------------Setter and Getters--------------------
    /**
     * @return the hm
     */
    public Headmaster getHm() {
        return hm;
    }

    /**
     * @return the tutor_list
     */
    public ArrayList<Tutor> getTutor_list() {
        return tutor_list;
    }

    /**
     * @return the studentBatch_list
     */
    public ArrayList<StudentBatch> getStudentBatch_list() {
        return studentBatch_list;
    }

    /**
     * @param hm the hm to set
     */
    public void setHm(Headmaster hm) {
        this.hm = hm;
    }

    /**
     * @param tutor_list the tutor_list to set
     */
    public void setTutor_list(ArrayList<Tutor> tutor_list) {
        this.tutor_list = tutor_list;
    }

    /**
     * @param studentBatch_list the studentBatch_list to set
     */
    public void setStudentBatch_list(ArrayList<StudentBatch> studentBatch_list) {
        this.studentBatch_list = studentBatch_list;
    }
    
    //============================Database operation==========================================
        //add
        //view
        
    //==============================constructor=========================================
    public TutionCenter(){
    
    }
    
    public TutionCenter(Headmaster h){
            tutor_list=new ArrayList<Tutor>();
            studentBatch_list=new ArrayList<StudentBatch>();
            this.hm=h;
    }
    //===========================Addition to the list=================================
    public void addTutor(Tutor t){
        tutor_list.add(t);
    }
    public void addStudentBatch(StudentBatch m){
        studentBatch_list.add(m);
    }
    //==========================Display ================================================
    public void displayAllTutors(){
        for(Tutor i:tutor_list){
            System.out.println("=============================Tutor ==================");
            System.out.println("Tutor Name: "+ i.getName()+" | ");
            System.out.println("Tutor IC: "+ i.getIc()+" | "); 
            System.out.print("Tutor Address: "+ i.getAddress()+" | ");
        
    
    }
    }
}
