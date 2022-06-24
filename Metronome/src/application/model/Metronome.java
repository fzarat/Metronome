package application.model;

import java.util.Timer;
/**
 * This class is responsible for setting our metronome up to run.
 * @author wft480 xts949 zwl434 hfp280
 *
 */
public class Metronome {
	int defaultTicks = 4;
	TempoEngine tempoEngine;
	int ticks = defaultTicks;
	Timer timer;
	
	/**
	 * Constructor for the metronome class.
	 */
	public Metronome() {
		
		this.tempoEngine = new TempoEngine(100,1,ticks); //(float bpm, float ppq, int ticks)
		timer = new Timer();
	}

	/**
	 * This method gets and returns the value for tempoEngine.
	 * @return timer
	 */
	public TempoEngine getTempoEngine() {
		return tempoEngine;
	}

	/**
	 * This method sets the value of tempoEngine. 
	 * @param timer
	 */
	public void setTempoEngine(TempoEngine tempoEngine) {
		this.tempoEngine = tempoEngine;
	}
	
	/**
	 * This method gets and returns the value for timer.
	 * @return timer
	 */
	public Timer getTimer() {
		return timer;
	}

	/**
	 * This method sets the value of timer. 
	 * @param timer
	 */
	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	
}
