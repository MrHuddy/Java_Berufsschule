package datenspeicherung;

import fachkonzeptklasse.Endstand;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BestenlisteSpeicher {
	String [] test = new String[2];
	public Endstand [] liesEndstaendeAusSpeicher() {
		try {
			File file = new File("Bestenliste.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			
			String line;
			while ((line = br.readLine()) !=null){
				test[1] = line;
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void schreibeEndstandInSpeicher(Endstand pEndstand) {
		
	}
}
