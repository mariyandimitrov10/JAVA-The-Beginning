package exercise_07;

import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

public class Eingabetest {

	public static void main(String[] args) {
		String targetString = "Fischers Fritz fischt frische Fische";
	
		Instant startInput = Instant.now();
		String input = JOptionPane.showInputDialog
				("Bitte geben Sie folgenden Satz fehlerfrei ein: " + targetString);
		Instant endInput = Instant.now();
		
		Duration inputDuration = Duration.between(startInput, endInput);
		
		String checkInput = "";
		
		if(input.equals(targetString)) {
			checkInput = "Fehlerfrei!  ";
			
		}else checkInput = "Falsche Eingabe!  ";
		
		JOptionPane.showMessageDialog(null, checkInput + " Zeit: " + inputDuration.toMinutesPart() + " Minuten; "
				+ inputDuration.toSecondsPart() + " Sekunden; " 
				+ inputDuration.toMillisPart() + " Milisekunden; ");
	}
	

}
