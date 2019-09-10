//Author  : S.Hareendran , ID : 19508409
//Purpose : QuestionType interface to be implemented by specific QuestionTypePlugin

public interface QuestionType {
    
    public String name();
    
    public void addQuestions(String s);
    
    public String removeQuestions();

    public String peekQuestion();
        
    public void addAnswers(String s2[]);
        
    public String [] removeAnswers();
       
    public void addCorrectAnswer(String s3);
 
    public String removeCorrectAnswer();
        
    
}
