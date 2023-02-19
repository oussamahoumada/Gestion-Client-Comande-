package ma.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import Connection.DbConnexion;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Login_Controller {
	@FXML
	public Button submit;
	@FXML
	public TextField user;
	@FXML
	public PasswordField pass;

	@FXML
	public void nav() throws IOException, SQLException{
		DbConnexion dbc=new DbConnexion();
		Connection cnx=dbc.getConnection();
		String req="select * from tst where userName ="+ user.getText()+" and pass = "+pass.getText();

		Statement statement=cnx.createStatement();
		ResultSet resultset=statement.executeQuery(req);

		if(resultset.next()){
			SplitPane root = SplitPane.class.cast(FXMLLoader.load(Main.class.getResource("../ma/View/Home_view.fxml")));
			Scene scene = new Scene(root, 600, 450);
			Helpers.navigate(scene,submit);
		}
		else{
			Alert a=new Alert(AlertType.ERROR);
			a.setTitle("error");
			a.setContentText("pass incorrect");
			a.show();
		}
		if(user.getText().isEmpty() || pass.getText().isEmpty()){
			Alert a=new Alert(AlertType.ERROR);
			a.setTitle("error");
			a.setContentText("champs vide !!!");
			a.show();
			return;
		}

	}
}