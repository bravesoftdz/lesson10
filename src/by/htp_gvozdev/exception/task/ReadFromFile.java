package by.htp_gvozdev.exception.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	@SuppressWarnings("resource")
	public static void getReadFromFile() {
		try {
			File file = new File("src\\by\\htp_gvozdev\\exception\\task\\task.txt");
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			String[] arr = new String[3];
			for (int i = 0; i < 3; i++) {
				System.out.println(line);
				arr[i] = line;
				line = reader.readLine();
			}

			switch (arr[1]) {
			case "-":
				System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]));
				break;
			case "+":
				System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]));
				break;
			case "*":
				System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
				break;
			case "/":
				System.out.println(Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]));
				break;
			default:
				System.out.println("I don't know =)");
				break;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
