package com.theironyard;
import javax.sound.midi.*;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();

            System.out.println("Successfully got a sequencer ");
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        } //close catch
    } //close play

} //close class
