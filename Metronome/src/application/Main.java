package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * This class launches the app.
 * @author wft480 xts949 zwl434 hfp280 
 */
public class Main extends Application {
	/**
	 * This method is responsible for setting the scence to change to.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("./view/Start.fxml"));
			primaryStage.setScene(new Scene(root, 650, 520));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method launches the app.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
