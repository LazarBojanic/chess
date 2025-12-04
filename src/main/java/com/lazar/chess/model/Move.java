package com.lazar.chess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Move {
	private Tile startTile;
	private Tile endTile;
}
