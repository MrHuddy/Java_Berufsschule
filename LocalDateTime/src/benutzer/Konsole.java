package benutzer;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Konsole {

	public static void main(String[] args) {
		LocalDateTime test;
		LocalTime test1 = LocalTime.now();
		LocalTime test2 = LocalTime.now();
		String ba = test1.toString();
		String ba1 = test2.toString();
		int lol = Integer.parseInt(ba) - Integer.parseInt(ba1);

		System.out.println(lol);
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(test1);
		}

	}

}
