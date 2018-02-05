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
public class Calcul {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int secondeMinute = 60 ;
        int minuteHeure = 60 ;
        int heureJour = 24 ;
        int jourAnnee = 365 ;
        int totalSecondeAnnee = secondeMinute * minuteHeure * heureJour * jourAnnee ;
        
        System.out.println("There are "+totalSecondeAnnee+" seconds in a year");
        
        
    }
}
