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

			while (line != null) {
				String[] setUp = line.split(",");
				System.out.println(Arrays.toString(setUp));

				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}

}