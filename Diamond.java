
package techpractice;

/**
 *
 * @author Davey McGinnis
 */
import java.util.Scanner;

public class Diamond {
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);    //prints a diamond
        int n = kb.nextInt();                   //that is 2n tall
        int out = n-1;                          //and 2n wide
        int in = 0;                             
        
        for(int i=0;i<n;i++){               //top half, runs n times
            for(int j=0;j<out;j++){         //n-1 spaces outside
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=0;k<in;k++){
                System.out.print("  ");     //0,2,4,6,etc...
            }
            System.out.print("*");
            out--;
            in++;
            System.out.println();
        }
        out = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<out;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<in;k++){
                System.out.print("  ");
            }
            System.out.print("*");
            out++;                          //reversed
            in--;
            System.out.println();
        }
    }
}
