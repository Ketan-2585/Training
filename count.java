//8. Write a program to find number of duplicate(repeated) character in the string.?


package testing;

public class count {

    public static void main(String[] args) {
    	String s = "Hellomummy";

        int[] charCount = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c]++;
        }
        
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char)i + "-" + charCount[i]);
            }
        }
    }
}









