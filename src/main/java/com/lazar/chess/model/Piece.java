package com.lazar.chess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piece {
	private PieceType type;
	private Color color;
	public static Piece whitePawn(){
		return new Piece(PieceType.PAWN, Color.WHITE);
	}
	public static Piece blackPawn(){
		return new Piece(PieceType.PAWN, Color.BLACK);
	}
	public static Piece whiteKnight(){
		return new Piece(PieceType.KNIGHT, Color.WHITE);
	}
	public static Piece blackKnight(){
		return new Piece(PieceType.KNIGHT, Color.BLACK);
	}
	public static Piece whiteBishop(){
		return new Piece(PieceType.BISHOP, Color.WHITE);
	}
	public static Piece blackBishop(){
		return new Piece(PieceType.BISHOP, Color.BLACK);
	}
	public static Piece whiteRook(){
		return new Piece(PieceType.ROOK, Color.WHITE);
	}
	public static Piece blackRook(){
		return new Piece(PieceType.ROOK, Color.BLACK);
	}
	public static Piece whiteQueen(){
		return new Piece(PieceType.QUEEN, Color.WHITE);
	}
	public static Piece blackQueen(){
		return new Piece(PieceType.QUEEN, Color.BLACK);
	}
	public static Piece whiteKing(){
		return new Piece(PieceType.KING, Color.WHITE);
	}
	public static Piece blackKing(){
		return new Piece(PieceType.KING, Color.BLACK);
	}
}
