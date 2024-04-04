
package studentdriver;

import java.util.*;
import java.io.*;
public class StudentDriver {

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Project02");
        
        //open file to read
        int numOfStudents = 0;
        File inputFile = new File("input.csv");
        Scanner input = new Scanner(inputFile);
        
        //determine length of array
        while(input.hasNext()){
            numOfStudents += 1;
        }
        
        //create array (the assignment gave an example to format it like this, but I feel like an ArrayList would make more sense?)
        StudentFees[] students = new StudentFees[numOfStudents];
        
        //put information into the array
        while(input.hasNext()){
            //we need to figure out how to determine which student type is which to be able to differentiate which class to use
        }
    

}
}
