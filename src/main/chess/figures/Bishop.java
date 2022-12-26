package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

public class Bishop extends ChessFigure {

    public Bishop(PieceColor color) {
        super(PieceType.Bishop, color, validMoves(), true);
    }


    private static Move[] validMoves() {
        return new Move[]{
                new Move(1, 1, false, false),
                new Move(1, -1, false, false),
                new Move(-1, 1, false, false),
                new Move(-1, -1, false, false)
        };
    }
}
