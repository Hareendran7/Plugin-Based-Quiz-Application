import java.util.LinkedList;
import java.util.Queue;

//Author  : S.Hareendran , ID : 19508409
//Purpose : MCQ Question-Type Plugin to receive and store MCQ questions and answers from a Quiz plugin 

public class McqQuestionType implements QuestionType {
 
//Purpose : Queues to store questions and answers
    public Queue<String> mcqQuestions = new LinkedList<>();
    public Queue<String []> allAnswers = new LinkedList<>();
    public Queue<String> correctAnswer = new LinkedList<>();
    
    public String [] Answer;
    
     
    public McqQuestionType(){
  
    }
  
    @Override
    public String name() {
        return "MCQ";
    }

//Purpose : Receive questions from Quiz and store to the Queue
    @Override
    public void addQuestions(String s){
        
        mcqQuestions .add(s);
    
    }
    
//Purpose : Access question from Queue
    @Override
    public String removeQuestions(){
        
        String question= mcqQuestions.remove();
        return question;

    }
    
//Purpose : View question on top of queue
    @Override
    public String peekQuestion(){
        
        String peek =  mcqQuestions.peek();
        return peek;
        
    }
    
//Purpose : Add MCQ answer options in an array to a queue
    @Override
    public void addAnswers(String s2[]){
        
        allAnswers.add(s2);
    
    }
    
//Purpose : Access MCQ answer array from Queue
    @Override
    public String [] removeAnswers(){
        
        String  s2 []=allAnswers.remove();
        return  s2 ;

    }
     
 //Purpose : Add correct answer to queue
    @Override
    public void addCorrectAnswer(String s3){
        
       correctAnswer.add(s3);
    
    }
    
//Purpose : Access correct answer of a MCQ from queue
    @Override
    public String removeCorrectAnswer(){
        
        String correct=correctAnswer.remove();
        return correct;

    }

   
     
}

