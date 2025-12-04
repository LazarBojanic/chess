package com.lazar.chess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

import static com.lazar.chess.util.Util.DIMENSION;

@Data
@AllArgsConstructor
public class Board {
	private Tile[][] tiles;

	public Board() {
		this.tiles = new Tile[DIMENSION][DIMENSION];
		Tile A1 = new Tile(Piece.whiteRook(), Coordinate.from("A1"), Color.BLACK);
		Tile B1 = new Tile(Piece.whiteKnight(), Coordinate.from("B1"), Color.WHITE);
		Tile C1 = new Tile(Piece.whiteBishop(), Coordinate.from("C1"), Color.BLACK);
		Tile D1 = new Tile(Piece.whiteKing(), Coordinate.from("D1"), Color.WHITE);
		Tile E1 = new Tile(Piece.whiteQueen(), Coordinate.from("E1"), Color.BLACK);
		Tile F1 = new Tile(Piece.whiteBishop(), Coordinate.from("F1"), Color.WHITE);
		Tile G1 = new Tile(Piece.whiteKnight(), Coordinate.from("G1"), Color.BLACK);
		Tile H1 = new Tile(Piece.whiteRook(), Coordinate.from("H1"), Color.WHITE);

		Tile A2 = new Tile(Piece.whitePawn(), Coordinate.from("A2"), Color.WHITE);
		Tile B2 = new Tile(Piece.whitePawn(), Coordinate.from("B2"), Color.BLACK);
		Tile C2 = new Tile(Piece.whitePawn(), Coordinate.from("C2"), Color.WHITE);
		Tile D2 = new Tile(Piece.whitePawn(), Coordinate.from("D2"), Color.BLACK);
		Tile E2 = new Tile(Piece.whitePawn(), Coordinate.from("E2"), Color.WHITE);
		Tile F2 = new Tile(Piece.whitePawn(), Coordinate.from("F2"), Color.BLACK);
		Tile G2 = new Tile(Piece.whitePawn(), Coordinate.from("G2"), Color.WHITE);
		Tile H2 = new Tile(Piece.whitePawn(), Coordinate.from("H2"), Color.BLACK);

		Tile A3 = new Tile(null, Coordinate.from("A3"), Color.BLACK);
		Tile B3 = new Tile(null, Coordinate.from("B3"), Color.WHITE);
		Tile C3 = new Tile(null, Coordinate.from("C3"), Color.BLACK);
		Tile D3 = new Tile(null, Coordinate.from("D3"), Color.WHITE);
		Tile E3 = new Tile(null, Coordinate.from("E3"), Color.BLACK);
		Tile F3 = new Tile(null, Coordinate.from("F3"), Color.WHITE);
		Tile G3 = new Tile(null, Coordinate.from("G3"), Color.BLACK);
		Tile H3 = new Tile(null, Coordinate.from("H3"), Color.WHITE);

		Tile A4 = new Tile(null, Coordinate.from("A4"), Color.WHITE);
		Tile B4 = new Tile(null, Coordinate.from("B4"), Color.BLACK);
		Tile C4 = new Tile(null, Coordinate.from("C4"), Color.WHITE);
		Tile D4 = new Tile(null, Coordinate.from("D4"), Color.BLACK);
		Tile E4 = new Tile(null, Coordinate.from("E4"), Color.WHITE);
		Tile F4 = new Tile(null, Coordinate.from("F4"), Color.BLACK);
		Tile G4 = new Tile(null, Coordinate.from("G4"), Color.WHITE);
		Tile H4 = new Tile(null, Coordinate.from("H4"), Color.BLACK);

		Tile A5 = new Tile(null, Coordinate.from("A5"), Color.BLACK);
		Tile B5 = new Tile(null, Coordinate.from("B5"), Color.WHITE);
		Tile C5 = new Tile(null, Coordinate.from("C5"), Color.BLACK);
		Tile D5 = new Tile(null, Coordinate.from("D5"), Color.WHITE);
		Tile E5 = new Tile(null, Coordinate.from("E5"), Color.BLACK);
		Tile F5 = new Tile(null, Coordinate.from("F5"), Color.WHITE);
		Tile G5 = new Tile(null, Coordinate.from("G5"), Color.BLACK);
		Tile H5 = new Tile(null, Coordinate.from("H5"), Color.WHITE);

		Tile A6 = new Tile(null, Coordinate.from("A6"), Color.WHITE);
		Tile B6 = new Tile(null, Coordinate.from("B6"), Color.BLACK);
		Tile C6 = new Tile(null, Coordinate.from("C6"), Color.WHITE);
		Tile D6 = new Tile(null, Coordinate.from("D6"), Color.BLACK);
		Tile E6 = new Tile(null, Coordinate.from("E6"), Color.WHITE);
		Tile F6 = new Tile(null, Coordinate.from("F6"), Color.BLACK);
		Tile G6 = new Tile(null, Coordinate.from("G6"), Color.WHITE);
		Tile H6 = new Tile(null, Coordinate.from("H6"), Color.BLACK);

		Tile A7 = new Tile(Piece.blackPawn(), Coordinate.from("A7"), Color.BLACK);
		Tile B7 = new Tile(Piece.blackPawn(), Coordinate.from("B7"), Color.WHITE);
		Tile C7 = new Tile(Piece.blackPawn(), Coordinate.from("C7"), Color.BLACK);
		Tile D7 = new Tile(Piece.blackPawn(), Coordinate.from("D7"), Color.WHITE);
		Tile E7 = new Tile(Piece.blackPawn(), Coordinate.from("E7"), Color.BLACK);
		Tile F7 = new Tile(Piece.blackPawn(), Coordinate.from("F7"), Color.WHITE);
		Tile G7 = new Tile(Piece.blackPawn(), Coordinate.from("G7"), Color.BLACK);
		Tile H7 = new Tile(Piece.blackPawn(), Coordinate.from("H7"), Color.WHITE);

		Tile A8 = new Tile(Piece.blackRook(), Coordinate.from("A8"), Color.WHITE);
		Tile B8 = new Tile(Piece.blackKnight(), Coordinate.from("B8"), Color.BLACK);
		Tile C8 = new Tile(Piece.blackBishop(), Coordinate.from("C8"), Color.WHITE);
		Tile D8 = new Tile(Piece.blackQueen(), Coordinate.from("D8"), Color.BLACK);
		Tile E8 = new Tile(Piece.blackKing(), Coordinate.from("E8"), Color.WHITE);
		Tile F8 = new Tile(Piece.blackBishop(), Coordinate.from("F8"), Color.BLACK);
		Tile G8 = new Tile(Piece.blackKnight(), Coordinate.from("G8"), Color.WHITE);
		Tile H8 = new Tile(Piece.blackRook(), Coordinate.from("H8"), Color.BLACK);

		tiles[0][0] = A1;
		tiles[0][1] = B1;
		tiles[0][2] = C1;
		tiles[0][3] = D1;
		tiles[0][4] = E1;
		tiles[0][5] = F1;
		tiles[0][6] = G1;
		tiles[0][7] = H1;
		tiles[1][0] = A2;
		tiles[1][1] = B2;
		tiles[1][2] = C2;
		tiles[1][3] = D2;
		tiles[1][4] = E2;
		tiles[1][5] = F2;
		tiles[1][6] = G2;
		tiles[1][7] = H2;
		tiles[2][0] = A3;
		tiles[2][1] = B3;
		tiles[2][2] = C3;
		tiles[2][3] = D3;
		tiles[2][4] = E3;
		tiles[2][5] = F3;
		tiles[2][6] = G3;
		tiles[2][7] = H3;
		tiles[3][0] = A4;
		tiles[3][1] = B4;
		tiles[3][2] = C4;
		tiles[3][3] = D4;
		tiles[3][4] = E4;
		tiles[3][5] = F4;
		tiles[3][6] = G4;
		tiles[3][7] = H4;
		tiles[4][0] = A5;
		tiles[4][1] = B5;
		tiles[4][2] = C5;
		tiles[4][3] = D5;
		tiles[4][4] = E5;
		tiles[4][5] = F5;
		tiles[4][6] = G5;
		tiles[4][7] = H5;
		tiles[5][0] = A6;
		tiles[5][1] = B6;
		tiles[5][2] = C6;
		tiles[5][3] = D6;
		tiles[5][4] = E6;
		tiles[5][5] = F6;
		tiles[5][6] = G6;
		tiles[5][7] = H6;
		tiles[6][0] = A7;
		tiles[6][1] = B7;
		tiles[6][2] = C7;
		tiles[6][3] = D7;
		tiles[6][4] = E7;
		tiles[6][5] = F7;
		tiles[6][6] = G7;
		tiles[6][7] = H7;
		tiles[7][0] = A8;
		tiles[7][1] = B8;
		tiles[7][2] = C8;
		tiles[7][3] = D8;
		tiles[7][4] = E8;
		tiles[7][5] = F8;
		tiles[7][6] = G8;
		tiles[7][7] = H8;
	}
}
