/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Davey McGinnis
 * dmcginnis@temple.edu
 */
//need to print steps
//accept int argument for numSteps
//accept int argument for length
//accept int argument for height
//gonna be a void
//problem is making it so after the top and side of stair
//is printed, spaces ((lenth+1)*(stepCount-1))
//maybe nested methods? nested methods.
import java.util.Scanner;
public class PrintSteps {
    public static void topStep(int width, int width2){
        printSpace(width2);                 //starts @ 0, no spaces on first step
        for(int i=0;i<width;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void sideStep(int height, int width, int width2){
        for(int i=0;i<height;i++){
            printSpace(width2);             //happens every new line
            for(int j=0;j<width;j++){
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void printSpace(int width2){
        for(int i=0;i<width2;i++){
            System.out.print(" ");
        }
    }
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Number of steps?");
        int numSteps = kb.nextInt();
        System.out.println("Width?");
        int width = kb.nextInt();
        System.out.println("Height?");
        int height = kb.nextInt();
        int width2 = 0;                 //copy of width i can manipulate
        
        for(int i=0;i<numSteps;i++){
            topStep(width, width2);
            sideStep(height, width, width2);
            width2 += width;
        }
    }
}
