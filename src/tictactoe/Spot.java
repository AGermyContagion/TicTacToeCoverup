/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

/**
 *
 * @author Jeremy
 */
class Spot {
    private String owner;
    private String symbol;
    
    public Spot() {
        this.owner = "";
        this.symbol = " "; // This is initialized as empty so that it will take up space if nobody is occupying the space
    }
    
    public Spot(Player p, String symbol) {
        this.owner = p.getName();
        this.symbol = symbol;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(Player p) {
        this.owner = p.getName();
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(Player p, String symbol) {
        this.symbol = symbol;
    }
}
