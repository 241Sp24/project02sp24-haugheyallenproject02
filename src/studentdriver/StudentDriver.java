
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Project02");
        
        //open file to read
        int numOfStu = 0;
        File inputFile = new File("input.csv");
        Scanner input = new Scanner(inputFile);
        
        //ask for user input
        System.out.println("Enter the no of UG students: ");
        int ugstu = input.nextInt();
        
        System.out.println("Enter the no of Graduate students: ");
        int gradstu = input.nextInt();
        
        System.out.println("Enter the no of online students: ");
        int onstu = input.nextInt();
        
        //create array (the assignment gave an example to format it like this, but I feel like an ArrayList would make more sense?)
        StudentFees[] students = new StudentFees[ugstu + gradstu + onstu];
        
        //put information into the array
        while(input.hasNext()){
            if(numOfStu < ugstu){
                students[numOfStu] = new UGStudent(input.split(","));
            }
            else if(numOfStu < gradstu){
                students[numOfStu] = new GraduateStudent(input.split(","));
            }
            else{
                students[numOfStu] = new OnlineStudent(input.split(","));
            }
            
            numOfStu ++;
        }
    

}
}
