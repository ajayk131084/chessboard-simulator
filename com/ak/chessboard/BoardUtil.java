package com.ak.chessboard;

public final class BoardUtil {

    private BoardUtil() {
    }

    public static boolean isInRange(int n, int x, int y) {
        return (x <= n && x > 0 && y <= n && y > 0);

    }

}
