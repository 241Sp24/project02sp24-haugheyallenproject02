
package studentdriver;

public class OnlineStudent extends StudentFees{
    //instance variables
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;
    
    //constructors
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths){
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }
    
    //get payable amount
    public double getPayableAmount(){
        return this.MONTHLY_FEE * this.noOfMonths;
    }
    
    //toString
    @Override
    public String toString(){
        return String.format("Student name: %s%n" + "Student id: %d%n" + "Enrolled: %b%n" + "No of months: %d%n" + "Payable amount: %.2f",
            super.getStudentName(), super.getStudentID(), super.isIsEnrolled(), this.noOfMonths, this.getPayableAmount());
    }
}
