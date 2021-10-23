package jwc;

import java.io.File;

public class AudioFile extends File {

    private String name;
    private double size;
    private int duration;
    private double tempo;

    public AudioFile(String pathname) {
        super(pathname);

        name = getName();
        duration = findDuration();
        size = findSize();
    }

    /** Calculates the duration of the audio file in seconds. */
    private int findDuration() {
        return 0;
    }

    /** Calculates the size of the audio file in megabytes. */
    private double findSize() {
        return 0.0;
    }

    /** Returns the name of the audio file. */
    public String getName() {
        return name;
    }

    /** Returns the size of the audio file in megabytes. */
    public double getSize() {
        return size;
    }

    /** Returns the duration of the audio file in seconds. */
    public int getDurationSeconds() {
        return duration;
    }

    /** Returns the tempo of the song. */
    public double getTempo() {
        return tempo;
    }

    /** Sets the tempo given a double. */
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    /** Returns the duration of the audio file in the format MM:SS. */
    public String getDurationFancy() {
        return (duration / 60) + ":" + (duration % 60);
    }

    public String getDetails() {
        String output = "";

        output += "----------------------------------";
        output += "\nNAME: " + getName();
        output += "\nDURATION: " + getDurationFancy();
        output += "\nSIZE (MB): " + getSize();
        output += "\nTEMPO: " + getTempo() + " BPM";
        output += "\n----------------------------------\n";

        return output;
    }

}