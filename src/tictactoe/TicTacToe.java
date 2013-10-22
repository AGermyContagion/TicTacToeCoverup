/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.ArrayList;
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
        ArrayList<Player> players = new ArrayList<>();
        int currentPlayer = 0;
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
            players.add(new Player(name1,"X", 5, 1, 1));
            players.add(new Player(name2,"O", 5, 1, 1));
        } else {
            players.add(new Player(name1, "O", 5, 1, 1));
            players.add(new Player(name2, "X", 5, 1, 1));
        }
        
        while(true) {
            int location;
            System.out.println("-------------------------------------------------------------------");
            board.printBoard();
            System.out.println( players.get(currentPlayer).getName() + "'s Turn. You have " + players.get(currentPlayer).getMedium() + " medium piece and " + players.get(currentPlayer).getLarge() + " large piece left");
            System.out.print("\nEnter your move(1 - 9): ");
            location = in.nextInt();
            location = location - 1;
            System.out.println("\n");
            board.changeSpot(players.get(currentPlayer), players.get(currentPlayer).getPieces().get(0), location);
            currentPlayer = switchPlayer(players, currentPlayer);
        }
    }
    
    /**
     *
     * @param ps The list of players
     * @param playerIndex The index in p that is currently being used. The index starting out from.
     * @return Returns an integer value representing an index for the new player.
     */
    public static int switchPlayer(ArrayList<Player> ps, int playerIndex) {
        if (playerIndex < ps.size() - 1) {
            return playerIndex + 1;
        } else {
            return 0;
        }
        
    }
    
}