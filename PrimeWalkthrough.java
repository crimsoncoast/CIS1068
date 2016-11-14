
package hw6;

/**
 *
 * @author Davey McGinnis
 * dmcginnis@temple.edu
 */
//to check whether a number is prime
//use the modulo operator to check its factors
//going from 2 to the number/2
//if mod ever = 0, number isn't prime
//if never, print the number
public class PrimeWalkthrough {
    public static boolean primeCheck(int n){
        boolean isPrime = true;
        for(int i=2;i<n;i++){   //checks if an int is prime
            if(n%i==0)
                return false;
        }
        return isPrime;
    }
    public static void main(String [] args){
        for(int i=2; i<=100; i++){              //1 isn't prime
            if(primeCheck(i)){                  //method is the boolean
                System.out.println(i);
            }
        }
    }
}
