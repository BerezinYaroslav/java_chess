package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bishop extends ChessFigure {

    public Bishop(PieceColor color) {
        super(PieceType.Bishop, color, validMoves(), true);
    }


    private static List<Move> validMoves() {
        return new ArrayList<>(Arrays.asList(
                new Move(1, 1, false, false),
                new Move(1, -1, false, false),
                new Move(-1, 1, false, false),
                new Move(-1, -1, false, false)));
    }
}
