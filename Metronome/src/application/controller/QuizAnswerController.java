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
 * This class is responsible for informing the user whether or not the user got a question
 * correct by switching to either a correct or incorrect scene
 * @author wft480 xts949 zwl434 hfp280
 *
 */
public class QuizAnswerController implements EventHandler<ActionEvent> {

	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	@Override
	public void handle(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle2(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle3(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct2.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle4(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong2.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle5(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct3.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle6(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong3.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle7(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct4.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle8(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong4.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle9(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct5.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle10(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong5.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle11(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct6.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle12(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong6.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle13(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct7.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle14(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong7.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle15(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct8.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle16(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong8.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle17(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct9.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle18(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong9.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question correct.
	 * @param event
	 */
	public void handle19(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Correct10.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method displays a scene that tells the user they got a question wrong.
	 * @param event
	 */
	public void handle20(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
		Stage mainStage = (Stage) scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Wrong10.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method takes the user back to quiz start scene if they click exit
	 * @param event
	 */
	public void handleBack(ActionEvent event) {
		Scene scene = ((Scene) ((Node) event.getSource()).getScene());
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