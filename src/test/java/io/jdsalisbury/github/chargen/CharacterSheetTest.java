package io.jdsalisbury.github.chargen;

import java.util.List;

import org.junit.Test;

public class CharacterSheetTest {

	List<GamaOrigin> characterOriginList = FileReader.readCharsFromFile("gammaWorldCharSheet.csv");

	@Test
	public void shouldGiveOneRandomOrigin() {

	}

}
