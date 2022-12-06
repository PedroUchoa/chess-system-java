package chess;


import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRown()][board.getColumns()];
		for (int i =0; i < board.getRown(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
			
		}
		return mat;
	}
	
	public void initialSetup() {
		board.placePiece(new Rook(board,Color.WHITE), new Position(2, 7));
	}
	
}
