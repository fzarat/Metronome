package application.model;

import java.util.Timer;
import java.util.TimerTask;

/**
 * This class is responsible for setting up our practice mode.
 * @author wft480 xts949 zwl434 hfp280
 *
 */
public class Practice {
	private Double weekly;
	private Double daily;
	private Double goal;
	public Timer time;
	
	/**
	 * Constructor for the practice class.
	 * @param weekly
	 * @param daily
	 * @param goal
	 */
	public Practice(Double weekly, Double daily, Double goal){
		this.weekly = weekly;
		this.daily = daily;
		this.goal = goal;
		this.time = new Timer();
	}
	
	/**
	 * Task to start our timer.
	 */
	TimerTask tTask = new TimerTask()
			{
		@Override
		public void run() {
			time.schedule(tTask, 5000l);
		}
	};
	
	/**
	 * @return the weekly
	 */
	public Double getWeekly() {
		return weekly;
	}

	/**
	 * @param weekly the weekly to set
	 */
	public void setWeekly(Double weekly) {
		this.weekly = weekly;
	}

	/**
	 * @return the daily
	 */
	public Double getDaily() {
		return daily;
	}

	/**
	 * @param daily the daily to set
	 */
	public void setDaily(Double daily) {
		this.daily = daily;
	}

	/**
	 * @return the goal
	 */
	public Double getGoal() {
		return goal;
	}

	/**
	 * @param goal the goal to set
	 */
	public void setGoal(Double goal) {
		this.goal = goal;
	}

	/**
	 * @return the time
	 */
	public Timer getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Timer time) {
		this.time = time;
	}
 

}
