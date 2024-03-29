
package studentdriver;

public class UGStudent {
    // Private instance varibles 
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITONAL_FEE = 820.70;
    
    // UGStudent
    public UGStudent(String studentName, int StudentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        
    }
    // HasScholarship method
    public boolean isHasScholarship(){
        // I might need to add smoe a lection structures here
        return this.hasScholarship;
    }
    // Getters for the UGStudent class
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    public double getPayableAmount(){
        // Tuition fee amount calculated 
        double tuitionCost = (coursesEnrolled * ADDITONAL_FEE);
        double totalCost = (tuitionCost + ADDITONAL_FEE);
        // if statmente that subtacts the schoalrship amount
        if(hasScholarship) {
            totalCost -= scholarshipAmount;
        }
        return totalCost;
    }
    // toString method
    public String toString(){
        return "";
    }
    
}
