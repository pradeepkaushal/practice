package com.thouthtworks.minesweeper;

/**
 * Created by pradeep.kaushal on 26/05/17.
 */
public class Bomb extends Cell {
    private CellState STATE;

    public Bomb(CellState STATE) {
        this.STATE = STATE;
    }

    public CellState performOperation(String operation) {

        if("f".equals(operation)){
            return CellState.OPEN_BOMB;
        }else{
            return CellState.FLAG_BOMB;
        }
    }
}
