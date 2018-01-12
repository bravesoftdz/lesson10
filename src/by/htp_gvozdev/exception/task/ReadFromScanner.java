package by.htp_gvozdev.exception.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromScanner {

	public static void getReadFromScanner() {
		File file = new File("src\\by\\htp_gvozdev\\exception\\task\\task.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String[] arr = new String[3];
			for (int i = 0; i < 3; i++) {
				String line = sc.nextLine().trim();
				System.out.println(line);
				arr[i] = line;
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
				System.out.println("default");
				break;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
