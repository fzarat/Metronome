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
 * This class is repsonsible for displaying and handling user interaction with the quiz.
 * @author wft480 xts949 zwl434 hfp280
 *
 */
public class QuizController implements EventHandler<ActionEvent> {

	/**
	 * This method is responsible for going back to the options menu if the user clicks back.
	 * @param event
	 */
	public void handleBack(ActionEvent event) {
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
	 * This method is repsonsible for displaying the 1st question on the quiz.
	 * @param event
	 */
	public void handle(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q1.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 
	
	/**
	 * This method is repsonsible for displaying the 2nd question on the quiz.
	 * @param event
	 */
	public void handle2(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q2.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 3rd question on the quiz.
	 * @param event
	 */
	public void handle3(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q3.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 4th question on the quiz.
	 * @param event
	 */
	public void handle4(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q4.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 5th question on the quiz.
	 * @param event
	 */
	public void handle5(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q5.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 6th question on the quiz.
	 * @param event
	 */
	public void handle6(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q6.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 7th question on the quiz.
	 * @param event
	 */
	public void handle7(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q7.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 8th question on the quiz.
	 * @param event
	 */
	public void handle8(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q8.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 9th question on the quiz.
	 * @param event
	 */
	public void handle9(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q9.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for displaying the 10th question on the quiz.
	 * @param event
	 */
	public void handle10(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Q10.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is repsonsible for exiting the quiz and taking the user back to the options menu.
	 * @param event
	 */
	public void handleExit(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Options.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
