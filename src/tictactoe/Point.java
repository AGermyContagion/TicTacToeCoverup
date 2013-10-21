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
public class Point {
    private int x;
    private int y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Assigns the coordinate from the constructor
     * @param x The X coordinate
     * @param y The Y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point getPoint() {
        return new Point(this.x, this.y);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
}