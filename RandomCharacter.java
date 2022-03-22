
import java.util.Random;



public class RandomCharacter{

    
    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        return c;
    }

    
    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        return c;
    }

    
    public int getRandomDigitCharacter(){
        Random r = new Random();
        int i =(char) r.nextInt(10);
        return i;
    }

    
    public char getRandomCharacter(){
        Random r = new Random();
        char c = (char)(r.nextInt(58) + 'A');
        return c;
    }
    
}