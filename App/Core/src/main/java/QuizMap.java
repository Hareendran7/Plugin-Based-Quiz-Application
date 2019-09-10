import java.util.HashMap;
import java.util.Map;

//Author  : S.Hareendran , ID : 19508409
//Purpose : Maps to contain instances of all Quizes and Question Types to be accessed from anywhere

public class QuizMap {
      
    static Map<String,Quiz> QuizPluginMap = new HashMap<>();
    
    public static Map<String,QuestionType> QuestionTypePluginMap = new HashMap<>();
    
}
