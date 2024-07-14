package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChessSimulatorTest {

    final ChessSimulator chessSimulator = new ChessSimulator();

    // test for queen positions
    @Test
    @DisplayName("Get Queen Positions From E4 - middle")
    void getMovementPositions_Queen_From_E4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "E4");
        Assertions.assertEquals(List.of("D4", "C4", "B4", "A4", "F4", "G4", "H4", "E5", "E6", "E7", "E8", "E3", "E2", "E1", "D5", "C6", "B7", "A8", "F3", "G2", "H1", "F5", "G6", "H7", "D3", "C2", "B1"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From E1 - bottom edge")
    void getMovementPositions_Queen_From_E1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "E1");
        Assertions.assertEquals(List.of("D1", "C1", "B1", "A1", "F1", "G1", "H1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "D2", "C3", "B4", "A5", "F2", "G3", "H4"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From E8 - top edge")
    void getMovementPositions_Queen_From_E8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "E8");
        Assertions.assertEquals(List.of("D8", "C8", "B8", "A8", "F8", "G8", "H8", "E7", "E6", "E5", "E4", "E3", "E2", "E1", "F7", "G6", "H5", "D7", "C6", "B5", "A4"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From A4 - left edge")
    void getMovementPositions_Queen_From_A4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "A4");
        Assertions.assertEquals(List.of("B4", "C4", "D4", "E4", "F4", "G4", "H4", "A5", "A6", "A7", "A8", "A3", "A2", "A1", "B3", "C2", "D1", "B5", "C6", "D7", "E8"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From H4 - right edge")
    void getMovementPositions_Queen_From_H4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "H4");
        Assertions.assertEquals(List.of("G4", "F4", "E4", "D4", "C4", "B4", "A4", "H5", "H6", "H7", "H8", "H3", "H2", "H1", "G5", "F6", "E7", "D8", "G3", "F2", "E1"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From A1 -  bottom left corner")
    void getMovementPositions_Queen_From_A1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "A1");
        Assertions.assertEquals(List.of("B1", "C1", "D1", "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "B2", "C3", "D4", "E5", "F6", "G7", "H8"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From A8 -  top left corner")
    void getMovementPositions_Queen_From_A8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "A8");
        Assertions.assertEquals(List.of("B8", "C8", "D8", "E8", "F8", "G8", "H8", "A7", "A6", "A5", "A4", "A3", "A2", "A1", "B7", "C6", "D5", "E4", "F3", "G2", "H1"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From H1 -  bottom right corner")
    void getMovementPositions_Queen_From_H1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "H1");
        Assertions.assertEquals(List.of("G1", "F1", "E1", "D1", "C1", "B1", "A1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "G2", "F3", "E4", "D5", "C6", "B7", "A8"), positions);
    }

    @Test
    @DisplayName("Get Queen Positions From H8 - top right corner")
    void getMovementPositions_Queen_From_H8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.QUEEN, "H8");
        Assertions.assertEquals(List.of("G8", "F8", "E8", "D8", "C8", "B8", "A8", "H7", "H6", "H5", "H4", "H3", "H2", "H1", "G7", "F6", "E5", "D4", "C3", "B2", "A1"), positions);
    }

    // test for king positions

    @Test
    @DisplayName("Get King Positions From E4 - middle")
    void getMovementPositions_King_From_E4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "E4");
        Assertions.assertEquals(List.of("D4", "F4", "E5", "E3", "D5", "F3", "F5", "D3"), positions);
    }

    @Test
    @DisplayName("Get King Positions From E1 - bottom edge")
    void getMovementPositions_King_From_E1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "E1");
        Assertions.assertEquals(List.of("D1", "F1", "E2", "D2", "F2"), positions);
    }

    @Test
    @DisplayName("Get King Positions From E8 - top edge")
    void getMovementPositions_King_From_E8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "E8");
        Assertions.assertEquals(List.of("D8", "F8", "E7", "F7", "D7"), positions);
    }

    @Test
    @DisplayName("Get King Positions From A4 - left edge")
    void getMovementPositions_King_From_A4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "A4");
        Assertions.assertEquals(List.of("B4", "A5", "A3", "B3", "B5"), positions);
    }

    @Test
    @DisplayName("Get King Positions From H4 - right edge")
    void getMovementPositions_King_From_H4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "H4");
        Assertions.assertEquals(List.of("G4", "H5", "H3", "G5", "G3"), positions);
    }

    @Test
    @DisplayName("Get King Positions From A1 -  bottom left corner")
    void getMovementPositions_King_From_A1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "A1");
        Assertions.assertEquals(List.of("B1", "A2", "B2"), positions);
    }

    @Test
    @DisplayName("Get King Positions From A8 -  top left corner")
    void getMovementPositions_King_From_A8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "A8");
        Assertions.assertEquals(List.of("B8", "A7", "B7"), positions);
    }

    @Test
    @DisplayName("Get King Positions From H1 -  bottom right corner")
    void getMovementPositions_King_From_H1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "H1");
        Assertions.assertEquals(List.of("G1", "H2", "G2"), positions);
    }

    @Test
    @DisplayName("Get King Positions From H8 - top right corner")
    void getMovementPositions_King_From_H8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.KING, "H8");
        Assertions.assertEquals(List.of("G8", "H7", "G7"), positions);
    }

    @Test
    void getMovementPositions_Pawn_E4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "E4");
        Assertions.assertEquals(List.of("E5"), positions);
    }

    @Test
    void getMovementPositions_Pawn_E1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "E1");
        Assertions.assertEquals(List.of("E2"), positions);
    }

    @Test
    void getMovementPositions_Pawn_E8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "E8");
        Assertions.assertEquals(List.of(), positions);
    }

    @Test
    void getMovementPositions_Pawn_A4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "A4");
        Assertions.assertEquals(List.of("A5"), positions);
    }

    @Test
    void getMovementPositions_Pawn_H4() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "H4");
        Assertions.assertEquals(List.of("H5"), positions);
    }

    @Test
    void getMovementPositions_Pawn_A1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "A1");
        Assertions.assertEquals(List.of("A2"), positions);
    }

    @Test
    @DisplayName("Get Pawn Positions From A8 - top left corner")
    void getMovementPositions_Pawn_A8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "A8");
        Assertions.assertEquals(List.of(), positions);
    }

    @Test
    @DisplayName("Get Pawn Positions From H1 - bottom right corner")
    void getMovementPositions_Pawn_H1() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "H1");
        Assertions.assertEquals(List.of("H2"), positions);
    }

    @Test
    @DisplayName("Get Pawn Positions From H8 - top right corner")
    void getMovementPositions_Pawn_H8() {
        List<String> positions = chessSimulator.getMovementPositions(PIECE_TYPE.PAWN, "H8");
        Assertions.assertEquals(List.of(), positions);
    }
}
