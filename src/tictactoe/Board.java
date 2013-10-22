/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author Jeremy
 */
public class Board {
    private ArrayList<Spot> spots;
    
    public Board() {
        spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            spots.add(new Spot());
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < spots.size() ; i++) {
            if (i % 3 == 2) {
                System.out.println(spots.get(i).getSymbol());
            }else if (i % 3 == 1) {
                System.out.print("|" + spots.get(i).getSymbol() + "|");
            }else if (i % 3 == 0) {
                System.out.print(spots.get(i).getSymbol());
            }
        }
    }
    
}
