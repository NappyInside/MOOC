/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

import java.util.Scanner;
import nhlstats.NHLStatistics;

/**
 *
 * @author aminiscloux
 */
public class NHL {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 players by penaltys");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Sydney Crosby statistics");
        NHLStatistics.searchByPlayer("Sydney Crosby"); 
        
        System.out.println("PHI statistics");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Players of ANA");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
        
    }    
}
