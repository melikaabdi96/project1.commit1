package com.company;

import javafx.scene.control.Cell;

public class Board {
    private static Board instance;
    private final int column;
    private final int row;
    private int x;
    private int y;
    public Cell board[][];
    private boolean firstBoard = true;

    public Board() {
        this.column = 13;
        this.row = 9;
        this.x = x;
        this.y = y;
        this.board = new Cell[row][column];
        /*this.elements = new Elements[width][];
        for(int i = 0; i < width; i++) {
            this.elements[i] = new Elements[height];
        }*/
    }

    synchronized public static Board getInstance()
    {
        if (instance == null)
        {
            // if instance is null, initialize
            instance = new Board();
        }
        return instance;
    }
    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    public boolean validX(int x){
        if( x > 0 && x <= row )
            return true;
        else
            return false;
    }
    public boolean validY(int y){
        if( y > 0 && y <= column )
            return true;
        else
            return false;
    }

    public void printBoard(){

        if(firstBoard) {
            for (x = 0; x < 10; x+=2){
                if (x == 0)
                    System.out.println(" ");
                for (y = 0; x < 27; x += 2){
                    if (y == 0) {
                        System.out.println(" ");
                    }else{
                        System.out.println("/*\\");
                        System.out.println("|   |");
                        System.out.println("\\*/");
                    }
                }
            }
            for (x = 1; x < 10; x +=2){
               for (y = 1; y < 27; y +=2){
                   System.out.println("/*\\");
                   System.out.println("|   |");
                   System.out.println("\\*/");
               }
            }
        }

    }
}
