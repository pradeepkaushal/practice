package com.thouthtworks.minesweeper;

/**
 * Created by pradeep.kaushal on 26/05/17.
 */
public abstract class Cell {
    private CellState cellState;
    public abstract  CellState performOperation(String operation);

    protected CellState getCellState() {
        return cellState;
    }

    protected void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
