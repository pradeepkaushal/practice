package com.thouthtworks.minesweeper;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pradeep.kaushal on 26/05/17.
 */
public class MinesField {

    private Cell[][] fields = null;

    private Set<String> set = new HashSet<String>();
    private int availableBombCount = 0;
    private int currentBombCount = 0;

    public MinesField(int size) {
        fields = new Cell[size][size];
        initBoard();
        initBomb();
    }

    private void initBoard() {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                fields[i][j] = new Field(CellState.CLOSE_FIELD);
            }
        }

    }

    private void initBomb() {
        fields[3][1] = new Bomb(CellState.CLOSE_FIELD);
        fields[2][1] = new Bomb(CellState.CLOSE_FIELD);
        fields[0][1] = new Bomb(CellState.CLOSE_FIELD);
        availableBombCount = 3;
    }


    public GameResult operation(String operation, int i, int j) {

        Cell cell = fields[i][j];

        CellState cellState = cell.performOperation(operation);

        switch (cellState) {
            case OPEN_FEILD:
                set.add("i" + "j");
                if (set.size() == fields.length * fields.length)
                    return GameResult.WON;

                return GameResult.PROCEED;
            case FLAG_BOMB:
                set.add("i" + "j");
                currentBombCount++;
                if (set.size() == fields.length * fields.length && availableBombCount == currentBombCount)
                    return GameResult.WON;

                return GameResult.PROCEED;
            case FLAG_FIELD:
                return GameResult.PROCEED;
            case OPEN_BOMB:
                return GameResult.LOST;
        }

        return null;
    }


}
