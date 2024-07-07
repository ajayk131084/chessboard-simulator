package com.ak.chessboard;

public class Application {

    public static void main(String[] args) {

        ChessSimulator cs = new ChessSimulator();

        System.out.println(cs.getMovementPositions(PIECE_TYPE.QUEEN, "E4"));
       // System.out.println(cs.getMovementPositions(PIECE_TYPE.KING, "D5"));
       // System.out.println(cs.getMovementPositions(PIECE_TYPE.KING, "G1"));

    }
}
