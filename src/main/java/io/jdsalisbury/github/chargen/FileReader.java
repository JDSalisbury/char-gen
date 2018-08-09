package io.jdsalisbury.github.chargen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

	protected String fileName = "gammaWorldCharSheet.csv";

	public List<GamaOrigin> readCharsFromFile() {
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(pathToFile)) {

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;
	}
}
