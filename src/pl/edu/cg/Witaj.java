package pl.edu.cg;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Witaj {

	public static void main(String[] args) {
		
		System.out.println("Data " + LocalDate.now());
		System.out.println("Witaj Piotrek. Jest: " + LocalDateTime.now());
	}

}
