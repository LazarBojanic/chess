package com.lazar.chess.view;

import com.lazar.chess.model.Piece;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javafx.scene.image.Image;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PieceView {
	private Piece piece;
	private Image image;
}
