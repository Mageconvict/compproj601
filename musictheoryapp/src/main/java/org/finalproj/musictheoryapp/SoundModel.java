package org.finalproj.musictheoryapp;

import javafx.scene.Parent;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import java.util.List;

public class SoundModel {
    private MidiChannel channel;

    public void handleSound(Bar bar) {
        loadChannel();
        channel.setMono(true);

        List<Note> notes = bar.getNotes();

        for (Note note : notes) {
            channel.noteOn(note.getPitch(), note.getDynamic());
        }
    }

    private void loadChannel() {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);

            channel = synth.getChannels()[0];

        } catch (MidiUnavailableException e) {
            System.out.println("Cannot get synth");
            e.printStackTrace();
        }
    }
}
