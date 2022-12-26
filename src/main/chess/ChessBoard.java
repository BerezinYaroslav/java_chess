package main.chess;

import main.chess.figures.*;

import java.util.ArrayList;

public class ChessBoard {
    private final Tile[][] board;

    public ChessBoard() {
        board = new Tile[8][8];
        initializeBoard();
        fillBoard();
    }

    public Tile[][] getBoardArray() {
        return board;
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (j % 2 + i == 0) {
                    board[i][j] = new Tile(Tile.TileColor.Black);
                } else {
                    board[i][j] = new Tile(Tile.TileColor.White);
                }
            }
        }
    }

    public Tuple getKingLocation(ChessFigure.PieceColor color) {
        Tuple location = new Tuple(-1, -1);

        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                if (!board[y][x].isEmpty()) {
                    ChessFigure piece = board[y][x].getPiece();

                    if (piece.getColor() == color && piece instanceof King) {
                        location = new Tuple(x, y);
                    }
                }
            }
        }

        return location;
    }

    public Tuple[] getAllPiecesLocationForColor(ChessFigure.PieceColor color) {
        ArrayList<Tuple> locations = new ArrayList<>();

        for (int x = 0; x <= 7; x++) {
            for (int y = 0; y <= 7; y++) {
                if (!board[y][x].isEmpty() && board[y][x].getPiece().getColor() == color) {
                    locations.add(new Tuple(x, y));
                }
            }
        }

        return locations.toArray(new Tuple[0]);
    }

    public Tile getTileFromTuple(Tuple tuple) {
        return board[tuple.Y()][tuple.X()];
    }

    private void fillBoard() {
        //pawns
        for (int i = 0; i < 8; i++) {
            board[1][i].setPiece(new Pawn(ChessFigure.PieceColor.Black));
            board[6][i].setPiece(new Pawn(ChessFigure.PieceColor.White));
        }

        //rooks
        board[0][0].setPiece(new Rook(ChessFigure.PieceColor.Black));
        board[0][7].setPiece(new Rook(ChessFigure.PieceColor.Black));
        board[7][0].setPiece(new Rook(ChessFigure.PieceColor.White));
        board[7][7].setPiece(new Rook(ChessFigure.PieceColor.White));

        //knight
        board[0][1].setPiece(new Knight(ChessFigure.PieceColor.Black));
        board[0][6].setPiece(new Knight(ChessFigure.PieceColor.Black));
        board[7][1].setPiece(new Knight(ChessFigure.PieceColor.White));
        board[7][6].setPiece(new Knight(ChessFigure.PieceColor.White));

        //bishop
        board[0][2].setPiece(new Bishop(ChessFigure.PieceColor.Black));
        board[0][5].setPiece(new Bishop(ChessFigure.PieceColor.Black));
        board[7][2].setPiece(new Bishop(ChessFigure.PieceColor.White));
        board[7][5].setPiece(new Bishop(ChessFigure.PieceColor.White));

        //queens
        board[0][3].setPiece(new Queen(ChessFigure.PieceColor.Black));
        board[7][3].setPiece(new Queen(ChessFigure.PieceColor.White));

        //kings
        board[0][4].setPiece(new King(ChessFigure.PieceColor.Black));
        board[7][4].setPiece(new King(ChessFigure.PieceColor.White));
    }
}
