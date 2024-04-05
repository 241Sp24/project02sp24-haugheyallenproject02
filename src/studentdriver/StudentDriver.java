
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Project02");
    
        // Varablies Undergraduate Students details, Graduate Students details, and Online Students details
        int totalUGStudents = 0;
        double totalUGStudentFees = 0;
        double totalUGStudentScholarship = 0;
        double totalUGStudentCourses = 0;
        
        // GraduateStudent
        int totalGraduateStudent = 0;
        double totalGraduateStudentFees = 0;
        double totalGraduateStudentScholarship = 0;
        double totalGraduateStudentCourses = 0;
        
        // Online Student
        int totalOnlinetudents = 0;
        double totalOnlineStudentFees = 0;
        
        //open file to read
        int numOfStu = 0;
        File inputFile = new File("input.csv");
        Scanner input = new Scanner(inputFile);
        
        //ask for user input
        Scanner userInput = new Scanner(System.in);
        
        // Header informtion for project
        System.out.print("Enter the no of UG students: ");
        int ugstu = userInput.nextInt();
        
        // Header informtion for project
        System.out.print("Enter the no of Graduate students: ");
        int gradstu = userInput.nextInt();
        
        // Header informtion for project
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
        
        System.out.println(""); // Space
        // Undergraduate Header
        System.out.println("**********Undergraduate students list**********");
        // Crate a loop that will print out the Undergraduate Student infoation
        for (StudentFees student : students) {
            if (student instanceof UGStudent) {
                System.out.println(student);
                System.out.println("");
            }
    }
        
        // Graduate Header
        System.out.println("**********Graduate students list**********");
        // Crate a loop that will print out the Graduate Student infoation 
        for (StudentFees student : students) {
            if (student instanceof GraduateStudent) {
                System.out.println(student);
                System.out.println("");
            }
    }
        
        // Online Header
        System.out.println("**********Online students list**********");
        // Crate a loop that will print out the Online Student infoation 
        for (StudentFees student : students) {
            if (student instanceof OnlineStudent) {
                System.out.println(student);
                System.out.println("");
            }
    }
    
   
    
    
}
}
