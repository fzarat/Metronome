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
 * This class hnadles any user interaction with the credits scene.
 * @author wft480 xts949 zwl434 hfp280
 */
public class CreditsController implements EventHandler<ActionEvent> {

	/**
	 * Switches scenes when the user clicks back.
	 */
	@Override
	public void handle(ActionEvent arg0) {
		Scene scene = ((Scene) ((Node) arg0.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Options.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
