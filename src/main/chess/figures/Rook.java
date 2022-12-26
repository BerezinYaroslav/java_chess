package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

public class Rook extends ChessFigure {

    public Rook(PieceColor color) {
        super(PieceType.Rook, color, validMoves(), true);
    }


    private static Move[] validMoves() {
        return new Move[]{
                new Move(1, 0, false, false),
                new Move(0, 1, false, false),
                new Move(-1, 0, false, false),
                new Move(0, -1, false, false)
        };
    }
}
