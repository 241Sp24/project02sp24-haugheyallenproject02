
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
    public String toString(){
        return "Student name: " + super.getStudentName() + 
               "\nStudent id: " + super.getStudentID() + 
               "\nEnrolled: " + super.isIsEnrolled() +
               "\nNo of months: " + this.noOfMonths +
               "\nPayable amount: " + this.getPayableAmount();
    }
}
