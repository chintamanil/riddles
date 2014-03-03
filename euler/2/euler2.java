/*

http://projecteuler.net/problem=2

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, …

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/


public class euler2 {

	public static int fibbonaci(int n){
        if (n == 0) {
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return fibbonaci(n-1) + fibbonaci(n-2);
        }
    }
     
     public static void main(String []args){
        int max = 4000000;
        int sum = 0;
        int i = 0;
        
        while(true){
            int fib = fibbonaci(i);
            if (fib>max){
                break;
            }
            if(fib%2==0){
                sum = sum+fib;
            }
            i++;
        }
        System.out.println(sum);
     }

}