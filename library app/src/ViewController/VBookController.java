package ViewController;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.File;
import java.time.format.DateTimeFormatter;

import Models.*;

public class VBookController {

	@FXML
	private Label bookauther;

	@FXML
	private ImageView bookimg;

	@FXML
	private Label bookpages;

	@FXML
	private Label bookpublisher;

	@FXML
	private Label booktitle;

	@FXML
	private Label bookyear;

	public void setData(Book book) {

		Image img = new Image(new File(book.getLink()).toURI().toString());
		bookimg.setImage(img);
		bookauther.setText(book.getAuther());
		bookpublisher.setText(book.getPublisher());
		booktitle.setText(book.getTitle());
		bookpages.setText(book.getPages() + " pages");
		bookyear.setText("published " + book.getYear().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
