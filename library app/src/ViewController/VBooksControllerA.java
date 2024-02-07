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
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class VBooksControllerA implements Initializable {

	@FXML
	private VBox catbar;

	@FXML
	private HBox recent;

	@FXML
	private HBox recent1;

	@FXML
	private HBox recent11;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		List<Book> books = new ArrayList<>(getBooks());

		for (int i = 0; i < 12; i++) {

			ScrollPane hboxScroll = new ScrollPane();
			hboxScroll.getStyleClass().add("search-bar");
			hboxScroll.setBackground(
					new Background(new BackgroundFill(Color.web("#f9f9f9"), CornerRadii.EMPTY, Insets.EMPTY)));
			hboxScroll.setPadding(new Insets(10, 0, 10, 0));
			hboxScroll.setFitToHeight(true);
			hboxScroll.setFitToWidth(false);

			Label label = new Label("new cat");
			label.setFont(new Font(20));
			label.setPadding(new Insets(9, 0, 9, 0));
			VBox.setVgrow(label, Priority.ALWAYS);

			HBox hboxBooks = new HBox();
			hboxBooks.setSpacing(20);
			hboxBooks.setFillHeight(true);
			hboxBooks.maxHeight(Double.MAX_VALUE);
			hboxBooks.maxWidth(Double.MAX_VALUE);

			for (Book book : books) {
				try {
					FXMLLoader fxml = new FXMLLoader();
					fxml.setLocation(getClass().getResource("../Views/AdminViews/book.fxml"));
					HBox hbox = fxml.load();
					VBookController bookCont = fxml.getController();
					bookCont.setData(book);

					hboxBooks.getChildren().add(hbox);
					hboxScroll.setContent(hboxBooks);

					// catbar.getChildren().add(label);
					// catbar.setContent(hboxScroll);

				} catch (IOException e) {
					e.printStackTrace();

				}

			}
			catbar.getChildren().addAll(label, hboxScroll);
		}

	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();

		for (int i = 0; i < 15; i++) {

			String link = "C:/Users/habib/Desktop/library app/src/Imgs/cover1.jpg";
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
