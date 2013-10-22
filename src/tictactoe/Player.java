/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.util.ArrayList;

/**
 *
 * @author Jeremy Warren
 */
public class Player {
    final private String name;
    private int smallPieces;
    private int mediumPieces;
    private int largePieces;
    private ArrayList<String> pieces;
    private ArrayList<Point> moves;
    
    @Override public String toString()  {
        return this.name  + ":(" + this.pieces.get(2) + ": " + this.smallPieces + ", " + this.mediumPieces + ", " + this.largePieces + ", " +  this.moves + ")";
    }
    
    public Player() {
        this.name = "";
        this.smallPieces = 5;
        this.mediumPieces = 1;
        this.largePieces = 1;
        this.moves = new ArrayList<>();
    }
    
    /**
     * More useful constructor for Player
     * @param name The name of the instance
     * @param symbol The symbol that the user will use. Expects X or O.
     * @param small The number of small pieces that are allowed to be used by the user
     * @param medium The number of medium pieces that are allowed to be used by the user
     * @param large The number of large pieces that are allowed to be used by the user
     */
    public Player(String name, String symbol, int  small, int  medium, int  large) {
        this.name = name;
        this.smallPieces = small;
        this.mediumPieces = medium;
        this.largePieces = large;
        this.pieces = new ArrayList<>();
        if (!symbol.equalsIgnoreCase("X")) {
            this.pieces.add(".");
            this.pieces.add("o");
            this.pieces.add("O");
        } else {
            this.pieces.add("*");
            this.pieces.add("x");
            this.pieces.add("X");
        }
        this.moves = new ArrayList<>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addMove(Point move) {
        this.moves.add(move);
    }
    
    public void removeMove(Point move) {
        this.moves.remove(move);
    }
    
    public ArrayList<String> getPieces() {
        return this.pieces;
    }
    
    public ArrayList<Point> getMoves() {
        return this.moves;
    }
    
    public void usedSmall() {
        if (this.smallPieces > 0) {
            this.smallPieces = this.smallPieces - 1;
        }
    }
    
    public void usedMedium() {
        if (this.mediumPieces > 0) {
            this.mediumPieces = this.mediumPieces - 1;
        }
    }
    
    public void usedLarge() {
        if (this.largePieces > 0) {
            this.largePieces = this.largePieces - 1;
        }
    }
    
}