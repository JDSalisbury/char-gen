package io.jdsalisbury.github.chargen;

import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharGenApplication {
	static Random rand = new Random();
	static List<GamaOrigin> characterOriginList = FileReader.readCharsFromFile("gammaWorldCharSheet.csv");

	public static GamaOrigin getRandomOrigin() {
		int randomInt = rand.nextInt(characterOriginList.size());
		return characterOriginList.get(randomInt);

	}

	public static void main(String[] args) {
		SpringApplication.run(CharGenApplication.class, args);

		int randomIndex1 = rand.nextInt(characterOriginList.size());
		int randomIndex2 = rand.nextInt(characterOriginList.size());

		GamaOrigin randomOrigin1 = characterOriginList.get(randomIndex1);
		GamaOrigin randomOrigin2 = characterOriginList.get(randomIndex2);

		System.out.println(characterOriginList);
		System.out.println(characterOriginList.size());
		System.out.println(getRandomOrigin());
		System.out.println(getRandomOrigin());

	}
}
