package com.java.fxml;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("view/CRUD_Pessoa.fxml"));
		Scene newScene = new Scene(root);

		primaryStage.setTitle("JavaFX - FXML - Lista de Pessoas");
		primaryStage.resizableProperty().setValue(Boolean.FALSE);
		primaryStage.setScene(newScene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
