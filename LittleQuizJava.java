/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littlequiz.java;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class LittleQuizJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int q1, q2, q3, count;
        count = 0;
        
        System.out.print("Who's the smartest between? \n 1. Batman \n 2. SpiderMan \n 3. IronMan\n");
        q1 = keyboard.nextInt();
        if(q1 == 3){
            System.out.println("exactly");
            count++;
        }else{
            System.out.println("He's smart but not the smartest. IronMan actually made A.I.");
        }
        
        System.out.print("What the fastest from the factory? \n 1. GTr \n 2. Z06 \n 3. hellcat challanger\n");
        q2 = keyboard.nextInt();
        if(q2 == 3){
            System.out.println("correct, with nothing aftermarket it is the fastest");
            count++;
        }else{
            System.out.println("wrong, but if you really care to know I'd take the skyline\n");
        }
        
        System.out.print("Whats the most important thing in life? \n 1. family \n 2. helping others \n 3. enjoying the time you have\n");
        q3 = keyboard.nextInt();
        if(q3 == 2){
            System.out.println("giving is what makes life worth while\n");
            count++;
        }else{
            System.out.println("you didn't pick my answer, but hey live your own life.\n");
        }
        
        System.out.println("Overall you got " + count + " right out of 3.");
        
    }
    
}
