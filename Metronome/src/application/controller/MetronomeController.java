package application.controller;

import java.io.IOException;

import application.model.Metronome;
import application.model.TempoEngine;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * This class handles any user interaction with the metronome scene.
 * @author wft480 xts949 zwl434 hfp280
 */
public class MetronomeController implements EventHandler<ActionEvent> {
	@FXML
	public ToggleButton start;
	@FXML
	public Button timerStart;
	@FXML
	public Button timerStop;
	@FXML
	public TextField tempoField;
	@FXML
	public TextField timerField;
	@FXML
	public Slider tempoSlider;
	
	Timeline timeline = new Timeline(new KeyFrame( Duration.millis(1000),
	        ae -> timerStart()
	        ));
	Metronome metronome = new Metronome();
	TempoEngine tempoEngine = metronome.getTempoEngine();
	int time = 0;
	int hours;
	
	/**
	 * A necessary but not used method.
	 */
	@Override
	public void handle(ActionEvent event){}
	
	/**
	 * This method is responsible for starting the timer.
	 */
	public void timerStart() {
		time+=1;
		System.out.println(time);
		
		if (time < 10 ) {
			timerField.setText("0:0" + time);
		}
		
		else if (time < 60 ) {
			timerField.setText("0:" + time);
		}
		
		else {
			hours = time/60;
			

			if (time-hours*60 < 10 ) {
				timerField.setText(hours + ":0" + (time-hours*60));
			}
			
			else if (time-hours*60 < 60 ) {
				timerField.setText(hours + ":" + (time-hours*60));
			}
		}
	}
	
	/**
	 * A necessary but not used method.
	 * @param event
	 */
	public void handleTimerField(ActionEvent event) {
	}
	
	/**
	 * This method is repsonsible for starting the timer.
	 * @param event
	 */
	public void handleTimerStart(ActionEvent event) {
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
	
	/**
	 * This method is responsible for stopping the timer.
	 * @param event
	 */
	public void handleTimerStop(ActionEvent event) {
		timeline.stop();
	}

	/**
	 * This method is responsible for whenever a user starts to drag the tempo slider.
	 */
	public void handleMouseDrag() {
	    tempoField.setText((int) tempoSlider.getValue()+" ");
	}
	
	/**
	 * This method is responsible for whenever a user stops dragging the tempo slider.
	 */
	public void handleRelease() {
	    int sliderValue = (int) tempoSlider.getValue();
	    System.out.println(sliderValue + " ");
	    tempoField.setText((int) tempoSlider.getValue()+" ");
	    tempoEngine.setBpm(sliderValue);
	}
	
	/**
	 * A necessary but not used method.
	 * @param event
	 */
	public void handleTime(ActionEvent event){}
	
	/**
	 * This method handles whenever 
	 * @param event
	 */
	public void handleTempo(ActionEvent event) {
		float bpm = Float.parseFloat(tempoField.getText());
		tempoEngine.setBpm(bpm);
		tempoSlider.setValue(bpm);
	}
	
	/**
	 * This method decrements the tempo whenever the user clicks the minus button.
	 * @param event
	 */
	public void handleMinus(ActionEvent event) {
		tempoEngine.decrementBpm();
		String bpm = Integer.toString((int) tempoEngine.getBpm());
		tempoField.setText(bpm);
		tempoSlider.setValue(tempoEngine.getBpm());
	}
	
	/**
	 * This method increments the tempo whenever the user clicks the plus button.
	 * @param event
	 */
	public void handlePlus(ActionEvent event) {
		tempoEngine.incrementBpm();
		String bpm = Integer.toString((int) tempoEngine.getBpm());
		tempoField.setText(bpm);
		tempoSlider.setValue(tempoEngine.getBpm());
	}
	
	/**
	 * An unused method.
	 * @param event
	 */
	public void handleTap(ActionEvent event){}
	
	/**
	 * This method handles user interaction with the start and stop button.
	 * @param event
	 */
	public void handleStart(ActionEvent event) {
		if(start.isSelected()) {
			start.setText("Stop");
			tempoEngine.play();
		}

		else {
			start.setText("Start");
			tempoEngine.stop();
		}
	}
	
	/**
	 * This method plays a quarter note subdivision whenever the user clicks on the quarter button.
	 * @param event
	 */
	public void handleQuarter(ActionEvent event) {
		tempoEngine.setTicks(4);
	}
	
	/**
	 * This method plays an eighth note subdivision whenever the user clicks on the eighth button.
	 * @param event
	 */
	public void handleEighth(ActionEvent event) {
		tempoEngine.setTicks(8);
	}

	/**
	 * This method plays a triplet subdivision whenever the user clicks on the triplet button.
	 * @param event
	 */
	public void handleTriplet(ActionEvent event) {
		tempoEngine.setTicks(12);
	}
	
	/**
	 * This method plays a sixteenth note subdivision whenever the user clicks on the sixteenth button.
	 * @param event
	 */
	public void handleSixteenth(ActionEvent event) {
		tempoEngine.setTicks(16);
	}
	
	/**
	 * This method switches to the start scene whenever the user clicks the back button.
	 * @param arg0
	 */
	public void handleHome(ActionEvent arg0) {
		Scene scene = ((Scene) ((Node) arg0.getSource()).getScene());
		Stage mainStage = (Stage)scene.getWindow();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Start.fxml"));
			mainStage.setScene(new Scene(root, 650, 520));
			mainStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method switches to the options menu whenever the user clicks the options button.
	 * @param arg0
	 */
	public void handleOptions(ActionEvent arg0) {
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
