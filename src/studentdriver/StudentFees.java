
package studentdriver;

// The studentfees clas is an "Abstract class"
public abstract class StudentFees {
    // Instance variabes
    private String studentName;
    private int studentID;
    private boolean isEnrolled;
    private int CREDITS_PER_COURSE = 3;
    private double PER_CREDIT_FEE = 543.50;
    
    // Stedent fees class usind "this" statment 
    public StudentFees(String studentName, int studentID, boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
        this.studentName = studentName;
        this.studentID = studentID;
    }
    // Getters and setters for the studentFees class
    public String getStudentName(){
        return studentName;
    }
    public int getStudentID(){
        return studentID;
    }
    public boolean isIsEnrolled(){
        return isEnrolled;
    }
    public int getCREDITS_PER_COURSE(){
        return CREDITS_PER_COURSE;
    }
    public double getPER_CREDIT_FEE(){
        return PER_CREDIT_FEE;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void setIsEnrolled(boolean isEnrolled){
        this.isEnrolled = isEnrolled;
    }
    // Apstact method getPayableAmount 
    abstract double getPayableAmount();
    
    // toString method
    public String toString(){
        return "Student name: " + this.getStudentName() +
                "\nStudent id: " + this.getStudentID() +
                "\nEnrolled: " + isIsEnrolled () +
                "\nPayable amount: " + getPayableAmount()  ;
                //"\nScholarship: " + hasScholarship () + 
                //"\nScholarship amount: " + scholarshipAmount +
                //"\nCourses enrolled: " + getCoursesEnrolled () +
                
    }
    
    
}
