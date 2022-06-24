package application.model;

import javax.sound.midi.*;
/**
 * This class is responsible for setting up the tempo engine
 * that the app runs off of.
 * @author wft480 xts949 zwl434 hfp280 
 *
 */
public class TempoEngine {
	float bpm;
	float ppq;
	int ticksPerBeat;
	Sequencer sequencer;
	
	/**
	 * The constructor for the tempo class.
	 * @param bpm
	 * @param ppq
	 * @param ticksPerBeat
	 */
	public TempoEngine( float bpm, float ppq, int ticksPerBeat ) {
		this.bpm = bpm;
		this.ppq = ppq;
		this.ticksPerBeat = ticksPerBeat;
		this.sequencer = initializeSequencer(bpm);
	}
	
	/**
	 * This method is responsible for starting the metronome sequencer.
	 */
	public void play() {

		sequencer.start();
	}
	
	/**
	 * This method is responsible for stopping the metronome sequencer.
	 */
	public void stop() {
		sequencer.stop();
	}
	
	/**
	 * This method is responsible for setting ticks.
	 * @param input
	 */
	public void setTicks(int input) {
		ticksPerBeat = input; 

		try {
			if(ticksPerBeat == 12) {
				System.out.println("TRIPLETS");
				Sequence newSequence = new Sequence(Sequence.PPQ, ticksPerBeat);
				initializeTrackTriplets(newSequence);
				sequencer.setSequence(newSequence);

				sequencer.setTempoInBPM((float) (bpm*1.5));
			}
			else {
				Sequence newSequence = new Sequence(Sequence.PPQ, ticksPerBeat);
				initializeTrack(newSequence);
				sequencer.setSequence(newSequence);
				sequencer.setTempoInBPM(bpm);
			}
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is responsible for incrementing the bpm. 
	 */
	public void incrementBpm() {
		bpm=bpm+5;
		
		if(bpm > 200) {
			bpm=200;
		}
		
		try {
			Sequence newSequence = new Sequence(Sequence.PPQ, ticksPerBeat);
			initializeTrack(newSequence);
			sequencer.setSequence(newSequence);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		sequencer.setTempoInBPM(bpm);
	}
	
	/**
	 * This method is responsible for decrementing the bpm. 
	 */
	public void decrementBpm() {
		bpm=bpm-5;
		
		if(bpm < 50) {
			bpm=50;
		}
		
		try {
			Sequence newSequence = new Sequence(Sequence.PPQ, ticksPerBeat);
			initializeTrack(newSequence);
			sequencer.setSequence(newSequence);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		sequencer.setTempoInBPM(bpm);
	}
	
	/**
	 * This method is responsible for setting the bpm.
	 * @param bpm
	 */
	public void setBpm(float bpm) {
		
		if(bpm > 200) {
			bpm=200;
		}
		
		if(bpm < 50) {
			bpm=50;
		}
		
		this.bpm=bpm;
		
		try {
			Sequence newSequence = new Sequence(Sequence.PPQ, ticksPerBeat);
			initializeTrack(newSequence);
			sequencer.setSequence(newSequence);
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}
		sequencer.setTempoInBPM(bpm);
		sequencer.setTempoInBPM(bpm);
	}
	
	/**
	 * This method is responsible for starting the metronome sequencer.
	 * @param bpm
	 * @return
	 */
	public Sequencer initializeSequencer(float bpm) {
		Sequencer sequencer = null;
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setTempoInBPM(bpm);
			Sequence sequence = new Sequence(Sequence.PPQ, ticksPerBeat);
			initializeTrack(sequence);
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
			return sequencer;
		} catch (MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace();
			return sequencer; 
		}
		
	}
	
	/**
	 * This method starts and stops the metronome.
	 * @param sequence
	 */
	public void initializeTrack(Sequence sequence) {
		Track track = sequence.createTrack();

		//(int code, int channel, int note, int velocity, int tick)
		MidiEvent noteOn = makeEvent(144,9,76,100,0);
		//(int code, int channel, int note, int velocity, int tick)
		MidiEvent noteOff = makeEvent(128,9,32,100,3);

		MidiEvent noteOnTwo = makeEvent(144,9,77,100,4);

		MidiEvent noteOffTwo = makeEvent(128,9,32,100,8);
		
		track.add(noteOn);
		track.add(noteOff);
		track.add(noteOnTwo);
		track.add(noteOffTwo);
		
	}

	/**
	 * This method is responsible for producing a triplet subdivision.
	 * @param sequence
	 */
	public void initializeTrackTriplets(Sequence sequence) {
		Track track = sequence.createTrack();

		//(int code, int channel, int note, int velocity, int tick)
		MidiEvent noteOn = makeEvent(144,9,76,100,0);
		//(int code, int channel, int note, int velocity, int tick)
		MidiEvent noteOff = makeEvent(128,9,32,100,4);

		MidiEvent noteOnTwo = makeEvent(144,9,77,100,6);

		MidiEvent noteOffTwo = makeEvent(128,9,32,100,10);

		MidiEvent noteOnThree = makeEvent(144,9,77,100,12);

		MidiEvent noteOffThree = makeEvent(128,9,32,100,18);
		
		track.add(noteOn);
		track.add(noteOff);
		track.add(noteOnTwo);
		track.add(noteOffTwo);
		track.add(noteOnThree);
		track.add(noteOffThree);
		
	}
	
	/**
	 * This method enables us to use the midi library.
	 * @param command
	 * @param channel
	 * @param note
	 * @param velocity
	 * @param tick
	 * @return
	 */
	public static MidiEvent makeEvent(int command, int channel, int note, int velocity, int tick) { 
	
		MidiEvent event = null; 
	
		try { 
		
			// ShortMessage stores a note as command type, channel, 
			// instrument it has to be played on and its speed. 
			ShortMessage a = new ShortMessage(); 
			a.setMessage(command, channel, note, velocity); 
			
			// A midi event is comprised of a short message(representing 
			// a note) and the tick at which that note has to be played 
			event = new MidiEvent(a, tick); 
		} 
		catch (Exception ex) { 
		
			ex.printStackTrace(); 
		} 
			return event; 
	}
	
	
	/**
	 * Gets and returns the value of ppq.
	 * @return ppq
	 */
	public float getPpq() {
		return ppq;
	}

	/**
	 * Sets value of ppq.
	 * @param ppq
	 */
	public void setPpq(float ppq) {
		this.ppq = ppq;
	}

	/**
	 * Gets and returns the value of ticksPerBeat.
	 * @return ticksPerBeat
	 */
	public int getTicksPerBeat() {
		return ticksPerBeat;
	}

	/**
	 * Sets the value of ticksPerBeat.
	 * @param ticksPerBeat
	 */
	public void setTicksPerBeat(int ticksPerBeat) {
		this.ticksPerBeat = ticksPerBeat;
	}

	/**
	 * Gets and returns the value of sequencer.
	 * @return sequencer
	 */
	public Sequencer getSequencer() {
		return sequencer;
	}

	/**
	 * Sets the value of sequencer.
	 * @param sequencer
	 */
	public void setSequencer(Sequencer sequencer) {
		this.sequencer = sequencer;
	}

	/**
	 * Gets and sets the value of bpm.
	 * @return bpm
	 */
	public float getBpm() {
		return bpm;
	}
	
}