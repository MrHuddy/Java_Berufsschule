package datenspeicherung;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import fachkonzept.Endstand;

public class BestenlisteSpeicher {
    public Endstand[] liesEndtstaendeAusSpeicher() throws IOException {

        // BufferedWriter writer = new BufferedWriter(new FileWriter("Endstaende.txt"));
        // writer.write("Arthur,345");

        // writer.close();
        BufferedReader br = new BufferedReader(new FileReader("Endstaende.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();

            String[] lines = everything.split("\n");
            Endstand[] endstands = new Endstand[lines.length];
            for (int i = 0; i < lines.length; i++) {
                String name = lines[i].split(",")[0];
                String punkte = lines[i].split(",")[1].trim();
                endstands[i] = new Endstand(name, Integer.valueOf(punkte));
            }

            Arrays.sort(endstands);

            br.close();
            return endstands;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Endstand[0];
        }

        // return new Endstand[0];
    }

    public void schreibeEndstandInSpeicher(Endstand pEndstand) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Endstaende.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            br.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("Endstaende.txt"));
            writer.write(everything + pEndstand.liesName() + "," + pEndstand.liesPunkte() + "\n");

            writer.close();

        } catch (Exception e) {

        }
    }
}
