package ma.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.Pane;

public class ModifierCmd_Controller implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private Hyperlink ret;

	@FXML
	public void retour() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/RechCmdRslt_view.fxml")));
		Scene scene = new Scene(root, 354, 400);
		Helpers.navigate(scene,ret);
	}
}
