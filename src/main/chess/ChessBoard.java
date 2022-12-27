package main.chess;

import main.chess.figures.*;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private final List<List<Tile>> board;

    public ChessBoard() {
        board = new ArrayList<>();
        initializeBoard();
        fillBoard();
    }

    public List<List<Tile>> getBoardArray() {
        return board;
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            board.add(new ArrayList<>());

            for (int j = 0; j < 8; j++) {
                if (j % 2 + i == 0) {
                    board.get(i).add(new Tile(Tile.TileColor.Black));
                } else {
                    board.get(i).add(new Tile(Tile.TileColor.White));
                }
            }
        }
    }

    public Tuple getKingLocation(ChessFigure.PieceColor color) {
        Tuple location = new Tuple(-1, -1);

        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                if (!board.get(y).get(x).isEmpty()) {
                    ChessFigure piece = board.get(y).get(x).getPiece();

                    if (piece.getColor() == color && piece instanceof King) {
                        location = new Tuple(x, y);
                    }
                }
            }
        }

        return location;
    }

    public List<Tuple> getAllPiecesLocationForColor(ChessFigure.PieceColor color) {
        ArrayList<Tuple> locations = new ArrayList<>();

        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                if (!board.get(y).get(x).isEmpty() && board.get(y).get(x).getPiece().getColor() == color) {
                    locations.add(new Tuple(x, y));
                }
            }
        }

        return locations;
    }

    public Tile getTileFromTuple(Tuple tuple) {
        return board.get(tuple.Y()).get(tuple.X());
    }

    private void fillBoard() {
        //pawns
        for (int i = 0; i < 8; i++) {
            board.get(1).get(i).setPiece(new Pawn(ChessFigure.PieceColor.Black));
            board.get(6).get(i).setPiece(new Pawn(ChessFigure.PieceColor.White));
        }

        //rooks
        board.get(0).get(0).setPiece(new Rook(ChessFigure.PieceColor.Black));
        board.get(0).get(7).setPiece(new Rook(ChessFigure.PieceColor.Black));
        board.get(7).get(0).setPiece(new Rook(ChessFigure.PieceColor.White));
        board.get(7).get(7).setPiece(new Rook(ChessFigure.PieceColor.White));

        //knight
        board.get(0).get(1).setPiece(new Knight(ChessFigure.PieceColor.Black));
        board.get(0).get(6).setPiece(new Knight(ChessFigure.PieceColor.Black));
        board.get(7).get(1).setPiece(new Knight(ChessFigure.PieceColor.White));
        board.get(7).get(6).setPiece(new Knight(ChessFigure.PieceColor.White));

        //bishop
        board.get(0).get(2).setPiece(new Bishop(ChessFigure.PieceColor.Black));
        board.get(0).get(5).setPiece(new Bishop(ChessFigure.PieceColor.Black));
        board.get(7).get(2).setPiece(new Bishop(ChessFigure.PieceColor.White));
        board.get(7).get(5).setPiece(new Bishop(ChessFigure.PieceColor.White));

        //queens
        board.get(0).get(3).setPiece(new Queen(ChessFigure.PieceColor.Black));
        board.get(7).get(3).setPiece(new Queen(ChessFigure.PieceColor.White));

        //kings
        board.get(0).get(4).setPiece(new King(ChessFigure.PieceColor.Black));
        board.get(7).get(4).setPiece(new King(ChessFigure.PieceColor.White));
    }
}
