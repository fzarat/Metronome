package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class handles any user interaction with the options menu.
 * @author wft480 xts949 zwl434 hfp280
 *
 */
public class OptionsController implements EventHandler<ActionEvent>{

	/**
	 * This method is repsonsible for switching to the metronome scene if the use clicks the back button.
	 */
	@Override
	public void handle(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
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
	 * This method is repsonsible for switching to the practice info scene if the use clicks the practice info button.
	 */
	public void handlePracticeInfo(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/PracticeInfo.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is repsonsible for switching to the credits scene if the use clicks the credits button.
	 */
	public void handleCredits(ActionEvent arg0) {
		Scene scene = ((Scene) ((Node) arg0.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Credits.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is repsonsible for switching to the quiz scene if the use clicks the quiz button.
	 */
	public void handleQuiz(ActionEvent arg0) {
		Scene scene = ((Scene) ((Node) arg0.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Quiz.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
