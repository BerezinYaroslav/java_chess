package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rook extends ChessFigure {

    public Rook(PieceColor color) {
        super(PieceType.Rook, color, validMoves(), true);
    }


    private static List<Move> validMoves() {
        return new ArrayList<>(Arrays.asList(
                new Move(1, 0, false, false),
                new Move(0, 1, false, false),
                new Move(-1, 0, false, false),
                new Move(0, -1, false, false)));
    }
}
