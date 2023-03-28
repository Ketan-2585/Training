//9. Write a  Program to check if a string contains any special character?

package testing;

public class SpecialChar {

	public static boolean specialChar(String str) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for (int i = 0; i < str.length(); i++) {
            if (specialChars.contains(String.valueOf(str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "I am #tester";
        boolean specialChar = specialChar(str);
        
        if(specialChar==true)
        {
        	System.out.println("string comtains special character");
        }
        else 
        {
        	System.out.println("string doesnt contain speacial character");
        }
        
    }
}
