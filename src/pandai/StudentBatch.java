/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pandai;

/**
 *
 * @author LENOVO
 */
public class StudentBatch {
     // data section
    // what is a StudentBatch
    // a StudentBatch is a list of students registered in a batch
    // "list of students"???? an array of Student
    Student students[] = new Student[10];
    int currsz = 0;

    // operation

    void add(Student s, int i) {
        students[i] = s;
    }

    // method overloading
    void add(Student s) {
        students[currsz++] = s;
    }

    // find a particular student
    public int find(String name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        for (int i=0; i<currsz; i++) {
            if (students[i].getName().getFname() == name ||
                    students[i].getName().getLname() == name|
                students[i].getName().getLname() == name)
                return i;
        }
        return -1;
    }
    public Student getStudent(int index) {
        if (index<0 || index> students.length){
            throw new ArithmeticException("student not exist");
            
        }
        
        return this.students[index];
        
    }
}
