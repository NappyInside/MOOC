/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

/**
 *
 * @author aminiscloux
 */
public class Variable {
     /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            int chickens = 3 ;
            double bacon = 5.5 ;
            String tractor = "There is none!";
            
            chickens = 9000 ;
            System.out.println("Chickens:");
            System.out.println(chickens);
            bacon = 0.1 ;
            System.out.println("Bacon (kg):");
            System.out.println(bacon);
            tractor = "Zetor"; 
            System.out.println("A tractor:");
            System.out.println(tractor);
            System.out.println("");
            System.out.println("In a nutshell:");
            System.out.println(chickens + "\n" + bacon + "\n" + tractor);
            

            
        }
    
}
