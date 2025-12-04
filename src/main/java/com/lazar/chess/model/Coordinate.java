package com.lazar.chess.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.lazar.chess.util.Util.DIMENSION;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinate {
	private Integer x;
	private Integer y;

	public static Coordinate from(String codeName){
		int x = 0;
		int y = 0;
		if(codeName.length() == 2){
			String file = codeName.substring(0, 1);
			int row = Integer.parseInt(codeName.substring(1, 2));
			if(row > 0 && row <= DIMENSION){
				switch (file) {
					case "A" -> x = 1;
					case "B" -> x = 2;
					case "C" -> x = 3;
					case "D" -> x = 4;
					case "E" -> x = 5;
					case "F" -> x = 6;
					case "G" -> x = 7;
					case "H" -> x = 8;
					default -> System.out.println("File out of bounds");
				}
				return new Coordinate(x, y);
			}
			else{
				System.out.println("Row out of bounds");
			}
		}
		else{
			System.out.println("Codename must be 2 characters");
		}
		return null;
	}
}
