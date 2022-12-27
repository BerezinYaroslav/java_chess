package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class King extends ChessFigure {

    public King(ChessFigure.PieceColor color) {
        super(PieceType.King, color, validMoves(), false);
    }

    private static List<Move> validMoves() {
        return new ArrayList<>(Arrays.asList(
                new Move(1, 0, false, false),
                new Move(0, 1, false, false),
                new Move(-1, 0, false, false),
                new Move(0, -1, false, false),
                new Move(1, 1, false, false),
                new Move(1, -1, false, false),
                new Move(-1, 1, false, false),
                new Move(-1, -1, false, false)));
    }
}
