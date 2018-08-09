package io.jdsalisbury.github.chargen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileReader {

	public static List<GamaOrigin> readCharsFromFile(String fileName) {
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(pathToFile)) {

			String line = reader.readLine();

			while (isACharOrigin(line)) {
				String[] setUp = line.split(",");
				// for (String charOrigin : setUp) {
				// System.out.println(charOrigin.replace(" ", ""));
				// }
				System.out.println(Arrays.toString(setUp).replace(" ", ""));

				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}

	public static boolean isACharOrigin(String a) {
		return a.length() != 0;
	}

}