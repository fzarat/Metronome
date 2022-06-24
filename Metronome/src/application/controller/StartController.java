package application.controller;

import java.io.File;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * This is class is responsible for displaying the start scene and playing "The Lick"
 * whenever the app is launched.
 * @author wft480 xts949 zwl434 hfp280
 */
public class StartController implements Initializable, EventHandler<ActionEvent>{
	@FXML
	private MediaPlayer mp;
	//private Media me;


	/**
	 * This method is responsible for switching to the metronome if the user clicks the the screen.
	 * @param arg0
	 */
	@Override
	public void handle(ActionEvent arg0) {
		Scene scene = ((Scene) ((Node) arg0.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Metronome.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is responsible for playing "The Lick" whenever the app is launched.
	 * @param location
	 * @param resources
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media me = new Media(new File("TheLick.wav").toURI().toString());
		MediaPlayer mp = new MediaPlayer(me);
		mp.setStopTime(Duration.seconds(12));
		mp.play();
	}
}
