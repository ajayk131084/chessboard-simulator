package com.ak.chessboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.ak.chessboard.BoardUtil.BOARD_SIZE;
import static com.ak.chessboard.BoardUtil.isInRange;

public class PositionService {

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
    public List<String> getQueenPositions(final int initialX, final int initialY){

        final List<String> positions = new ArrayList<>();
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

    public List<String> getKingPositions(final int initialX, final int initialY){

        final List<String> positions = new ArrayList<>();
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

    public List<String> getPawnPositions(final int initialX, final int initialY){

        final List<String> positions = new ArrayList<>();

        //Vertical up movement
        final int y = initialY + 1;
        if (isInRange(BOARD_SIZE, initialX, y)) {
            positions.add(letterMap.get(initialX) + y);
        }
        Collections.sort(positions);
        return positions;

    }
}
