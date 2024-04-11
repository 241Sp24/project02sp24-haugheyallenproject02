
package studentdriver;

public class GraduateStudent extends StudentFees{
    //instance variables
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;
    
    //constuctors
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled){
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    //is graduate assistant -- idk if i need to do something differetn for this one
    public boolean isIsGraduateAssistant(){
        return this.isGraduateAssistant;
    }
    
    //getters
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    
    @Override
    public double getPayableAmount(){
        return (super.getCREDITS_PER_COURSE()) + (this.coursesEnrolled) * (super.getPER_CREDIT_FEE());
    }
    
    //toString
    @Override
    public String toString(){
        return String.format("Student name: %s%n" + "Student id: %d%n" + "Enrolled: %b%n" + "Graduate assistant: %b%n" +
            "Graduate assistant type: %s%n" + "Courses enrolled: %d%n" + "Payable amount: %.2f", super.getStudentName(),
            super.getStudentID(), super.isIsEnrolled(), this.isIsGraduateAssistant(), this.graduateAssistantType,
            this.coursesEnrolled, this.getPayableAmount());
    }
    
}
