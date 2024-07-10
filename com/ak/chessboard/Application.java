package com.ak.chessboard;

import java.util.Scanner;

import static com.ak.chessboard.BoardUtil.isInRange;
import static com.ak.chessboard.ChessSimulator.BOARD_SIZE;


public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isValidPieceType = false;
        String pieceType = "";

        while(!isValidPieceType) {
            System.out.println("Enter piece type as KING, QUEEN OR PAWN ");
             pieceType = sc.nextLine();


            if (pieceType == null || pieceType.trim().isEmpty()) {
                System.out.println("Input is empty, Please enter Piece type as KING, QUEEN OR PAWN.");
               continue;
            }

            pieceType = pieceType.trim().toUpperCase();
            for (PIECE_TYPE piece : PIECE_TYPE.values()) {
                if (piece.getValue().equalsIgnoreCase(pieceType)) {
                    isValidPieceType = true;
                    break;
                }
            }

            if (!isValidPieceType) {
                System.out.println("Invalid input, Piece type must be KING, QUEEN OR PAWN.");
                continue;
            }
        }

        boolean isValidPosition = false;
        String position = "";

        while(!isValidPosition) {
            System.out.println("Enter initial position of chess piece in chessboard from A1 to H8");
            position = sc.nextLine();


            if (position == null || position.trim().isEmpty()) {
                System.out.println("Input is empty, Please enter position from A1 TO H8");
                continue;
            }

            position= position.trim().toUpperCase();
           if(position.length() == 2){
             char letters[] =   position.toCharArray();

              if( isInRange(BOARD_SIZE, letters[0]-'@', letters[1]-'0')){
                  isValidPosition = true;
              }
           }else{
               System.out.println("Position is invalid");
               continue;
           }

        }


        ChessSimulator cs = new ChessSimulator();

        System.out.println(cs.getMovementPositions(PIECE_TYPE.valueOf(pieceType), position));

    }
}
