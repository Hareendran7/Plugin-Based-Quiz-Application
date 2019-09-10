
import java.util.LinkedList;
import java.util.Queue;

//Author  : S.Hareendran , ID : 19508409
//Purpose : Class to receive and store One Word questions and answers from a Quiz plugin 

public class OneWordQuestionType implements QuestionType {
 
//Purpose : Queues to store questions and answers
    public Queue<String> oneWordQuestions = new LinkedList<>();
    public Queue<String> correctAnswer1 = new LinkedList<>();
    
    @Override
    public String name() {
        return "OneWord";
    }

//Purpose : Receive questions from Quiz and store to the Queue
    @Override
    public void addQuestions(String s){
        
        oneWordQuestions .add(s);
    
    }
    
//Purpose : Access question from Queue
    @Override
    public String removeQuestions(){
        
        String question= oneWordQuestions.remove();
        return question;

    }

//Purpose : View question on top of queue
    @Override
     public String peekQuestion(){
        
        String peek = oneWordQuestions.peek();
        return peek;
        
    }

 //Purpose : Add correct answer to queue     
    @Override
     public void addCorrectAnswer(String s3){
        
       correctAnswer1.add(s3);
    
    }
    
//Purpose : Access correct answer  from queue    
    @Override
    public String removeCorrectAnswer(){
        
        String correct=correctAnswer1.remove();
        return correct;

    }

//Purpose : Not necessary for this Question-Type
    @Override
    public void addAnswers(String[] s2) {
       
    }

//Purpose : Not necessary for this Question-Type
    @Override
    public String[] removeAnswers() {
        
        String b[] = {" "};
        return b;
    }
}
