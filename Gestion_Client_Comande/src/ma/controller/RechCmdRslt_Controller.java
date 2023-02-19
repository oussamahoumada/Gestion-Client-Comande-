package ma.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class RechCmdRslt_Controller implements Initializable {
	@FXML
	private  Pane panlab;
	@FXML
	private Hyperlink ret;
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		listprd();
	}
	@FXML
	public void retour() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/RechCmd_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,ret);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void listprd() {
		for (int j = 0; j < 2; j++) {
			Pane p = new Pane();
			for (int i = 0; i < 5; i++) {
				Label l = new Label();
				Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 15);
				l.setFont(font);
				l.setTextFill(Color.BLACK);
				l.setTranslateX(7);
				int y = 20 * i;
				l.setTranslateY(y);
				l.setText("label vide");
				p.getChildren().add(l);
			}
				Font fontB = Font.font("Brush", FontWeight.BLACK, FontPosture.REGULAR, 6);
				Button b = new Button();
				b.setText("modifier");
				b.setTranslateX(250);
				b.setTranslateY(70);
				b.setFont(fontB);
				b.setOnAction(new EventHandler() {
					@Override
					public void handle(Event event) {
						try {
							Modif();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
				p.getChildren().add(b);

			Line h = new Line();
			h.setEndX(300);
			p.getChildren().add(h);
			int k = (j+1) * 100;
			p.setTranslateX(0);
			p.setTranslateY(k);
			panlab.getChildren().add(p);
		}
	}
	@FXML
	public void Modif() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/ModifierCmd_view.fxml")));
		Scene scene = new Scene(root, 351, 400);
		Helpers.navigate(scene,ret);
	}
}