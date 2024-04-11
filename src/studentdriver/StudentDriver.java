
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Project02");
    
        // Varablies UGStudents details, Graduate Students details, and Online Students details
        double totalUGStudentFees = 0;
        double totalUGStudentScholarship = 0;
        double totalUGStudentCourses = 0;
        
        // GraduateStudent
        double totalGraduateStudentFees = 0;
        double totalGraduateStudentScholarship = 0;
        double totalGraduateStudentCourses = 0;
        
        //Online Student
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
                
                totalUGStudentFees += students[numOfStu].getPayableAmount();
                
                if(hasScholarships == true){
                    totalUGStudentScholarship += 1;
                }
                
                totalUGStudentCourses += coursesEnrolled;
                
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
                
                totalGraduateStudentFees += students[numOfStu].getPayableAmount();
                
                if(gradassist == true){
                    totalGraduateStudentScholarship += 1;
                }
                
                totalGraduateStudentCourses += coursesEnrolled;
              
            }
            else{
                int id = Integer.parseInt(params[0]);
                String name = params[1];
                boolean enrolled = Boolean.parseBoolean(params[2]);
                int months = Integer.parseInt(params[3]);
                students[numOfStu] = new OnlineStudent(name, id, enrolled, months);
                
                totalOnlineStudentFees += students[numOfStu].getPayableAmount();
            }
            
            numOfStu ++;
        }
        
        // Find the average and other information
        double avgUGStudentFee = totalUGStudentFees / ugstu;
        double avgGraduateStudentFee = totalGraduateStudentFees / gradstu;
        double avgOnlineStudentFee = totalOnlineStudentFees / onstu;
        double scholarshipCount = totalUGStudentScholarship;
        double graduateAssistantshipCount = totalGraduateStudentCourses - 10; 
    
        System.out.println(""); // Space
        // Undergraduate Header
        System.out.println("**********Undergraduate students list**********");
        // Crate a loop that will print out the Undergraduate Student infoation
        for (StudentFees s : students) {
            if (s instanceof UGStudent) {
                System.out.println(s);
                System.out.println("");
            }
    }
        // Undergraduate Students details
        //System.out.println("Average Students fee: " + );
        
        // Graduate Header
        System.out.println("**********Graduate students list**********");
        // Crate a loop that will print out the Graduate Student infoation 
        for (StudentFees s : students) {
            if (s instanceof GraduateStudent) {
                System.out.println(s);
                System.out.println("");
            }
    }
        
        // Online Header
        System.out.println("**********Online students list**********");
        // Crate a loop that will print out the Online Student infoation 
        for (StudentFees s : students) {
            if (s instanceof OnlineStudent) {
                System.out.println(s);
                System.out.println("");
            }
    }
    // Print Undergraduate Students details
    System.out.println("**********Undergraduate Students details**********");
    System.out.printf("Average Students fee: %.1f%n", avgUGStudentFee);
    System.out.printf("Scholarship count: %d%n", (int) scholarshipCount);
    System.out.printf("Total number of courses: %d%n" , (int) totalUGStudentCourses);

    // Print Graduate Students details
    System.out.println("\n**********Graduate Students details**********");
    System.out.printf("Average Students fee: %.2f%n" , avgGraduateStudentFee);
    System.out.printf("Graduate Assistantship count: %d%n" , (int) graduateAssistantshipCount);
    System.out.printf("Total number of courses: %d%n" , (int) totalGraduateStudentCourses);

    // Print Online Students details
    System.out.println("\n**********Online Students details**********");
    System.out.printf("Average Students fee: %.2f%n" , avgOnlineStudentFee);

    
    
    
}
}
