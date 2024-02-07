package ViewController;

import java.io.File;
import java.time.LocalDate;

import Controllers.DBhelper;
import Models.Book;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class VAddBookControllerV {

	@FXML
	private TextField authors;

	@FXML
	private TextField category;

	@FXML
	private Button clearadd;

	@FXML
	private Button coverchooser;

	@FXML
	private TextField copies;

	@FXML
	private TextField cover;

	@FXML
	private TextField isbn;

	@FXML
	private TextField pages;

	@FXML
	private DatePicker published;

	@FXML
	private TextField publishers;

	@FXML
	private Button saveadd;

	@FXML
	private TextField title;

	public void fileChosser() {
		Stage stage = new Stage();
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().addAll(
				new ExtensionFilter("Text Files", "*.txt"),
				new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
				new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
				new ExtensionFilter("All Files", "*.*"));

		File selectedFile = fileChooser.showOpenDialog(stage);
		if (selectedFile != null) {
			cover.setText(selectedFile.toString());
		}

	}

	public void saveBook() throws Exception {

		Book book = new Book();
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Adding new book");
		alert.setHeaderText(null);

		book.setTitle(title.getText());
		book.setAuther(authors.getText());
		book.setPublisher(publishers.getText());
		book.setPages(Integer.parseInt(pages.getText()));
		book.setYear(published.getValue());
		book.setISBN(isbn.getText());
		book.setLink(cover.getText());
		book.setCopies(Integer.parseInt(copies.getText()));
		book.setTag(category.getText());
		DBhelper.insertBook(book);

		alert.setContentText("Book has been added succefully :)");
		alert.showAndWait();

		clearBook();
	}

	public void clearBook() {

		title.setText(null);
		authors.setText(null);
		publishers.setText(null);
		pages.setText(null);
		published.setValue(null);
		isbn.setText(null);
		cover.setText(null);
		copies.setText(null);
		category.setText(null);
	}

}
