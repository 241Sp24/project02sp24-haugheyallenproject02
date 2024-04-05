
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
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the no of UG students: ");
        int ugstu = userInput.nextInt();
        
        System.out.print("Enter the no of Graduate students: ");
        int gradstu = userInput.nextInt();
        
        System.out.print("Enter the no of online students: ");
        int onstu = userInput.nextInt();
        
        //create array
        StudentFees[] students = new StudentFees[ugstu + gradstu + onstu];
        
        //put information into the array
        while(input.hasNext() && numOfStu < ugstu + gradstu + onstu){
            String line = input.nextLine();
            String[] params = line.split(",");
            
            if(numOfStu < ugstu){
                int id = Integer.parseInt(params[0]);
                String name = params[1];
                boolean enrolled = Boolean.parseBoolean(params[2]);
                int coursesEnrolled = Integer.parseInt(params[3]);
                boolean hasScholarships = Boolean.parseBoolean(params[4]);
                double scholAmount = Double.parseDouble(params[5]);
                
                students[numOfStu] = new UGStudent(name, id, enrolled, hasScholarships, scholAmount, coursesEnrolled);
            }
            else if(numOfStu < gradstu + ugstu){
                int id = Integer.parseInt(params[0]);
                String name = params[1];
                boolean enrolled = Boolean.parseBoolean(params[2]);
                int coursesEnrolled = Integer.parseInt(params[3]);
                boolean gradassist = Boolean.parseBoolean(params[4]);
                
                if(params.length == 6){
                    String type = params[5];
                    students[numOfStu] = new GraduateStudent(name, id, enrolled, gradassist, type, coursesEnrolled);
                }
                else{
                    students[numOfStu] = new GraduateStudent(name, id, enrolled, gradassist, coursesEnrolled);
                }
                
                
            }
            else{
                int id = Integer.parseInt(params[0]);
                String name = params[1];
                boolean enrolled = Boolean.parseBoolean(params[2]);
                int months = Integer.parseInt(params[3]);
                
                students[numOfStu] = new OnlineStudent(name, id, enrolled, months);
            }
            
            numOfStu ++;
        }
    

}
}
