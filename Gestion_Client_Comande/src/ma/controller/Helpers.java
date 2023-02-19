package ma.controller;

import java.io.IOException;

import application.Main;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Helpers {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void TextChange(Pane panlab) {
		for (int j = 0; j < 3; j++) {
			Pane p = new Pane();
			for (int i = 0; i < 5; i++) {
				Label l = new Label();
				Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 15);
				l.setFont(font);
				l.setTextFill(Color.BLACK);
				l.setTranslateX(7);
				int y = 20 * i;
				l.setTranslateY(y);
				l.setText("test label");
				p.getChildren().add(l);
			}

			Button btn=createBtn(50,"Modifier");
			    btn.setOnAction(new EventHandler() {
					@Override
					public void handle(Event event) {
						try {
							Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/ModifierCmd_view.fxml")));
							Scene scene = new Scene(root, 351, 400);
							navigate(scene,btn);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				});
				p.getChildren().add(btn);
				p.getChildren().add(createBtn(65,"Annulée"));
				p.getChildren().add(createBtn(80,"  Livrée  "));

			Line h = new Line();
			h.setEndX(300);
			p.getChildren().add(h);
			int k = j* 100;
			p.setTranslateX(0);
			p.setTranslateY(k);
			panlab.getChildren().add(p);
		}
	}
	public static Button createBtn(int y,String txt){
			Font fontB = Font.font("Brush", FontWeight.BLACK, FontPosture.REGULAR, 6);
			Button b = new Button();
			b.setText(txt);
			b.setTranslateX(250);
			b.setTranslateY(y);
			b.setFont(fontB);
			return b;
	}
	public static void navigate(Scene scene,Button btnclose) throws IOException{
		Stage stage = (Stage) btnclose.getScene().getWindow();
	    stage.close();

	    Stage stg=new Stage();
	    stg.initStyle(StageStyle.UNDECORATED);
		stg.setScene(scene);
		stg.show();
	}
	public static void navigate(Scene scene,Hyperlink h) throws IOException{
		Stage stage = (Stage) h.getScene().getWindow();
	    stage.close();

		Stage stg=new Stage();
		stg.initStyle(StageStyle.UNDECORATED);
		stg.setScene(scene);
		stg.show();
	}
}