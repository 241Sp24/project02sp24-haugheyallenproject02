
package studentdriver;

public class GraduateStudent extends UGStudent{
    // Private instance varibles
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistant;
    private double ADDITIONAL_FEES = 645.45;
    
    // GraduateStudent class
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.graduateAssistant = graduateAssistant;
        this.ADDITIONAL_FEES = ADDITIONAL_FEES;
        this.isGraduateAssistant = isGraduateAssistant;
        
                
        
}
    
    
}
