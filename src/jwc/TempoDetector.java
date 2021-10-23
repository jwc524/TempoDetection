package jwc;

import java.util.Scanner;

public class TempoDetector {

    private String version = "1.0.1";
    private String lastUpdated = "10/23/2021 @ 12:07PM";

    private AudioFile file;
    private Scanner scanner;

    public static void main(String[] args) {
        TempoDetector detector = new TempoDetector();
        detector.init();
    }

    private void init() {
        // read title from titleText.txt

        System.out.println("- - - - AUDIO FILE TEMPO DETECTOR - - - -");
        System.out.println("V" + version + " (last updated: " + lastUpdated + ")");

        run();
    }

    private void run() {
        System.out.println("\nPLEASE INPUT PATH TO AUDIO FILE:");
        System.out.print(">   ");

        scanner = new Scanner(System.in);
        String pathname = scanner.nextLine();
        file = new AudioFile(pathname.trim());

        detectTempo();

        System.out.println(file.getDetails());

        System.out.println("Would you like to analyze another file? (Y/N)");
        System.out.print(">  ");
        String input = scanner.next().trim();

        if (input.equalsIgnoreCase("Y")) {
            run();
        } else if (input.equalsIgnoreCase("N")) {
            System.out.println("\nThank you for using Tempo Detector! Follow me on Instagram @conathanjole to stay updated.");
        }
    }

    private void detectTempo() {
        double tempo = 0.0;



        file.setTempo(tempo);
    }

}