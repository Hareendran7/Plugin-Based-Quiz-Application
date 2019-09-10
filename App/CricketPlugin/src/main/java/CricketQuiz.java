
import java.util.HashMap;
import java.util.Map;

//Author  : S.Hareendran , ID : 19508409
//Purpose : Contains questions, answers of a particular quiz and contains run method of the quiz

public class CricketQuiz implements Quiz {
    PluginLoader plugLoad = new PluginLoader();

//Purpose : Creation of question string, optional answer array and correct answer string
    
        String question1 = "What color is a traditional cricket ball?";
        String [] answer1 = {"Black" ,"Orange", "Red"};
        String correctAnswer1 = "Red";
        
        String question2 = "What color uniforms may be worn during a red ball cricket game?";
        String [] answer2 = {"White" ,"Red", "Black"};
        String correctAnswer2 = "White";
        
        String question3 = "What is the name of the horizontal element of a cricket wicket?";
        String [] answer3 = {"Goal" ,"Stump", "Bail"};
        String correctAnswer3 = "Stump";
        
        String question4 = "What is the result of a cricket bowler overstepping his mark?";
        String [] answer4 = {"One Ball" ,"No Ball", "Lost Ball"};
        String correctAnswer4 = "No Ball";
        
        String question5 = "In cricket, a wide results in what for the batting team?";
        String [] answer5 = {"One Run" ,"Three Runs", "Two Runs"};
        String correctAnswer5 = "One Run";
      
        String question6 = "MCQEND";

        
        String question7 = "Which country won the World Cup final of 1999?";
        String correctAnswer7 = "Australia";
        
        String question8 = "What is the standard number of overs in an ODI?";
        String correctAnswer8 = "50";
        
        String question9 = "Which country won the T20 World Cup final of 2016?";
        String correctAnswer9 = "West Indies";
        
        String question10 = "OneWordEND";
        
    
    @Override
    public String name() {
        return "Cricket";
    }
    

    
     public void runQuiz(){
       
//Purpose : Creation and insertion of instances of Quesion Type plugins
       try{
         
            QuestionType mcqPlugin =  plugLoad.loadPlugin1("McqPlugin/build/classes/java/main/McqQuestionType.class");
            QuestionType oneWordPlugin =  plugLoad.loadPlugin1("OneWordPlugin/build/classes/java/main/OneWordQuestionType.class");
         
            QuizMap.QuestionTypePluginMap.put(mcqPlugin.name(),mcqPlugin);
            QuizMap.QuestionTypePluginMap.put(oneWordPlugin.name(),oneWordPlugin);
        }
        catch(ClassNotFoundException e){
            System.out.println("The class could not be found");
        }
         

        QuestionType a1 =  QuizMap.QuestionTypePluginMap.get("MCQ");
        QuestionType a2 =  QuizMap.QuestionTypePluginMap.get("OneWord");
  
        
//Purpose : Adds questions, optional answers, correct answers to Mcq Question Type
        a1.addQuestions(question1);
        a1.addQuestions(question2);
        a1.addQuestions(question3);
        a1.addQuestions(question4);
        a1.addQuestions(question5);
        a1.addQuestions(question6);
       
        a1.addAnswers(answer1);
        a1.addAnswers(answer2);
        a1.addAnswers(answer3);
        a1.addAnswers(answer4);
        a1.addAnswers(answer5);
       
        a1.addCorrectAnswer(correctAnswer1);
        a1.addCorrectAnswer(correctAnswer2);
        a1.addCorrectAnswer(correctAnswer3);
        a1.addCorrectAnswer(correctAnswer4);
        a1.addCorrectAnswer(correctAnswer5);
        
        
 //Purpose : Adds questions, correct answers to One Word Question Type
        a2.addQuestions(question7);
        a2.addQuestions(question8);
        a2.addQuestions(question9);
        a2.addQuestions(question10);
         
        a2.addCorrectAnswer(correctAnswer7);
        a2.addCorrectAnswer(correctAnswer8);
        a2.addCorrectAnswer(correctAnswer9);

        
     }
          
        
    }
    

