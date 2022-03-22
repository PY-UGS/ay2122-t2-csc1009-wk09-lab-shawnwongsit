import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;


public class RandomCharacterTest{

    @Test
    public void getRandomLowerCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'a');
        assertTrue(Character.isLowerCase(c));
        //return c;
    }

    @Test
    public void getRandomUpperCaseLetter(){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        assertTrue(Character.isUpperCase(c));
        //return c;
    }

    @Test
    public void getRandomDigitCharacter(){
        Random r = new Random();
        int i = r.nextInt(10);
        assertTrue(i == (int) i);
        try{
            assertFalse(i +"",checkPrimeNumber(i));//Check if number is a prime number
        }catch(AssertionError e){
            System.out.println("It is not a prime number");
        }
        //return i;
    }

    @Test
    public void getRandomCharacter(){
        Random r = new Random();
        char c = (char)(r.nextInt(58) + 'A');
        assertTrue(c == (char) c);
        //return c;
    }

    private boolean checkPrimeNumber(int num){
        System.out.println(num);
        for(int i = 2; i <= num/2;i++){
            if(num%i==0){
                return true;
            }
        }
        return false;
    }
    
}