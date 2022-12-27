package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Knight extends ChessFigure {

    public Knight(ChessFigure.PieceColor color) {
        super(PieceType.Knight, color, validMoves(), false);
    }


    private static List<Move> validMoves() {
        return new ArrayList<>(Arrays.asList(
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
                new Move(-1, -2, false, false)));
    }
}
