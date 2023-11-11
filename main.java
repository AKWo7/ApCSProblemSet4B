
public class main
{
    
    public static void main(String[] args){
        String palindrome = "racecar";
        System.out.println("Is " + palindrome + " a palindrome?");
        System.out.println(checkPalindrome(palindrome));
        System.out.println();
        
        String pigL = "Hullo I'm peppa pig";
        System.out.println("Normal Sentence: " + pigL);
        System.out.print("Pig Latin translation: ");
        wholePigSentence(pigL);
        System.out.println();
        
        int min = 100000;
        int max = 125000;
        System.out.println("Minimum: " + min + " Maximum: " + max);
        System.out.print("Number of strictly ascending numbers between " + min + " & " + max + " is: ");
        System.out.println(countAscending(min, max));
        System.out.println();
        
        int num = 5;
        System.out.println("The timestable for the number " + num + " is: ");
        timestable(num);
        System.out.println();
    }
    
    
    public static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        String onlyLetters = "";
        for (int i = 0; i < str.length(); i++){
        char letter = str.charAt(i);
        if(Character.isLetter(letter)){
            onlyLetters += letter;
        }
        }
        String backwards = "";
        for (int j = 0; j < onlyLetters.length(); j++){
        char back  = onlyLetters.charAt(onlyLetters.length() - 1 - j);
        backwards += back;
        }
        if(backwards.equals(onlyLetters)){
            return true;
        }
        return false;
    }


    public static String pigLatin(String str){
        if (str.length() < 2){
          return str; 
        }
        String front = str.substring(0,1);
        String back = str.substring(1);
        String complete = back + front + "ay";
        return complete;
    }
    
    public static void wholePigSentence(String str) {
        while (str.length() > 0) {
        int gap = str.indexOf(" ");
        if (gap < 0) {
          System.out.println(pigLatin(str));
          str = "";
        } 
        else 
        {
          String word = str.substring(0,gap);
          System.out.print(pigLatin(word) + " ");
          str = str.substring(gap+1);
        }
        }
    }

    public static int countAscending(int min, int max) {
    int count = 0;
        for (int i = min; i <= max; i++) {
        if (StrictlyAscending(i)) {
        count++;
        }
        }
        return count;
    }

    public static boolean StrictlyAscending(int num) {
        int lastDigit = num % 10;
        num = num / 10;
        while (num > 0) {
        int currentDigit = num % 10;
        if (currentDigit >= lastDigit) return false;
        lastDigit = currentDigit;
        num = num / 10;
        }
        return true;
    }

    public static void timestable(int num){
        String max = num*num+"";
        int amtofNum = max.length();
        for (int i = 0; i < num; i++) {
        for (int j = 0; j < num; j++) {
        Spaces(amtofNum, i*j);
        System.out.print(i*j);
        }
        System.out.println();
        }
    }
    
    public static void Spaces(int amtofNum, int num) {
        String currentNum = num+"";
        int i = amtofNum - currentNum.length();
        while (i >= 0) {
        System.out.print(" ");
        i--;
        }
    }
}

