
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
        return super.getCREDITS_PER_COURSE() * super.getPER_CREDIT_FEE() + this.ADDITIONAL_FEES;
    }
    
    //toString
    public String toString(){
        return "Student name: " + super.getStudentName() + 
               "\nStudent id: " + super.getStudentID() + 
               "\nEnrolled: " + super.isIsEnrolled() + 
               "\nGraduate assistant: " + this.isIsGraduateAssistant() + 
               "\nGraduate assistant type: " + this.graduateAssistantType + 
               "\nCourses enrolled: " + this.coursesEnrolled + 
               "\nPayable amount: " + this.getPayableAmount();
    }
    
}
