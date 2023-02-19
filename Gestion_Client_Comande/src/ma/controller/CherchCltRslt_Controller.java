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

public class CherchCltRslt_Controller implements Initializable{
	@FXML
	private Hyperlink retour;
	@FXML
	private Button modif;
	@FXML
	private Button comnd;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	public void retour() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/CherchClt_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,retour);
	}
	@FXML
	public void modif() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/ModifierClt_view.fxml")));
		Scene scene = new Scene(root,351,398);
		Helpers.navigate(scene,modif);
	}
	@FXML
	public void comnd() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/RechCmdRslt_view.fxml")));
		Scene scene = new Scene(root,406,454);
		Helpers.navigate(scene,modif);
	}
}
