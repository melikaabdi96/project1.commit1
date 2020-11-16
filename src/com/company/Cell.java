package com.company;

/**
 * Cell class holds information of each cell in the gameboard.
 * @author Melika
 * @since 2020
 * @ version 1
 */
public class Cell extends Board{
    //Gameboard consists of 13*9 cells
    private int x;
    private int y;
    // Each cell can have one type
    enum CellType{
        Ground, Hill, Forest, River, Bridge, City, Shelter;

        private static final CellType[] cells = CellType.values();
        public static CellType getCells(int i){
            return CellType.cells[i];
        }
    }
    //cell
    private CellType cell;

    /**
     * x and y fix  each cell's position
     * @param x first parameter of a cell's position
     * @param y second parameter of a cell's position
     */
    public Cell(int x , int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return type of cell
     */
    public CellType getCell(){
        return cell;
    }

    //getter
    public int getX() {
        return x;
    }

    //setter
    public void setX(int x) {
        this.x = x;

    }

    //getter
    public int getY() {
        return y;
    }

    //setter
    public void setY(int y) {
        this.y = y;
    }

}
