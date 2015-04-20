package de.fowler.main.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		String erg = "Welcome to the Movie Store\nLet's get the Statement\nRental Record for joe\n\tTitle\t\tDays\tAmount\n\tmovie1\t\t10\t30.0\n\tmovie2\t\t5\t4.5\nAmount owed is 34.5\nYou earned 3 frequent renter points\n";
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String is = "";
			while(br.ready()){
				is += br.readLine()+ System.lineSeparator();
			}
			br.close();
//			System.err.println("SOLL:");
//			System.err.println(erg);
//			System.err.println("IST:");
//			System.err.println(is);
			assertTrue(erg.equals(is));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fail("FileNotFound");
		} catch (IOException e) {
			e.printStackTrace();
			fail("IOException");
		}
	}

}
