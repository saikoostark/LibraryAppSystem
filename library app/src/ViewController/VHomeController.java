package ViewController;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import Models.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VHomeController implements Initializable {

	@FXML
	private HBox recent;

	@FXML
	private HBox recent1;

	@FXML
	private HBox recent11;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		List<Book> books = new ArrayList<>(getBooks());

		for (Book book : books) {
			try {
				FXMLLoader fxml = new FXMLLoader();
				fxml.setLocation(getClass().getResource("../Views/CustomerViews/book.fxml"));

				HBox hbox = fxml.load();
				VBookController bookCont = fxml.getController();
				bookCont.setData(book);
				recent.getChildren().add(hbox);

				FXMLLoader fxml1 = new FXMLLoader();
				fxml1.setLocation(getClass().getResource("../Views/CustomerViews/book.fxml"));
				HBox hbox1 = fxml1.load();
				VBookController bookCont1 = fxml1.getController();
				bookCont1.setData(book);
				recent1.getChildren().add(hbox1);

				FXMLLoader fxml11 = new FXMLLoader();
				fxml11.setLocation(getClass().getResource("../Views/CustomerViews/book.fxml"));
				HBox hbox11 = fxml11.load();
				VBookController bookCont11 = fxml11.getController();
				bookCont11.setData(book);
				recent11.getChildren().add(hbox11);

			} catch (IOException e) {
				System.out.println("error here");

			}

		}

	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();

		for (int i = 0; i < 15; i++) {

			String link = "C:/Users/alwky/Desktop/final exam.jpg";
			String link2 = "C:/Users/habib/Downloads/Little Mermaid retold_.jpeg";
			String link3 = "C:/Users/habib/Desktop/library app/src/Imgs/0.png";
			Book b1 = new Book("hello", "bablo pihthttrhcaso", "egthhypt", 12, LocalDate.parse("2022-11-02"),
					"1212-212-213",
					link, 50, "fgefgeg");

			books.add(b1);
		}

		return books;
	}

}
