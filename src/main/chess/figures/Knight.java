package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

public class Knight extends ChessFigure {

    public Knight(ChessFigure.PieceColor color) {
        super(PieceType.Knight, color, validMoves(), false);
    }


    private static Move[] validMoves() {
        return new Move[]{
                new Move(2, 1, false, false),
                new Move(1, 2, false, false),
                new Move(2, -1, false, false),
                new Move(-1, 2, false, false),
                new Move(2, -1, false, false),
                new Move(-1, 2, false, false),
                new Move(-2, 1, false, false),
                new Move(1, -2, false, false),
                new Move(-2, -1, false, false),
                new Move(-1, -2, false, false),
                new Move(-2, -1, false, false),
                new Move(-1, -2, false, false)
        };
    }
}
