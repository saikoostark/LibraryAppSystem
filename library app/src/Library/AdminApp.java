package Library;

import java.sql.*;

import Controllers.DB;
import Controllers.DBhelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AdminApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		DBhelper.tableBuilder();

		Parent root = FXMLLoader.load(getClass().getResource("../Views/AdminViews/view_books.fxml"));
		// Parent root =
		// FXMLLoader.load(getClass().getResource("../Views/AdminViews/view_users.fxml"));

		primaryStage.setTitle("Admin Login");
		Scene scene = new Scene(root);

		primaryStage.setScene(scene);
		// primaryStage.setResizable(false);

		Image icon = new Image("Imgs/top-icon.png");

		// Set the icon for the stage
		primaryStage.getIcons().add(icon);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
