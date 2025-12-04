package com.lazar.chess.game;

import com.lazar.chess.model.Board;
import com.lazar.chess.model.Color;
import com.lazar.chess.model.Move;
import com.lazar.chess.model.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
	private Board board;
	private Player whitePlayer;
	private Player blackPlayer;
	private List<Move> moves;
	public void start(String whitePlayerName, String blackPlayerName) {
		board = new Board();
		whitePlayer = new Player(whitePlayerName, Color.WHITE);
		blackPlayer = new Player(blackPlayerName, Color.BLACK);
	}
}
