package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

public class King extends ChessFigure {

    public King(ChessFigure.PieceColor color) {
        super(PieceType.King, color, validMoves(), false);
    }

    private static Move[] validMoves() {
        return new Move[]{
                new Move(1, 0, false, false),
                new Move(0, 1, false, false),
                new Move(-1, 0, false, false),
                new Move(0, -1, false, false),
                new Move(1, 1, false, false),
                new Move(1, -1, false, false),
                new Move(-1, 1, false, false),
                new Move(-1, -1, false, false)
        };
    }
}
