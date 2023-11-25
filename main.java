  
public class main
{
    
    public static void main(String[] args){
        String palindrome = "racecar";
        System.out.println("Is " + palindrome + " a palindrome?");
        System.out.println(checkPalindrome(palindrome));
        System.out.println();
        
        String pigL = "Hullo I am peppa pig";
        seperateSentence(pigL);
        
        int min = 100000;
        int max = 125000;
        strictlyAscending(min, max);
        
        timestable(5);
        
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
        if (str.length() < 3){
            return str;
        }
        String ordway = str.substring(1)+str.substring(0,1)+"ay";
        return ordway;
    }
    
    public static void seperateSentence(String sentence){
        String word = "";
        for (char i : sentence.toCharArray()){
            if (i != ' '){
                word += i;
            }
            else {
                System.out.print(pigLatin(word));
                System.out.print(" ");
                word = "";
            }
        }
        if (!word.isEmpty()){
            System.out.println(pigLatin(word));
        }
    }

    public static void strictlyAscending(int min, int max){
        int count = 0;
        for (int num = min; num < max; num++){
            int currentNum = num;
            boolean ascending = true;
                        
            while (currentNum > 9 && ascending) {
            int lastNum = currentNum % 10;
            currentNum/=10;
            int nextNum = currentNum%10;
            if (lastNum <= nextNum){
                    ascending = false;
            }
            }
            if (ascending){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static void timestable(int num){
        int max = num*num;
        int maxLen = String.valueOf(max).length() + 1;
        for (int i = 1; i<=num; i++){
            for (int j = 1; j<=num; j++){
                int answer = i*j;
                int answerLen = String.valueOf(answer).length();
                int spaces = maxLen - answerLen;
                System.out.print(answer);
                for (int k = 0; k<spaces; k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

