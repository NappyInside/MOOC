/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.Scanner;

/**
 *
 * @author aminiscloux
 */
public class Input {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type an integer : ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number : ");
        int y = Integer.parseInt(reader.nextLine());
        
        System.out.println("Sum of the numbers : " + (x+y));
        System.out.println("Division : "+ (x*1.0/y));
        
        System.out.print("Type the radius : ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference of the circle : " + (2*Math.PI*radius));
        System.out.println("The bigger number of the numbers given was : " + Math.max(x, y));
        
        System.out.print("Type your name1 : ");
        String name1 = reader.nextLine();
        
        System.out.print("Type an age1 : ");
        int age1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name2 : ");
        String name2 = reader.nextLine();        
        
        System.out.print("Type an age2 : ");
        int age2 = Integer.parseInt(reader.nextLine()); 
        
        System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
        
    }    
}
