package com.lazar.chess.view;

import com.lazar.chess.model.Tile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javafx.scene.image.Image;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TileView {
	private Tile tile;
	private Image image;
}
