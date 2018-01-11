package by.htp_gvozdev.exception.exeption;

import java.io.IOException;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {

		try {
			int a = doSmth(0);
			System.err.println(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int doSmth(int value) throws IOException {
		if (value == 0) {
			throw new IOException();
		} else if (value == 1) {
			try {
				throw new SQLException();
			} catch (SQLException e) {
				e.printStackTrace();
				System.exit(1);
			} finally {
				return 28;
			}
		} else {
			return 3;
		}
	}
}