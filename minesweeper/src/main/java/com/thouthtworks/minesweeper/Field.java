package com.thouthtworks.minesweeper;

/**
 * Created by pradeep.kaushal on 26/05/17.
 */
public class Field extends Cell {

    private CellState STATE;

    public Field(CellState STATE) {
        this.STATE = STATE;
    }


    public CellState performOperation(String operation) {
        if ("f".equals(operation)) {
            return CellState.FLAG_FIELD;
        } else {
            return CellState.OPEN_FEILD;
        }

    }
}
