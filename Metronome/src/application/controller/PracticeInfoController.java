package application.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 * This class is responsible for displaying the practice info and handling any user interaction with the practice info scene.
 * @author wft480 xts949 zwl434 hfp280
 */
public class PracticeInfoController implements EventHandler<ActionEvent>, Initializable{
	
	@FXML
	public Label hoursToday = new Label();
	@FXML
	public Label hours7Days = new Label();
	@FXML
	public ProgressIndicator hoursGoal = new ProgressIndicator();
	
	/**
	 * This method is responsible for taking the user back to the Options menu if the user clicks the options button.
	 */
	@Override
	public void handle(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Options.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is responsible for setting display the info whenever the user is switching to the scene
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1){}
	
	

}
