

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardUtilTest {

    @Test
    void isInRange_Out_Of_Board() {
        boolean isInRange = BoardUtil.isInRange(8, 9, 1);
        assertEquals(false, isInRange);
    }


    @Test
    void isInRange_In_The_Board() {
        boolean isInRange = BoardUtil.isInRange(8, 5, 4);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Bottom_Edge() {
        boolean isInRange = BoardUtil.isInRange(8, 5, 1);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Top_Edge() {
        boolean isInRange = BoardUtil.isInRange(8, 5, 8);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Left_Edge() {
        boolean isInRange = BoardUtil.isInRange(8, 1, 4);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Right_Edge() {
        boolean isInRange = BoardUtil.isInRange(8, 8, 4);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Bottom_Left_Corner() {
        boolean isInRange = BoardUtil.isInRange(8, 1, 1);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Top_Left_Corner() {
        boolean isInRange = BoardUtil.isInRange(8, 1, 8);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Bottom_Right_Corner() {
        boolean isInRange = BoardUtil.isInRange(8, 8, 1);
        assertEquals(true, isInRange);
    }

    @Test
    void isInRange_Top_Right_Corner() {
        boolean isInRange = BoardUtil.isInRange(8, 8, 8);
        assertEquals(true, isInRange);
    }


}
