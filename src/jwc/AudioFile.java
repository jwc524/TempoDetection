package jwc;

import java.io.*;

public class AudioFile extends File {

    private String pathname;
    private int duration;
    private double size;
    private double tempo;
    private String extension;
    private byte[] data;

    public AudioFile(String pathname) {
        super(pathname);

        this.pathname = pathname;
        duration = findDuration();
        size = findSize();
        extension = findExtension();

        try {
            data = gatherData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Calculates the duration of the audio file in seconds. */
    private int findDuration() {
        return 0;
    }

    /** Calculates the size of the audio file in megabytes. */
    private double findSize() {
        return 0.0;
    }

    /** Sets the extension of the file based on the input filepath. */
    private String findExtension() {
        int length = pathname.length();
        StringBuilder ext = new StringBuilder();

        for (int i = length; i > 0; i--) {
            String selection = pathname.substring(i-1, i);
            if (!selection.equals(".")) {
                ext.insert(0, selection);
            } else {
                ext.insert(0, selection);
                break;
            }
        }

        return ext.toString();
    }

    /** Returns the size of the audio file in megabytes. */
    public double getSize() {
        return size;
    }

    /** Returns the name of the audio file without the extension. */
    public String getName() {
        return super.getName();
    }

    /** Returns the path of the audio file. */
    public String getPath() {
        return pathname;
    }

    /** Returns the extension of the audio file. */
    public String getExtension() {
        return extension;
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

        output += "-------------------------------------";
        output += "\nNAME: " + this.getName();
        output += "\nDURATION: " + getDurationFancy();
        output += "\nSIZE: " + getSize() + " MB";
        output += "\nFILE TYPE: " + getExtension().toUpperCase();
        output += "\nTEMPO: " + getTempo() + " BPM";
        output += "\n-------------------------------------\n";

        return output;
    }

    /** Reads the audio file and stores the data into a byte array. */
    private byte[] gatherData() throws IOException {
        return null;
    }

}