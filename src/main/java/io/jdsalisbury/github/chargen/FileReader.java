package io.jdsalisbury.github.chargen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

	public static List<GamaOrigin> readCharsFromFile(String fileName) {
		List<GamaOrigin> originList = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(pathToFile)) {

			String line = reader.readLine();

			while (isACharOrigin(line)) {
				String[] setUp = line.replace(" ", "").split(",");

				GamaOrigin newOrigin = setUpGamaOrigin(setUp);
				originList.add(newOrigin);
				line = reader.readLine();
			}

			line = reader.readLine();

		} catch (IOException e) {
			e.printStackTrace();

		}
		return originList;
	}

	private static GamaOrigin setUpGamaOrigin(String[] meta) {
		String origin = meta[0];
		String ability = meta[1];
		String skill = meta[2];
		String bonus = meta[3];
		int ac = Integer.parseInt(meta[4]);
		int fort = Integer.parseInt(meta[5]);
		int ref = Integer.parseInt(meta[6]);
		int will = Integer.parseInt(meta[7]);
		return new GamaOrigin(origin, ability, skill, bonus, ac, fort, ref, will);
	}

	public static boolean isACharOrigin(String a) {
		return a.length() != 0;
	}

}