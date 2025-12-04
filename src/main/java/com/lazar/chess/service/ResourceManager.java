package com.lazar.chess.service;

import javafx.scene.image.Image;

import java.net.URL;

public class ResourceManager {
	private static ResourceManager instance;

	public static ResourceManager getInstance() {
		if (instance == null) {
			instance = new ResourceManager();
		}
		return instance;
	}
	public Image loadImage(String path) {
		URL url = getClass().getResource(path);
		if(url != null) {
			return new Image(url.toExternalForm());
		}
		else{
			System.out.println("Image not found");
			return null;
		}
	}
}
