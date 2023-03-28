//5.Write a program which returns given number is prime or not.

package testing;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=43;
		boolean flag = true;
        if(n== 1 || n == 0) {
            flag = false;
        } else {
            for(int i=2; i<=n/2; i++) {
                if(n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n+ " is not a prime number.");
        }
    }
}


	
