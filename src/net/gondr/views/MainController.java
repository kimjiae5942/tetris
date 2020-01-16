package net.gondr.views;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import net.gondr.tetris02.App;
import net.gondr.tetris02.Game;

public class MainController {
	@FXML
	private Canvas gameCanvas;
	
	@FXML
	public void initialize() {
		System.out.println("메인 레이아웃 초기화");
		App.app.game = new Game(gameCanvas);
	}
}
