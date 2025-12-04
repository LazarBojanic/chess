package com.lazar.chess;

import com.lazar.chess.service.ResourceManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Chess");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}