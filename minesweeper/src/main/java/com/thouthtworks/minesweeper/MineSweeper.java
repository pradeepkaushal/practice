package com.thouthtworks.minesweeper;

import java.util.Scanner;

/**
 * Created by pradeep.kaushal on 26/05/17.
 */
public class MineSweeper {

    public static void main(String[] args) {
        MinesField minesField = new MinesField(5);
        Scanner sc = new Scanner(System.in);
        GameResult RESULT = GameResult.PROCEED;
        while (RESULT.PROCEED == GameResult.PROCEED) {
            String input = sc.nextLine();

            String[] output = input.split("\\(");
            String operation = output[0];
            String[] locations = output[1].split(",");
            int x = Integer.parseInt(locations[0]);
            int y = Integer.parseInt(locations[1].split("\\)")[0]);
            RESULT = minesField.operation(operation, x, y);

        }
        if (RESULT == GameResult.WON) {
            System.out.println("I won!");
        } else {
            System.out.println("I lost");
        }
    }


}
