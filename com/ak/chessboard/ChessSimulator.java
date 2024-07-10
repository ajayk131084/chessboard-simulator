package com.ak.chessboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.ak.chessboard.BoardUtil.isInRange;


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

        if(!isInRange(BOARD_SIZE, initialX, initialY)){
            throw new IllegalArgumentException("Input position is invalid");
        }

        switch(piece){
            case QUEEN -> {
                return getQueenPositions(initialX, initialY);
            }
            case KING -> {
                return getKingPositions(initialX, initialY);
            }
            case PAWN -> {
                return getPawnPositions(initialX, initialY);
            }
            default -> throw new IllegalArgumentException("Piece type "+ piece + " is not supported ");
        }

    }


    private List<String> getQueenPositions(final int initialX, final int initialY){

        List<String> positions = new ArrayList<>();
        int x, y;

        // Horizontal movement left side
        x = initialX - 1;
        while (isInRange(BOARD_SIZE, x, initialY)) {
            positions.add(letterMap.get(x--) + initialY);
        }
        // Horizontal movement right sidez
        x = initialX + 1;
        while (isInRange(BOARD_SIZE, x, initialY)) {
            positions.add(letterMap.get(x++) + initialY);
        }
        //Vertical up movement
        y = initialY + 1;
        while (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y++);
        }
        //Vertical down movement
        y = initialY - 1;
        while (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y--);
        }
        // Diagonal movement up backward
        x = initialX - 1;
        y = initialY + 1;
        while (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x--) + y++);
        }
        // Diagonal movement down forward
        x = initialX + 1;
        y = initialY - 1;
        while (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x++) + y++);
        }
        // Diagonal movement up forward
        x = initialX + 1;
        y = initialY + 1;
        while (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x++) + y++);
        }
        // Diagonal movement down backward
        x = initialX - 1;
        y = initialY - 1;
        while (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x--) + y--);
        }
        return positions;
    }

    private List<String> getKingPositions(final int initialX, final int initialY){

        List<String> positions = new ArrayList<>();
        int x, y;

        // Horizontal movement left side
        x = initialX - 1;
        if(isInRange(BOARD_SIZE, x, initialY)){
            positions.add(letterMap.get(x) + initialY);
        }
        // Horizontal movement right side
        x = initialX + 1;
        if(isInRange(BOARD_SIZE, x, initialY)){
            positions.add(letterMap.get(x) + initialY);
        }
        //Vertical up movement
        y = initialY + 1;
        if (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y);
        }
        //Vertical down movement
        y = initialY - 1;
        if (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y);
        }
        // Diagonal movement up backward
        x = initialX - 1;
        y = initialY + 1;
        if (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x) + y);
        }
        // Diagonal movement down forward
        x = initialX + 1;
        y = initialY - 1;
        if (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x) + y);
        }
        // Diagonal movement up forward
        x = initialX + 1;
        y = initialY + 1;
        if (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x) + y);
        }
        // Diagonal movement down backward
        x = initialX - 1;
        y = initialY - 1;
        if (isInRange(BOARD_SIZE, x, y)) {
            positions.add(letterMap.get(x) + y);
        }

        return positions;

    }

    private List<String> getPawnPositions(final int initialX, final int initialY){

        List<String> positions = new ArrayList<>();

        //Vertical up movement
        int y = initialY + 1;
        if (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y);
        }
        Collections.sort(positions);
        return positions;

    }




}
