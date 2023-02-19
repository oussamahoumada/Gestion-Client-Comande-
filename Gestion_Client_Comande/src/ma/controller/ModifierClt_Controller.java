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
import javafx.scene.layout.Pane;


public class ModifierClt_Controller implements Initializable {
	@FXML
	private Hyperlink retour;
	@FXML
	private Button modif;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void retour() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/CherchCltRslt_view.fxml")));
		Scene scene = new Scene(root, 332, 400);
		Helpers.navigate(scene,retour);
	}
	@FXML
	public void modif() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/CherchCltRslt_view.fxml")));
		Scene scene = new Scene(root, 332, 400);
		Helpers.navigate(scene,modif);
	}
}
