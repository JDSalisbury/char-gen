package io.jdsalisbury.github.chargen;

import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CharGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharGenApplication.class, args);

		List<GamaOrigin> characterOriginList = FileReader.readCharsFromFile("gammaWorldCharSheet.csv");

		Random rand = new Random();
		int randomIndex1 = rand.nextInt(characterOriginList.size());
		int randomIndex2 = rand.nextInt(characterOriginList.size());

		GamaOrigin randomOrigin1 = characterOriginList.get(randomIndex1);
		GamaOrigin randomOrigin2 = characterOriginList.get(randomIndex2);

		System.out.println(characterOriginList);
		System.out.println(characterOriginList.size());
		System.out.println(randomOrigin1);
		System.out.println(randomOrigin2);

	}
}
