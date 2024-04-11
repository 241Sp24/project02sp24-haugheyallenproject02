
package studentdriver;

public class UGStudent extends StudentFees{
    // Private instance varibles 
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITONAL_FEE = 820.70;
    
    // UGStudent
    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        
    }
    // HasScholarship method
    public boolean isHasScholarship(){
        // I might need to add some a selection structures here
        return this.hasScholarship;
    }
    // Getters for the UGStudent class
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    @Override
    public double getPayableAmount(){
        // Tuition fee amount calculated 
        double tuitionCost = (((super.getCREDITS_PER_COURSE() * coursesEnrolled * super.getPER_CREDIT_FEE())));
        double totalCost = (tuitionCost + ADDITONAL_FEE);
        // if statment that subtracts the schoalrship amount
        if(hasScholarship) {
            totalCost -= scholarshipAmount;
        }
        return totalCost;
    }
    // toString method
    @Override
    public String toString(){
        return String.format( "Student name: %s%n" + "Student id: %d%n" + "Enrolled: %b%n" + "Scholarship: %b%n" + "Scholarship amount: %.2f%n" + "Courses enrolled: %d%n" + "Payable amount: %.2f",
            super.getStudentName(), super.getStudentID(), super.isIsEnrolled(), this.isHasScholarship(), this.getScholarshipAmount(),
            this.getCoursesEnrolled(), this.getPayableAmount());
    }
    
}
