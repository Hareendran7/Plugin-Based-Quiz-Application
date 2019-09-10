 import java.nio.file.*;

//Author  : S.Hareendran , ID : 19508409
//Purpose : To load instances of plugins

//Reference : SEC - Worksheet 4
public class PluginLoader extends ClassLoader {
   
    public Quiz loadPlugin(String fname) throws ClassNotFoundException
    {
        try
        {
            byte[] classData = Files.readAllBytes(Paths.get(fname));
            Class<?> cls = defineClass(null, classData, 0, classData.length);
            return (Quiz) cls.newInstance();
        }
        catch(Exception e)
        {
            throw new ClassNotFoundException("Could not load " + fname + ": " + e.getMessage());
        }
    }
    
     public QuestionType loadPlugin1(String fname) throws ClassNotFoundException
    {
        try
        {
            byte[] classData = Files.readAllBytes(Paths.get(fname));
            Class<?> cls = defineClass(null, classData, 0, classData.length);
            return (QuestionType) cls.newInstance();
        }
        catch(Exception e)
        {
            throw new ClassNotFoundException("Could not load " + fname + ": " + e.getMessage());
        }
    }
}
//End of Reference
    

