package ma.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;

public class Produit_Controller  implements Initializable{
	@FXML
	private Pane panlab;
	@FXML
	private Button save;
	@FXML
	private Hyperlink ret;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Helpers.TextChange(panlab);
	}

	@FXML
	public void add() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Home_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,save);
	}

	@FXML
	public void retour() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Home_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,ret);
	}
}