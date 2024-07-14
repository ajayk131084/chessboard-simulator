

public enum PIECE_TYPE {
    KING("KING"),
    QUEEN("QUEEN"),
    PAWN("PAWN");

    private final String value;

    PIECE_TYPE(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
