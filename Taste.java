/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 * @author Davey McGinnis
 * dmcginnis@temple.edu
 */
public class Taste {
    public static void printSquare(int x, char a){
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    public static void printLine(int length, char b){
        for(int i=0;i<length;i++){
            System.out.print(b);
        }
        System.out.println();
    }
    public static void printTriangle(int height, char c){
        int space = height - 1;
        int body = 1;
        for(int i=0;i<height;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int k=0;k<body;k++){
                System.out.print(c);
            }
            space--;
            body += 2;
            System.out.println();
        }
    }
    public static void main(String [] args){
        char squareX = 'X';     //makes up first square
        char line = '-';        //makes up Line
        char triangle = 'u';    //makes up triangle
        char squareO = 'O';     //makes up second square
        
        printSquare(2, squareX);
        
        printLine(16, line);
        
        printTriangle(3, triangle);
        
        printSquare(2, squareO);
    }
}
