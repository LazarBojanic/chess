package com.lazar.chess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tile {
	private Piece piece;
	private Coordinate coordinate;
	private Color color;
}
