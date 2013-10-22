/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Jeremy
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Player player1;
        Player player2;
        String name1;
        String name2;
        String desicion;
        Board board = new Board();
        
        // Getting initial input from the user.
        System.out.print("Player 1, what is your name? ");
        name1 = in.nextLine();
        System.out.print("Player 2, what is your name? ");
        name2 = in.nextLine();
        System.out.print("Player 1, what symbol do you want to be? (X or O): ");
        desicion = in.nextLine();
        System.out.println();
        
        if (desicion.equalsIgnoreCase("x")) {
            player1 = new Player(name1,"X", 5, 1, 1);
            player2 = new Player(name2, "O", 5, 1, 1);
        } else {
            player1 = new Player(name1, "O", 5, 1, 1);
            player2 = new Player(name2, "X", 5, 1, 1);
        }
        
        board.printBoard();
    }
    
}