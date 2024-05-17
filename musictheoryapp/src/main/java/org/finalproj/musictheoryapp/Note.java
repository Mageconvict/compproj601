package org.finalproj.musictheoryapp;

public class Note {
    private int pitch;
    private int dynamic;

    public Note(int pitch, int duration) {
        this.pitch = pitch;
        this.dynamic = duration;
    }

    public int getDynamic() {
        return dynamic;
    }

    public void setDynamic(int dynamic) {
        this.dynamic = dynamic;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }
}
