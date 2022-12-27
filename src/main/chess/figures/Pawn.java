package main.chess.figures;

import main.chess.ChessFigure;
import main.chess.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pawn extends ChessFigure {

    public Pawn(PieceColor color) {
        super(PieceType.Pawn, color, validMoves(color), false);
    }

    private static List<Move> validMoves(PieceColor color) {
        if (color == PieceColor.Black) {
            return new ArrayList<>(Arrays.asList(
                    new Move(0, 1, false, false),
                    new Move(0, 2, true, false),
                    new Move(1, 1, false, true),
                    new Move(-1, 1, false, true)));
        } else {
            return new ArrayList<>(Arrays.asList(new Move(0, -1, false, false),
                    new Move(0, -2, true, false),
                    new Move(1, -1, false, true),
                    new Move(-1, -1, false, true)));
        }
    }
}
