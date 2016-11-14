/**
 *
 * @author Davey McGinnis
 * dmcginnis@temple.edu
 */
//return type: int
//takes char and String(?) as argument
//for loop, for String length checking is charAt == given char argument
//somehow stop main if String has none of the given char

import java.util.Scanner;
public class StringWalkthrough {
    public static int charCount (String s, char c){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        char c = 'i';
        Scanner kb = new Scanner(System.in);
        int numOfI = 1;
        while(numOfI != 0){
            String s = kb.nextLine();
            System.out.println("Number of i: " + charCount(s, c));
            numOfI = charCount(s, c);
        }
    }
}
