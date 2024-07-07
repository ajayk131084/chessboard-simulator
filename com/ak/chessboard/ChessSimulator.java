package com.ak.chessboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ChessSimulator {

    public static final int BOARD_SIZE = 8;
    public static final Map<Integer, String> letterMap;

    static {
        letterMap = Map.of(
                1, "A",
                2, "B",
                3, "C",
                4, "D",
                5, "E",
                6, "F",
                7, "G",
                8, "H");
    }


    public List<String> getMovementPositions(final PIECE_TYPE piece, final String startPosition) {

        char[] c = startPosition.toCharArray();
        final int initialX = c[0] - '@'; // get int value corresponding to letters, e.g. A -> 1, B -> 2......H -> 8
        final int initialY = c[1] - '0'; // get int value from digit character, e.g. '1' -> 1,.......'8'->8

        switch(piece){
            case QUEEN -> {
                return getQueenPositions(initialX, initialY);
            }
            default -> throw new IllegalArgumentException();
        }

    }


    private List<String> getQueenPositions(final int initialX, final int initialY){
        List<String> positions = new ArrayList<>();
        //Queen movement

        // Horizontal movement left side
        int x = initialX - 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, initialY)) {
            positions.add(letterMap.get(x--) + initialY);
        }
        // Horizontal movement right side
        x = initialX + 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, initialY)) {
            positions.add(letterMap.get(x++) + initialY);
        }
        //Vertical up movement
        int y = initialY + 1;
        while (BoardUtil.isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y++);
        }
        //Vertical down movement
        y = initialY - 1;
        while (BoardUtil.isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y--);
        }
        // Diagonal movement up backward
        x = initialX - 1;
        y = initialY + 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x--) + y++);
        }
        // Diagonal movement down forward
        x = initialX + 1;
        y = initialY - 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x++) + y++);
        }
        // Diagonal movement up forward
        x = initialX + 1;
        y = initialY + 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x++) + y++);
        }
        // Diagonal movement down backward
        x = initialX - 1;
        y = initialY - 1;
        while (BoardUtil.isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x--) + y--);
        }

        return positions;
    }




}
