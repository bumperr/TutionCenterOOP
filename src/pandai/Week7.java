/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pandai;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Week7

{
    // application code
  /**
   * @param args
   */
  public static void main(String[] args) {

        Name nama = new Name();
        String fname, mname, lname;
        String kp, address, schoolname;
        float marks[] = new float[3];

        Student listStudent[] = new Student[3];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            
            System.out.println("Student #" + (i+1));
            System.out.println("");

            System.out.println("Enter your first name: ");
            fname = in.nextLine();

            System.out.println("Enter your middle name: ");
            mname = in.nextLine();

            System.out.println("Enter your last name: ");
            lname = in.nextLine();   

            System.out.println("Enter your IC number: ");
            kp = in.nextLine();
            
            System.out.println("Enter your address: ");
            address = in.nextLine();
            
            System.out.println("Enter your school name: ");
            schoolname = in.nextLine();

            for(int j = 0; j < 3; j++){

                System.out.println("Enter your mark for test #" + (j+1));
                marks[j] = in.nextFloat();

            }
            
            nama = new Name(fname, mname, lname);

            listStudent[i] = new Student(nama, kp, address, schoolname, marks);
        }

        for(int l = 0; l < 3; l++){

           // SHOW TO USER EACH STUDENT
        }
    
        in.close();
    }
}


