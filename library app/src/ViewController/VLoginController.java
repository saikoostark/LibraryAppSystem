package ViewController;

import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class VLoginController {

	@FXML
	TextField username;

	@FXML
	PasswordField password;

	@FXML
	Button loginbtn;

	@FXML
	Label createbtn;

	public void Login(Event e) throws IOException {

		if (username.getLength() > 5 && password.getLength() > 5) {
			Node node = (Node) e.getSource();
			Stage stage = (Stage) node.getScene().getWindow();
			stage.setResizable(true);

			Parent root = FXMLLoader.load(getClass().getResource("../Views/CustomerViews/home.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
		}
	}

	public void createAccount(Event e) throws IOException {

		if (username.getLength() > 5 && password.getLength() > 5) {
			Node node = (Node) e.getSource();
			Stage stage = (Stage) node.getScene().getWindow();

			Parent root = FXMLLoader.load(getClass().getResource("../Views/CustomerViews/signup.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
		}
	}

}
