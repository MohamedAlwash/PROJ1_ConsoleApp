package src;


public class ExamResult {

    private ExamTypes examTypes;
    private Boolean result;

    public ExamResult(ExamTypes examTypes) {
        this.examTypes = examTypes;
    }

    public Exam getExam() {
        return exam;
    }

    private Exam exam = new Exam();


    public ExamTypes getExamTypes() {
        return examTypes;
    } //Getter examtypes

    public Boolean getResult() {
        return result;
    } //Getter result

    public void setResult(Boolean result) {
        this.result = result;
    } //Setter result



}
