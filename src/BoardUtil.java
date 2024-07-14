

public final class BoardUtil {

    public static final int BOARD_SIZE = 8;

    private BoardUtil() {
    }

    public static boolean isInRange(int boardSize, int x, int y) {
        return (x <= boardSize && x > 0 && y <= boardSize && y > 0);
    }
}
