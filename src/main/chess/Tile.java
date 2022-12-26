package main.chess;

public class Tile {
    private ChessFigure piece;
    private final TileColor color;

    public enum TileColor {
        White, Black
    }

    public Tile(TileColor color) {
        this.color = color;
    }

    public Tile(TileColor color, ChessFigure piece) {
        this.color = color;
        this.piece = piece;
    }

    public void setPiece(ChessFigure piece) {
        this.piece = piece;
    }

    public ChessFigure getPiece() {
        return this.piece;
    }

    public String getValue() {
        if (piece != null) {
            return "[" + piece.getCharValue() + "]";
        } else {
            return "[ ]";
        }
    }

    public boolean isEmpty() {
        return piece == null;
    }

    public void empty() {
        piece = null;
    }
}
