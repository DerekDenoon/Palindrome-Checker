import java.util.Scanner;
public class Palindrome {
    static String wordOne;
    static String wordTwo;
    static String wordThree;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        wordOne = input.nextLine();
        System.out.println("Enter a second word");
        wordTwo = input.nextLine();
        System.out.println("Enter a third word");
        wordThree = input.nextLine();
        // summary
        output(palindromeCheck(wordOne,wordTwo,wordThree));
    }
    public static boolean[] palindromeCheck(String wordOne, String wordTwo, String wordThree) {

        String[] words = {wordOne,wordTwo,wordThree};
        boolean[] palin = new boolean[3];
        for (int i = 0; i < 3; i++) {
            int low = 0;
            int high = words[i].length() - 1;
            palin[i] = true;
            while (low < high) {
                if (words[i].charAt(low) != words[i].charAt(high)) {
                    palin[i] = false;
                    break;
                }else{
                low++;
                high--;
                }
            }
        }
        return  palin;
    }
    public static void output(boolean[] palin){
        System.out.println("\nPalindrome Checker Summary");
        if(palin[0]){
            System.out.println(wordOne + " is a palindrome");
        }else{
            System.out.println(wordOne + " is not a palindrome");
        }
        if(palin[1]){
            System.out.println(wordTwo + " is a palindrome");
        }else{
            System.out.println(wordTwo + " is not a palindrome");
        }
        if(palin[2]){
            System.out.println(wordThree + " is a palindrome");
        }else{
            System.out.println(wordThree + " is not a palindrome");
        }
    }
}
