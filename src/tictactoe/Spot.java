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
    private String name;
    private String symbol;
    private Player owner;
    
    public Spot() {
        this.name = "";
        this.symbol = " "; // This is initialized as empty so that it will take up space if nobody is occupying the space
    }
    
    public Spot(Player p, String symbol) {
        this.name = p.getName();
        this.symbol = symbol;
        this.owner = p;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(Player p) {
        this.name = p.getName();
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(Player p, String symbol) {
        this.symbol = symbol;
    }
    
    public Player getOwner() {
        return this.owner;
    }
}
