package chapitre8_27082023_lastPart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReaderSystemIn {

	public static void main(String[] args) throws IOException {
		
		// méthode 1  : Old Way
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String phrase = reader.readLine();
		System.out.println("Vous avez taper : "+phrase);
		
		Scanner sc = new Scanner(System.in);
		String mot = sc.nextLine();

	}

}
