package src;

import java.util.List;

public class ChessSimulator {

    public List<String> getMovementPositions(final PIECE_TYPE piece, final String startPosition) {

        final char[] c = startPosition.toCharArray();
        // get int value corresponding to letters, e.g. A -> 1, B -> 2......H -> 8
        final int initialX = c[0] - '@';
        // get int value from digit character, e.g. '1' -> 1,.......'8'->8
        final int initialY = c[1] - '0';
        // throw exception if position input is invalid
        if (!BoardUtil.isInRange(BoardUtil.BOARD_SIZE, initialX, initialY)) {
            throw new IllegalArgumentException("Input position is invalid");
        }

        final PositionService positionService = new PositionService();

        switch (piece) {
            case QUEEN -> {
                return positionService.getQueenPositions(initialX, initialY);
            }
            case KING -> {
                return positionService.getKingPositions(initialX, initialY);
            }
            case PAWN -> {
                return positionService.getPawnPosition(initialX, initialY);
            }
            default -> throw new IllegalArgumentException("Piece type " + piece + " is not supported ");
        }
    }
}
