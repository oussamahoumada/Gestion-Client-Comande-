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
import javafx.scene.control.SplitPane;
import javafx.scene.layout.Pane;

public class List_Controller implements Initializable {
	@FXML
	private Pane panlab;
	@FXML
	private Button NewCmd;
	@FXML
	private Button CherCmd;
	@FXML
	private Button ChercheClt;
	@FXML
	private Button NewClt;
	@FXML
	private Button addPrd;
	@FXML
	private Button modif;
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		Helpers.TextChange(panlab);
	}

	@FXML
	public void NewCommad() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Commande_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,NewCmd);
	}
	@FXML
	public void Chercher() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/RechCmd_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,CherCmd);
	}
	@FXML
	public void ChercheClt() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/CherchClt_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,ChercheClt);
	}

	@FXML
	public void NewClt() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Client_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,NewClt);
	}
	@FXML
	public void addPrd() throws IOException{
		SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Produit_view.fxml")));
		Scene scene = new Scene(root, 703, 400);
		Helpers.navigate(scene,addPrd);
	}
	@FXML
	public void modif() throws IOException{
		Pane root = Pane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/ModifierProduit_view.fxml")));
		Scene scene = new Scene(root, 373, 325);
		Helpers.navigate(scene,modif);
	}
}