package com.example.pss.application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// FXML 파일 경로 수정
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("/com/example/pss/application/UI.fxml"));
			Scene scene = new Scene(root, 1280, 800);

			// CSS 파일 경로 수정
			scene.getStylesheets().add(getClass().getResource("/com/example/pss/application/application.css").toExternalForm());

			primaryStage.setTitle("Process Scheduling Simulator");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
