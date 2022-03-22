public class Main {

    public static void main(String[] args) {
        String lowerCase = "Lower case: ";
        String upperCase = "Upper case: ";
        String rdmDigit = "Random digit: ";
        String rdmChar = "Random char: ";
        RandomCharacter rc = new RandomCharacter();
        for (int i = 0; i < 15; i++){
            lowerCase += rc.getRandomLowerCaseLetter();
            upperCase += rc.getRandomUpperCaseLetter();
            rdmDigit += rc.getRandomDigitCharacter();
            rdmChar += rc.getRandomCharacter();
        }

        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(rdmDigit);
        System.out.println(rdmChar);
    }
}
